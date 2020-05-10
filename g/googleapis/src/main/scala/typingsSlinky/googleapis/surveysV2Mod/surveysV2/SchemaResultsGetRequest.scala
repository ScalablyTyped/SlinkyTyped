package typingsSlinky.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResultsGetRequest extends js.Object {
  var resultMask: js.UndefOr[SchemaResultsMask] = js.native
}

object SchemaResultsGetRequest {
  @scala.inline
  def apply(): SchemaResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsGetRequest]
  }
  @scala.inline
  implicit class SchemaResultsGetRequestOps[Self <: SchemaResultsGetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultMask(value: SchemaResultsMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultMask")(js.undefined)
        ret
    }
  }
  
}

