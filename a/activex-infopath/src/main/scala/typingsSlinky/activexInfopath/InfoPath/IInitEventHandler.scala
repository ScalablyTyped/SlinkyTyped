package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInitEventHandler extends js.Object {
  @JSName("InfoPath.IInitEventHandler_typekey")
  var InfoPathDotIInitEventHandler_typekey: IInitEventHandler = js.native
  def InitEventHandler(punkSender: js.Any, pDocument: _XDocument, pROMode: XdReadOnlyViewMode): Unit = js.native
}

object IInitEventHandler {
  @scala.inline
  def apply(
    InfoPathDotIInitEventHandler_typekey: IInitEventHandler,
    InitEventHandler: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit
  ): IInitEventHandler = {
    val __obj = js.Dynamic.literal(InitEventHandler = js.Any.fromFunction3(InitEventHandler))
    __obj.updateDynamic("InfoPath.IInitEventHandler_typekey")(InfoPathDotIInitEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitEventHandler]
  }
  @scala.inline
  implicit class IInitEventHandlerOps[Self <: IInitEventHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotIInitEventHandler_typekey(value: IInitEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.IInitEventHandler_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitEventHandler(value: (js.Any, _XDocument, XdReadOnlyViewMode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitEventHandler")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

