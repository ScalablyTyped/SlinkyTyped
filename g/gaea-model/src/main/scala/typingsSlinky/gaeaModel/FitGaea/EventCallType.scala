package typingsSlinky.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCallType extends js.Object {
  // 调用函数名称
  var functionName: String = js.native
  // 调用参数
  var param: js.UndefOr[js.Array[EventCallTypeParam]] = js.native
}

object EventCallType {
  @scala.inline
  def apply(functionName: String): EventCallType = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCallType]
  }
  @scala.inline
  implicit class EventCallTypeOps[Self <: EventCallType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: js.Array[EventCallTypeParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("param")(js.undefined)
        ret
    }
  }
  
}

