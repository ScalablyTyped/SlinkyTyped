package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.CarouselOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typingsSlinky.materializeDashCss.M.Carousel

/* static members */
@JSImport("materialize-css", "Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Carousel] = js.native
  def init(els: MElements, options: Partial[CarouselOptions]): js.Array[typingsSlinky.materializeDashCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Carousel = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[CarouselOptions]): typingsSlinky.materializeDashCss.M.Carousel = js.native
}

