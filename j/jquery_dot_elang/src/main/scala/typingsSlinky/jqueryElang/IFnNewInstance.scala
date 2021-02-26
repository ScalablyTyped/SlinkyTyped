package typingsSlinky.jqueryElang

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interfaces for jQuery.fn.__plugin
@js.native
trait IFnNewInstance extends StObject {
  
  def createInstance(el: HTMLElement, options: js.Any, pluginName: String): JQuery[HTMLElement] = js.native
}
object IFnNewInstance {
  
  @scala.inline
  def apply(createInstance: (HTMLElement, js.Any, String) => JQuery[HTMLElement]): IFnNewInstance = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction3(createInstance))
    __obj.asInstanceOf[IFnNewInstance]
  }
  
  @scala.inline
  implicit class IFnNewInstanceMutableBuilder[Self <: IFnNewInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInstance(value: (HTMLElement, js.Any, String) => JQuery[HTMLElement]): Self = StObject.set(x, "createInstance", js.Any.fromFunction3(value))
  }
}
