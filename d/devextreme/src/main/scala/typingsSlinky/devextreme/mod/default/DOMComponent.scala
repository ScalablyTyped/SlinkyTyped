package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Device
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "DOMComponent")
@js.native
class DOMComponent protected ()
  extends typingsSlinky.devextreme.mod.DevExpress.DOMComponent {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(
    element: JQuery,
    options: DOMComponentOptions[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
  def this(
    element: Element,
    options: DOMComponentOptions[typingsSlinky.devextreme.mod.DevExpress.DOMComponent]
  ) = this()
}

/* static members */
@JSImport("devextreme", "DOMComponent")
@js.native
object DOMComponent extends js.Object {
  /** @name DOMComponent.defaultOptions(rule) */
  def defaultOptions(rule: Device): Unit = js.native
  def getInstance(element: JQuery): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
  /** @name DOMComponent.getInstance(element) */
  def getInstance(element: Element): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
}

