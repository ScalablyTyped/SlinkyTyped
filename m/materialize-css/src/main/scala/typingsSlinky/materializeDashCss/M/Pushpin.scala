package typingsSlinky.materializeDashCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Pushpin")
@js.native
class Pushpin () extends Component[PushpinOptions] {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double = js.native
}

/* static members */
@JSGlobal("M.Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[Pushpin] = js.native
  def init(els: MElements, options: Partial[PushpinOptions]): js.Array[Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: typingsSlinky.std.Element): Pushpin = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[PushpinOptions]): Pushpin = js.native
}

