package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialSlider.adapterMod.MDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object slider extends js.Object {
  @js.native
  class MDCSlider ()
    extends typingsSlinky.atMaterialSlider.atMaterialSliderMod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typingsSlinky.atMaterialSlider.atMaterialSliderMod.MDCSliderFoundation
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialSlider.atMaterialSliderMod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typingsSlinky.atMaterialSlider.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialSlider.constantsMod.strings = js.native
  }
  
}

