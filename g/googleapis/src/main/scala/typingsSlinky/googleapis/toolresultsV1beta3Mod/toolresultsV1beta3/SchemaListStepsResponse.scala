package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for StepService.List.
  */
@js.native
trait SchemaListStepsResponse extends js.Object {
  /**
    * A continuation token to resume the query at the next item.  If set,
    * indicates that there are more steps to read, by calling list again with
    * this value in the page_token field.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Steps.
    */
  var steps: js.UndefOr[js.Array[SchemaStep]] = js.native
}

object SchemaListStepsResponse {
  @scala.inline
  def apply(): SchemaListStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStepsResponse]
  }
  @scala.inline
  implicit class SchemaListStepsResponseOps[Self <: SchemaListStepsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[SchemaStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

