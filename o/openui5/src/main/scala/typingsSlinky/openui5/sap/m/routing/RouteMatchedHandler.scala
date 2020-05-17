package typingsSlinky.openui5.sap.m.routing

import typingsSlinky.openui5.sap.ui.base.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteMatchedHandler extends js.Object {
  /**
    * Removes the routeMatchedHandler from the Router
    * @returns for chaining
    */
  def destroy(): RouteMatchedHandler = js.native
  /**
    * Gets if a navigation should close dialogs
    * @returns a flag indication if dialogs will be closed
    */
  def getCloseDialogs(): Boolean = js.native
  /**
    * Returns a metadata object for class sap.m.routing.RouteMatchedHandler.
    * @returns Metadata object describing this class
    */
  def getMetadata(): Metadata = js.native
  /**
    * Sets if a navigation should close dialogs
    * @param bCloseDialogs close dialogs if true
    * @returns for chaining
    */
  def setCloseDialogs(bCloseDialogs: Boolean): RouteMatchedHandler = js.native
}

object RouteMatchedHandler {
  @scala.inline
  def apply(
    destroy: () => RouteMatchedHandler,
    getCloseDialogs: () => Boolean,
    getMetadata: () => Metadata,
    setCloseDialogs: Boolean => RouteMatchedHandler
  ): RouteMatchedHandler = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCloseDialogs = js.Any.fromFunction0(getCloseDialogs), getMetadata = js.Any.fromFunction0(getMetadata), setCloseDialogs = js.Any.fromFunction1(setCloseDialogs))
    __obj.asInstanceOf[RouteMatchedHandler]
  }
  @scala.inline
  implicit class RouteMatchedHandlerOps[Self <: RouteMatchedHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => RouteMatchedHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
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
    def withSetCloseDialogs(value: Boolean => RouteMatchedHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCloseDialogs")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

