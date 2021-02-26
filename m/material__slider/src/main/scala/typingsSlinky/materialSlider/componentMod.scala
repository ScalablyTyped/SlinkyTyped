package typingsSlinky.materialSlider

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialSlider.anon.SkipInitialUIUpdate
import typingsSlinky.materialSlider.foundationMod.MDCSliderFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/slider/component", "MDCSlider")
  @js.native
  class MDCSlider protected () extends MDCComponent[MDCSliderFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSliderFoundation, args: js.Any*) = this()
    
    /** @return Slider disabled state. */
    def getDisabled(): Boolean = js.native
    
    def getValue(): Double = js.native
    
    def getValueStart(): Double = js.native
    
    /**
      * Initializes component, with the following options:
      * - `skipInitialUIUpdate`: Whether to skip updating the UI when initially
      *   syncing with the DOM. This should be enabled when the slider position
      *   is set before component initialization.
      */
    def initialize(): Unit = js.native
    def initialize(hasSkipInitialUIUpdate: SkipInitialUIUpdate): Unit = js.native
    
    /** Redraws UI based on DOM (e.g. element dimensions, RTL). */
    def layout(): Unit = js.native
    
    @JSName("root")
    var root_MDCSlider: HTMLElement = js.native
    
    /** Sets slider disabled state. */
    def setDisabled(disabled: Boolean): Unit = js.native
    
    def setValue(value: Double): Unit = js.native
    
    def setValueStart(valueStart: Double): Unit = js.native
    
    /**
      * Sets a function that maps the slider value to the value of the
      * `aria-valuetext` attribute on the thumb element.
      */
    def setValueToAriaValueTextFn(): Unit = js.native
    def setValueToAriaValueTextFn(mapFn: js.Function1[/* value */ Double, String]): Unit = js.native
  }
  /* static members */
  object MDCSlider {
    
    @JSImport("@material/slider/component", "MDCSlider.attachTo")
    @js.native
    def attachTo(root: Element): MDCSlider = js.native
    @JSImport("@material/slider/component", "MDCSlider.attachTo")
    @js.native
    def attachTo(root: Element, options: SkipInitialUIUpdate): MDCSlider = js.native
  }
}
