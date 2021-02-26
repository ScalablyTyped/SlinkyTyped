package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialSlider.anon.PartialMDCSliderAdapter
import typingsSlinky.materialSlider.anon.SkipInitialUIUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slider {
  
  @JSImport("material-components-web", "slider.MDCSlider")
  @js.native
  class MDCSlider protected ()
    extends typingsSlinky.materialSlider.mod.MDCSlider {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSlider.foundationMod.MDCSliderFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSlider {
    
    @JSImport("material-components-web", "slider.MDCSlider.attachTo")
    @js.native
    def attachTo(root: Element): typingsSlinky.materialSlider.componentMod.MDCSlider = js.native
    @JSImport("material-components-web", "slider.MDCSlider.attachTo")
    @js.native
    def attachTo(root: Element, options: SkipInitialUIUpdate): typingsSlinky.materialSlider.componentMod.MDCSlider = js.native
  }
  
  @JSImport("material-components-web", "slider.MDCSliderFoundation")
  @js.native
  class MDCSliderFoundation ()
    extends typingsSlinky.materialSlider.mod.MDCSliderFoundation {
    def this(adapter: PartialMDCSliderAdapter) = this()
  }
  /* static members */
  object MDCSliderFoundation {
    
    @JSImport("material-components-web", "slider.MDCSliderFoundation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.MDCSliderFoundation.SUPPORTS_POINTER_EVENTS")
    @js.native
    def SUPPORTS_POINTER_EVENTS: Boolean = js.native
    @scala.inline
    def SUPPORTS_POINTER_EVENTS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_POINTER_EVENTS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("material-components-web", "slider.Thumb")
  @js.native
  object Thumb extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialSlider.typesMod.Thumb with Double] = js.native
    
    /* 2 */ val END: typingsSlinky.materialSlider.typesMod.Thumb.END with Double = js.native
    
    /* 1 */ val START: typingsSlinky.materialSlider.typesMod.Thumb.START with Double = js.native
  }
  
  @JSImport("material-components-web", "slider.TickMark")
  @js.native
  object TickMark extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialSlider.typesMod.TickMark with Double] = js.native
    
    /* 0 */ val ACTIVE: typingsSlinky.materialSlider.typesMod.TickMark.ACTIVE with Double = js.native
    
    /* 1 */ val INACTIVE: typingsSlinky.materialSlider.typesMod.TickMark.INACTIVE with Double = js.native
  }
  
  object attributes {
    
    @JSImport("material-components-web", "slider.attributes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.attributes.ARIA_DISABLED")
    @js.native
    def ARIA_DISABLED: String = js.native
    @scala.inline
    def ARIA_DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.ARIA_VALUEMAX")
    @js.native
    def ARIA_VALUEMAX: String = js.native
    @scala.inline
    def ARIA_VALUEMAX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMAX")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.ARIA_VALUEMIN")
    @js.native
    def ARIA_VALUEMIN: String = js.native
    @scala.inline
    def ARIA_VALUEMIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMIN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.ARIA_VALUENOW")
    @js.native
    def ARIA_VALUENOW: String = js.native
    @scala.inline
    def ARIA_VALUENOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUENOW")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.ARIA_VALUETEXT")
    @js.native
    def ARIA_VALUETEXT: String = js.native
    @scala.inline
    def ARIA_VALUETEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUETEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.DATA_ATTR_BIG_STEP")
    @js.native
    def DATA_ATTR_BIG_STEP: String = js.native
    @scala.inline
    def DATA_ATTR_BIG_STEP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ATTR_BIG_STEP")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.attributes.DATA_ATTR_STEP")
    @js.native
    def DATA_ATTR_STEP: String = js.native
    @scala.inline
    def DATA_ATTR_STEP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ATTR_STEP")(x.asInstanceOf[js.Any])
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "slider.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    @scala.inline
    def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.DISCRETE")
    @js.native
    def DISCRETE: String = js.native
    @scala.inline
    def DISCRETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCRETE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.RANGE")
    @js.native
    def RANGE: String = js.native
    @scala.inline
    def RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB")
    @js.native
    def THUMB: String = js.native
    @scala.inline
    def THUMB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_KNOB")
    @js.native
    def THUMB_KNOB: String = js.native
    @scala.inline
    def THUMB_KNOB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_KNOB")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_TOP")
    @js.native
    def THUMB_TOP: String = js.native
    @scala.inline
    def THUMB_TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.THUMB_WITH_INDICATOR")
    @js.native
    def THUMB_WITH_INDICATOR: String = js.native
    @scala.inline
    def THUMB_WITH_INDICATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_WITH_INDICATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARKS")
    @js.native
    def TICK_MARKS: String = js.native
    @scala.inline
    def TICK_MARKS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARKS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARKS_CONTAINER")
    @js.native
    def TICK_MARKS_CONTAINER: String = js.native
    @scala.inline
    def TICK_MARKS_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARKS_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARK_ACTIVE")
    @js.native
    def TICK_MARK_ACTIVE: String = js.native
    @scala.inline
    def TICK_MARK_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TICK_MARK_INACTIVE")
    @js.native
    def TICK_MARK_INACTIVE: String = js.native
    @scala.inline
    def TICK_MARK_INACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_INACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TRACK")
    @js.native
    def TRACK: String = js.native
    @scala.inline
    def TRACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACK")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.TRACK_ACTIVE")
    @js.native
    def TRACK_ACTIVE: String = js.native
    @scala.inline
    def TRACK_ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACK_ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.cssClasses.VALUE_INDICATOR_TEXT")
    @js.native
    def VALUE_INDICATOR_TEXT: String = js.native
    @scala.inline
    def VALUE_INDICATOR_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_INDICATOR_TEXT")(x.asInstanceOf[js.Any])
  }
  
  object events {
    
    @JSImport("material-components-web", "slider.events")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.events.CHANGE")
    @js.native
    def CHANGE: String = js.native
    @scala.inline
    def CHANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.events.INPUT")
    @js.native
    def INPUT: String = js.native
    @scala.inline
    def INPUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "slider.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "slider.numbers.BIG_STEP_FACTOR")
    @js.native
    def BIG_STEP_FACTOR: Double = js.native
    @scala.inline
    def BIG_STEP_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIG_STEP_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "slider.numbers.THUMB_UPDATE_MIN_PX")
    @js.native
    def THUMB_UPDATE_MIN_PX: Double = js.native
    @scala.inline
    def THUMB_UPDATE_MIN_PX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMB_UPDATE_MIN_PX")(x.asInstanceOf[js.Any])
  }
}
