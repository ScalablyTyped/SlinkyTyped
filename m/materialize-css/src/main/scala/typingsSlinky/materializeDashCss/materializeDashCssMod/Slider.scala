package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.SliderOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typingsSlinky.materializeDashCss.M.Slider

/* static members */
@JSImport("materialize-css", "Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Slider] = js.native
  def init(els: MElements, options: Partial[SliderOptions]): js.Array[typingsSlinky.materializeDashCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Slider = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[SliderOptions]): typingsSlinky.materializeDashCss.M.Slider = js.native
}

