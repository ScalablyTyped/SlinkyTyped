package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonDevice
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
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
  /** Specifies the device-dependent default configuration options for this component. */
  def defaultOptions(rule: AnonDevice): Unit = js.native
  def getInstance(element: JQuery): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
  /** Gets the instance of a widget found using its DOM node. */
  def getInstance(element: typingsSlinky.std.Element): typingsSlinky.devextreme.mod.DevExpress.DOMComponent = js.native
}

