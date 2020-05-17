package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientSideParametersModel extends js.Object {
  var tabInfo: ASPxClientDocumentPreviewTab = js.native
  def serializeParameters(): Unit = js.native
  def submit(): Unit = js.native
}

object ASPxClientSideParametersModel {
  @scala.inline
  def apply(serializeParameters: () => Unit, submit: () => Unit, tabInfo: ASPxClientDocumentPreviewTab): ASPxClientSideParametersModel = {
    val __obj = js.Dynamic.literal(serializeParameters = js.Any.fromFunction0(serializeParameters), submit = js.Any.fromFunction0(submit), tabInfo = tabInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSideParametersModel]
  }
  @scala.inline
  implicit class ASPxClientSideParametersModelOps[Self <: ASPxClientSideParametersModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializeParameters(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTabInfo(value: ASPxClientDocumentPreviewTab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

