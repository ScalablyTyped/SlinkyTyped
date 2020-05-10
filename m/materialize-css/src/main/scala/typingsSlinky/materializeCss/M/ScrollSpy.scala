package typingsSlinky.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialScrollSpyOptions
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
  def init(els: MElements, options: PartialScrollSpyOptions): js.Array[ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): ScrollSpy = js.native
  def init(els: Element, options: PartialScrollSpyOptions): ScrollSpy = js.native
}

