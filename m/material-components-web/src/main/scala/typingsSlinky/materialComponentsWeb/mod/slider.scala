package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSlider.adapterMod.MDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object slider extends js.Object {
  @js.native
  class MDCSlider ()
    extends typingsSlinky.materialSlider.mod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typingsSlinky.materialSlider.mod.MDCSliderFoundation
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialSlider.mod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typingsSlinky.materialSlider.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialSlider.constantsMod.strings = js.native
  }
  
}

