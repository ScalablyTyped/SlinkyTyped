package typingsSlinky.inboxsdk.mod.Router

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRouteView extends RouteView {
  def getElement(): HTMLElement = js.native
  def setFullWidth(fullWidth: Boolean): Unit = js.native
}

object CustomRouteView {
  @scala.inline
  def apply(
    destroyed: Boolean,
    getElement: () => HTMLElement,
    getParams: () => RouteParams,
    getRouteID: () => String,
    getRouteType: () => RouteTypes,
    on: (destroy, js.Function0[Unit]) => Unit,
    setFullWidth: Boolean => Unit
  ): CustomRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getParams = js.Any.fromFunction0(getParams), getRouteID = js.Any.fromFunction0(getRouteID), getRouteType = js.Any.fromFunction0(getRouteType), on = js.Any.fromFunction2(on), setFullWidth = js.Any.fromFunction1(setFullWidth))
    __obj.asInstanceOf[CustomRouteView]
  }
  @scala.inline
  implicit class CustomRouteViewOps[Self <: CustomRouteView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElement(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFullWidth(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFullWidth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

