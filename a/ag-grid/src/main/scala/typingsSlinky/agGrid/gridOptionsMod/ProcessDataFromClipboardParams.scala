package typingsSlinky.agGrid.gridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessDataFromClipboardParams extends js.Object {
  var data: js.Array[js.Array[String]] = js.native
}

object ProcessDataFromClipboardParams {
  @scala.inline
  def apply(data: js.Array[js.Array[String]]): ProcessDataFromClipboardParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDataFromClipboardParams]
  }
  @scala.inline
  implicit class ProcessDataFromClipboardParamsOps[Self <: ProcessDataFromClipboardParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

