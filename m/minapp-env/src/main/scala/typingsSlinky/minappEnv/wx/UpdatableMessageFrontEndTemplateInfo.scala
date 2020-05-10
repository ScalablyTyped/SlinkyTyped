package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 动态消息的模板信息
  *
  * 最低基础库： `2.4.0` */
@js.native
trait UpdatableMessageFrontEndTemplateInfo extends js.Object {
  /** 参数列表 */
  var parameterList: UpdatableMessageFrontEndParameter = js.native
}

object UpdatableMessageFrontEndTemplateInfo {
  @scala.inline
  def apply(parameterList: UpdatableMessageFrontEndParameter): UpdatableMessageFrontEndTemplateInfo = {
    val __obj = js.Dynamic.literal(parameterList = parameterList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableMessageFrontEndTemplateInfo]
  }
  @scala.inline
  implicit class UpdatableMessageFrontEndTemplateInfoOps[Self <: UpdatableMessageFrontEndTemplateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterList(value: UpdatableMessageFrontEndParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

