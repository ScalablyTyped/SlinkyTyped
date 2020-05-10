package typingsSlinky.jsforce.chatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestParams extends RequestParams {
  var richInput: js.UndefOr[String] = js.native
}

object BatchRequestParams {
  @scala.inline
  def apply(method: String, url: String): BatchRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestParams]
  }
  @scala.inline
  implicit class BatchRequestParamsOps[Self <: BatchRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRichInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRichInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richInput")(js.undefined)
        ret
    }
  }
  
}

