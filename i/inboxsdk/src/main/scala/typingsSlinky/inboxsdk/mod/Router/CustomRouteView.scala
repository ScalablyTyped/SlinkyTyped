package typingsSlinky.inboxsdk.mod.Router

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CustomRouteViewMutableBuilder[Self <: CustomRouteView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFullWidth(value: Boolean => Unit): Self = StObject.set(x, "setFullWidth", js.Any.fromFunction1(value))
  }
}
