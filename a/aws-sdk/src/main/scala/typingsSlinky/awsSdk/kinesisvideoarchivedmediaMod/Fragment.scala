package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  /**
    * The playback duration or other time value associated with the fragment.
    */
  var FragmentLengthInMilliseconds: js.UndefOr[Long] = js.native
  /**
    * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
    */
  var FragmentNumber: js.UndefOr[String] = js.native
  /**
    * The total fragment size, including information about the fragment and contained media data.
    */
  var FragmentSizeInBytes: js.UndefOr[Long] = js.native
  /**
    * The timestamp from the producer corresponding to the fragment.
    */
  var ProducerTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp from the AWS server corresponding to the fragment.
    */
  var ServerTimestamp: js.UndefOr[js.Date] = js.native
}

object Fragment {
  @scala.inline
  def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentLengthInMilliseconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLengthInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentLengthInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentLengthInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentSizeInBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragmentSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProducerTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProducerTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withServerTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerTimestamp")(js.undefined)
        ret
    }
  }
  
}

