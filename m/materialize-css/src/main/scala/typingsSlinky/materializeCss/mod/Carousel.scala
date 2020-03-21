package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialCarouselOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typingsSlinky.materializeCss.M.Carousel

/* static members */
@JSImport("materialize-css", "Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Carousel] = js.native
  def init(els: MElements, options: PartialCarouselOptions): js.Array[typingsSlinky.materializeCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Carousel = js.native
  def init(els: typingsSlinky.std.Element, options: PartialCarouselOptions): typingsSlinky.materializeCss.M.Carousel = js.native
}

