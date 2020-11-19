package typingsSlinky.materialSlider

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialSlider.adapterMod.MDCSliderAdapter
import typingsSlinky.materialSlider.anon.ACTIVE
import typingsSlinky.materialSlider.anon.ARIADISABLED
import typingsSlinky.materialSlider.anon.PAGEFACTOR
import typingsSlinky.materialSlider.anon.PartialMDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/slider/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCSliderFoundation () extends MDCFoundation[MDCSliderAdapter] {
    def this(adapter: PartialMDCSliderAdapter) = this()
    
    def getMax(): Double = js.native
    
    def getMin(): Double = js.native
    
    def getStep(): Double = js.native
    
    def getValue(): Double = js.native
    
    def isDisabled(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
    
    def setMax(max: Double): Unit = js.native
    
    def setMin(min: Double): Unit = js.native
    
    def setStep(step: Double): Unit = js.native
    
    def setValue(value: Double): Unit = js.native
    
    def setupTrackMarker(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    
    def cssClasses: ACTIVE = js.native
    
    def defaultAdapter: MDCSliderAdapter = js.native
    
    def numbers: PAGEFACTOR = js.native
    
    def strings: ARIADISABLED = js.native
  }
  
  @js.native
  class default () extends MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ACTIVE = js.native
    
    def defaultAdapter: MDCSliderAdapter = js.native
    
    def numbers: PAGEFACTOR = js.native
    
    def strings: ARIADISABLED = js.native
  }
}
