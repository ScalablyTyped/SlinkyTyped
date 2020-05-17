package typingsSlinky.openui5.sap.m.routing

import typingsSlinky.openui5.sap.ui.base.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetHandler extends js.Object {
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean = js.native
  /**
    * Returns a metadata object for class sap.m.routing.TargetHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata = js.native
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): TargetHandler = js.native
}

object TargetHandler {
  @scala.inline
  def apply(
    getCloseDialogs: () => Boolean,
    getMetadata: () => Metadata,
    setCloseDialogs: Boolean => TargetHandler
  ): TargetHandler = {
    val __obj = js.Dynamic.literal(getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
    __obj.asInstanceOf[TargetHandler]
  }
  @scala.inline
  implicit class TargetHandlerOps[Self <: TargetHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCloseDialogs(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCloseDialogs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: () => Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCloseDialogs(value: Boolean => TargetHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCloseDialogs")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

