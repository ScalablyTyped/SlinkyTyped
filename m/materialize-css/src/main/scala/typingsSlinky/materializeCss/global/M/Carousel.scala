package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialCarouselOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Carousel")
@js.native
class Carousel ()
  extends typingsSlinky.materializeCss.M.Carousel

/* static members */
@JSGlobal("M.Carousel")
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
  def init(els: Element): typingsSlinky.materializeCss.M.Carousel = js.native
  def init(els: Element, options: PartialCarouselOptions): typingsSlinky.materializeCss.M.Carousel = js.native
}

