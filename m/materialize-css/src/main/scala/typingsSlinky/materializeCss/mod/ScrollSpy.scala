package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.ScrollSpyOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialScrollSpyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends typingsSlinky.materializeCss.M.Component[ScrollSpyOptions]

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.ScrollSpy] = js.native
  def init(els: MElements, options: PartialScrollSpyOptions): js.Array[typingsSlinky.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: Element): typingsSlinky.materializeCss.M.ScrollSpy = js.native
  def init(els: Element, options: PartialScrollSpyOptions): typingsSlinky.materializeCss.M.ScrollSpy = js.native
}

