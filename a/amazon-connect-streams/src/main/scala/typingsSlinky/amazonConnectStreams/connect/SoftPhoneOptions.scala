package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftPhoneOptions extends js.Object {
  /*
    * Whether to display the softphone in a frame.
    */
  var allowFramedSoftphone: js.UndefOr[Boolean] = js.native
  /*
    * Whether to disable the ringtone.
    */
  var disableRingtone: js.UndefOr[Boolean] = js.native
  /*
    * A URL for a custom ringtone.
    */
  var ringtoneUrl: js.UndefOr[String] = js.native
}

object SoftPhoneOptions {
  @scala.inline
  def apply(): SoftPhoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftPhoneOptions]
  }
  @scala.inline
  implicit class SoftPhoneOptionsOps[Self <: SoftPhoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFramedSoftphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFramedSoftphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFramedSoftphone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFramedSoftphone")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRingtone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRingtone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRingtone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRingtone")(js.undefined)
        ret
    }
    @scala.inline
    def withRingtoneUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ringtoneUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRingtoneUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ringtoneUrl")(js.undefined)
        ret
    }
  }
  
}

