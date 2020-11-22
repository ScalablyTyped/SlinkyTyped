package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSlider.adapterMod.MDCSliderAdapter
import typingsSlinky.materialSlider.anon.PartialMDCSliderAdapter
import typingsSlinky.materialSlider.anon.SkipInitialUIUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "slider")
@js.native
object slider extends js.Object {
  
  @js.native
  class MDCSlider ()
    extends typingsSlinky.materialSlider.mod.MDCSlider
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialSlider.componentMod.MDCSlider = js.native
    def attachTo(root: Element, options: SkipInitialUIUpdate): typingsSlinky.materialSlider.componentMod.MDCSlider = js.native
  }
  
  @js.native
  class MDCSliderFoundation ()
    extends typingsSlinky.materialSlider.mod.MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    
    var SUPPORTS_POINTER_EVENTS: Boolean = js.native
    
    def defaultAdapter: MDCSliderAdapter = js.native
  }
  
  @js.native
  object Thumb extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialSlider.typesMod.Thumb with Double] = js.native
    
    /* 2 */ val END: typingsSlinky.materialSlider.typesMod.Thumb.END with Double = js.native
    
    /* 1 */ val START: typingsSlinky.materialSlider.typesMod.Thumb.START with Double = js.native
  }
  
  @js.native
  object TickMark extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialSlider.typesMod.TickMark with Double] = js.native
    
    /* 0 */ val ACTIVE: typingsSlinky.materialSlider.typesMod.TickMark.ACTIVE with Double = js.native
    
    /* 1 */ val INACTIVE: typingsSlinky.materialSlider.typesMod.TickMark.INACTIVE with Double = js.native
  }
  
  @js.native
  object attributes extends js.Object {
    
    var ARIA_DISABLED: String = js.native
    
    var ARIA_VALUEMAX: String = js.native
    
    var ARIA_VALUEMIN: String = js.native
    
    var ARIA_VALUENOW: String = js.native
    
    var ARIA_VALUETEXT: String = js.native
    
    var DATA_ATTR_BIG_STEP: String = js.native
    
    var DATA_ATTR_STEP: String = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var DISABLED: String = js.native
    
    var DISCRETE: String = js.native
    
    var RANGE: String = js.native
    
    var THUMB: String = js.native
    
    var THUMB_KNOB: String = js.native
    
    var THUMB_TOP: String = js.native
    
    var THUMB_WITH_INDICATOR: String = js.native
    
    var TICK_MARKS: String = js.native
    
    var TICK_MARKS_CONTAINER: String = js.native
    
    var TICK_MARK_ACTIVE: String = js.native
    
    var TICK_MARK_INACTIVE: String = js.native
    
    var TRACK: String = js.native
    
    var TRACK_ACTIVE: String = js.native
    
    var VALUE_INDICATOR_TEXT: String = js.native
  }
  
  @js.native
  object events extends js.Object {
    
    var CHANGE: String = js.native
    
    var INPUT: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var BIG_STEP_FACTOR: Double = js.native
    
    var THUMB_UPDATE_MIN_PX: Double = js.native
  }
}
