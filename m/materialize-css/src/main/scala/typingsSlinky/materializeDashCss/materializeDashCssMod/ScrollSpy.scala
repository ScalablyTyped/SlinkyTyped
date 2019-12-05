package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.ScrollSpyOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy ()
  extends typingsSlinky.materializeDashCss.M.ScrollSpy

/* static members */
@JSImport("materialize-css", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.ScrollSpy = js.native
  /**
    * Init ScrollSpies
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.ScrollSpy] = js.native
  def init(els: MElements, options: Partial[ScrollSpyOptions]): js.Array[typingsSlinky.materializeDashCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.ScrollSpy = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[ScrollSpyOptions]): typingsSlinky.materializeDashCss.M.ScrollSpy = js.native
}

