package typingsSlinky.materializeDashCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.ScrollSpy")
@js.native
class ScrollSpy () extends Component[ScrollSpyOptions]

/* static members */
@JSGlobal("M.ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[ScrollSpy] = js.native
  def init(els: MElements, options: Partial[ScrollSpyOptions]): js.Array[ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: typingsSlinky.std.Element): ScrollSpy = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[ScrollSpyOptions]): ScrollSpy = js.native
}

