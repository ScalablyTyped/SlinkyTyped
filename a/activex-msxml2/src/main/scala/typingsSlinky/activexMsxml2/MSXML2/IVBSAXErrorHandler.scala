package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXErrorHandler interface */
@js.native
trait IVBSAXErrorHandler extends js.Object {
  @JSName("MSXML2.IVBSAXErrorHandler_typekey")
  var MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler = js.native
  /** Receive notification of a recoverable error. */
  def error(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of a non-recoverable error. */
  def fatalError(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
  /** Receive notification of an ignorable warning. */
  def ignorableWarning(oLocator: IVBSAXLocator, strErrorMessage: String, nErrorCode: Double): Unit = js.native
}

object IVBSAXErrorHandler {
  @scala.inline
  def apply(
    MSXML2DotIVBSAXErrorHandler_typekey: IVBSAXErrorHandler,
    error: (IVBSAXLocator, String, Double) => Unit,
    fatalError: (IVBSAXLocator, String, Double) => Unit,
    ignorableWarning: (IVBSAXLocator, String, Double) => Unit
  ): IVBSAXErrorHandler = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction3(error), fatalError = js.Any.fromFunction3(fatalError), ignorableWarning = js.Any.fromFunction3(ignorableWarning))
    __obj.updateDynamic("MSXML2.IVBSAXErrorHandler_typekey")(MSXML2DotIVBSAXErrorHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVBSAXErrorHandler]
  }
  @scala.inline
  implicit class IVBSAXErrorHandlerOps[Self <: IVBSAXErrorHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotIVBSAXErrorHandler_typekey(value: IVBSAXErrorHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.IVBSAXErrorHandler_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: (IVBSAXLocator, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFatalError(value: (IVBSAXLocator, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIgnorableWarning(value: (IVBSAXLocator, String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorableWarning")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

