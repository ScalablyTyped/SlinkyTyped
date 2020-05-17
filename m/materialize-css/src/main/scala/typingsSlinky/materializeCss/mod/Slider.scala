package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialSliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typingsSlinky.materializeCss.M.Slider

/* static members */
@JSImport("materialize-css", "Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Slider] = js.native
  def init(els: MElements, options: PartialSliderOptions): js.Array[typingsSlinky.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Slider = js.native
  def init(els: Element, options: PartialSliderOptions): typingsSlinky.materializeCss.M.Slider = js.native
}

