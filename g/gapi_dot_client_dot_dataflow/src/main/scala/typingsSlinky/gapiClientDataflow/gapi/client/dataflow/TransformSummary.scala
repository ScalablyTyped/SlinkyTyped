package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformSummary extends js.Object {
  /** Transform-specific display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.native
  /** SDK generated id of this transform instance. */
  var id: js.UndefOr[String] = js.native
  /** User names for all collection inputs to this transform. */
  var inputCollectionName: js.UndefOr[js.Array[String]] = js.native
  /** Type of transform. */
  var kind: js.UndefOr[String] = js.native
  /** User provided name for this transform instance. */
  var name: js.UndefOr[String] = js.native
  /** User  names for all collection outputs to this transform. */
  var outputCollectionName: js.UndefOr[js.Array[String]] = js.native
}

object TransformSummary {
  @scala.inline
  def apply(): TransformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformSummary]
  }
  @scala.inline
  implicit class TransformSummaryOps[Self <: TransformSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayData(value: js.Array[DisplayData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputCollectionName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputCollectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputCollectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputCollectionName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCollectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputCollectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputCollectionName")(js.undefined)
        ret
    }
  }
  
}

