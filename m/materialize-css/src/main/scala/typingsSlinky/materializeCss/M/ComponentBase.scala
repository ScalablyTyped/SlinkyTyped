package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ComponentBase")
@js.native
abstract class ComponentBase[TOptions] () extends js.Object {
  def this(options: Partial[TOptions]) = this()
  /**
    * The DOM element the plugin was initialized with
    */
  var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  var options: TOptions = js.native
}

