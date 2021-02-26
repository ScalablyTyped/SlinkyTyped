package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Device
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import typingsSlinky.devextreme.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.DOMComponent")
@js.native
class DOMComponent protected ()
  extends typingsSlinky.devextreme.mod.DevExpress.DOMComponent {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(
    element: Element,
    options: DOMComponentOptions[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
  def this(
    element: JQuery,
    options: DOMComponentOptions[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
}
/* static members */
object DOMComponent {
  
  /**
    * [descr:DOMComponent.defaultOptions(rule)]
    */
  @JSImport("devextreme", "default.DOMComponent.defaultOptions")
  @js.native
  def defaultOptions(rule: Device): Unit = js.native
  
  /**
    * [descr:DOMComponent.getInstance(element)]
    */
  @JSImport("devextreme", "default.DOMComponent.getInstance")
  @js.native
  def getInstance(element: Element): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
  @JSImport("devextreme", "default.DOMComponent.getInstance")
  @js.native
  def getInstance(element: JQuery): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
}
