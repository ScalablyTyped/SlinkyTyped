package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.ej.slider.sliderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slider_ extends Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the slider
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the slider
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** To get value from slider handle
    * @returns {number}
    */
  def getValue(): Double = js.native
  
  @JSName("model")
  var model_Slider_ : Model = js.native
  
  /** To set value to slider handle.By default animation is false while set the value. If you want to enable the animation, pass the enableAnimation as true to this method.
    * @returns {void}
    */
  def setValue(): Unit = js.native
}
object Slider_ {
  
  @js.native
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns slider id.
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns true if event triggered by interaction else returns false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the slider model.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the slider value.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the slider model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the slider model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Specifies the allowMouseWheel of the slider.
      * @Default {false}
      */
    var allowMouseWheel: js.UndefOr[Boolean] = js.native
    
    /** Specifies the animationSpeed of the slider.
      * @Default {500}
      */
    var animationSpeed: js.UndefOr[Double] = js.native
    
    /** Fires once Slider control value is changed successfully.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
    
    /** Fires once Slider control has been created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Specify the CSS class to slider to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Fires when Slider control has been destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Specifies the animation behavior of the slider.
      * @Default {true}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.native
    
    /** Specifies the Right to Left Direction of the slider.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** Specifies the state of the slider.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** Specifies the height of the slider.
      * @Default {14}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Specifies the HTML Attributes of the ejSlider.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Specifies the incremental step value of the slider.
      * @Default {1}
      */
    var incrementStep: js.UndefOr[Double] = js.native
    
    /** Specifies the distance between two major (large) ticks from the scale of the slider.
      * @Default {10}
      */
    var largeStep: js.UndefOr[Double] = js.native
    
    /** Specifies the ending value of the slider.
      * @Default {100}
      */
    var maxValue: js.UndefOr[Double] = js.native
    
    /** Specifies the starting value of the slider.
      * @Default {0}
      */
    var minValue: js.UndefOr[Double] = js.native
    
    /** Specifies the orientation of the slider.
      * @Default {ej.orientation.Horizontal}
      */
    var orientation: js.UndefOr[Orientation | String] = js.native
    
    /** Specifies the readOnly of the slider.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
      */
    var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.native
    
    /** Shows/Hides the increment and decrement buttons of the slider.
      * @Default {false}
      */
    var showButtons: js.UndefOr[Boolean] = js.native
    
    /** Specifies the rounded corner behavior for slider.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.native
    
    /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
      * @Default {false}
      */
    var showScale: js.UndefOr[Boolean] = js.native
    
    /** Specifies the small ticks from the scale of the slider.
      * @Default {true}
      */
    var showSmallTicks: js.UndefOr[Boolean] = js.native
    
    /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Fires once Slider control is sliding successfully.
      */
    var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.native
    
    /** Specifies the sliderType of the slider.
      * @Default {ej.SliderType.Default}
      */
    var sliderType: js.UndefOr[typingsSlinky.ejWebAll.ej.slider.sliderType | String] = js.native
    
    /** Specifies the distance between two minor (small) ticks from the scale of the slider.
      * @Default {1}
      */
    var smallStep: js.UndefOr[Double] = js.native
    
    /** Fires once Slider control is started successfully.
      */
    var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
    
    /** Fires when Slider control is stopped successfully.
      */
    var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
    
    /** Fires when display the custom tooltip.
      */
    var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.native
    
    /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.native
    
    /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
      * @Default {[minValue,maxValue]}
      */
    var values: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies the width of the slider.
      * @Default {100%}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.Slider_.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.Slider_.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.Slider_.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMouseWheel(value: Boolean): Self = StObject.set(x, "allowMouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMouseWheelUndefined: Self = StObject.set(x, "allowMouseWheel", js.undefined)
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIncrementStep(value: Double): Self = StObject.set(x, "incrementStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementStepUndefined: Self = StObject.set(x, "incrementStep", js.undefined)
      
      @scala.inline
      def setLargeStep(value: Double): Self = StObject.set(x, "largeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeStepUndefined: Self = StObject.set(x, "largeStep", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRenderingTicks(value: /* e */ RenderingTicksEventArgs => Unit): Self = StObject.set(x, "renderingTicks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderingTicksUndefined: Self = StObject.set(x, "renderingTicks", js.undefined)
      
      @scala.inline
      def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setShowScale(value: Boolean): Self = StObject.set(x, "showScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowScaleUndefined: Self = StObject.set(x, "showScale", js.undefined)
      
      @scala.inline
      def setShowSmallTicks(value: Boolean): Self = StObject.set(x, "showSmallTicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSmallTicksUndefined: Self = StObject.set(x, "showSmallTicks", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setSlide(value: /* e */ SlideEventArgs => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setSliderType(value: sliderType | String): Self = StObject.set(x, "sliderType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderTypeUndefined: Self = StObject.set(x, "sliderType", js.undefined)
      
      @scala.inline
      def setSmallStep(value: Double): Self = StObject.set(x, "smallStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallStepUndefined: Self = StObject.set(x, "smallStep", js.undefined)
      
      @scala.inline
      def setStart(value: /* e */ StartEventArgs => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStop(value: /* e */ StopEventArgs => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setTooltipChange(value: /* e */ TooltipChangeEventArgs => Unit): Self = StObject.set(x, "tooltipChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipChangeUndefined: Self = StObject.set(x, "tooltipChange", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait RenderingTicksEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the current Li element
      */
    var tick: js.UndefOr[js.Any] = js.native
    
    /** returns slider tick value
      */
    var value: js.UndefOr[Double] = js.native
    
    /** returns the value type either tooltip or label value
      */
    var valueType: js.UndefOr[String] = js.native
  }
  object RenderingTicksEventArgs {
    
    @scala.inline
    def apply(): RenderingTicksEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderingTicksEventArgs]
    }
    
    @scala.inline
    implicit class RenderingTicksEventArgsMutableBuilder[Self <: RenderingTicksEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setTick(value: js.Any): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SlideEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the slider model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.native
  }
  object SlideEventArgs {
    
    @scala.inline
    def apply(): SlideEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideEventArgs]
    }
    
    @scala.inline
    implicit class SlideEventArgsMutableBuilder[Self <: SlideEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait StartEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the slider model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.native
  }
  object StartEventArgs {
    
    @scala.inline
    def apply(): StartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartEventArgs]
    }
    
    @scala.inline
    implicit class StartEventArgsMutableBuilder[Self <: StartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait StopEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns slider id
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns the slider model
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the slider value
      */
    var value: js.UndefOr[Double] = js.native
  }
  object StopEventArgs {
    
    @scala.inline
    def apply(): StopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopEventArgs]
    }
    
    @scala.inline
    implicit class StopEventArgsMutableBuilder[Self <: StopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TooltipChangeEventArgs extends StObject {
    
    /** returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns slider id.
      */
    var id: js.UndefOr[String] = js.native
    
    /** returns true if event triggered by interaction else returns false.
      */
    var isInteraction: js.UndefOr[Boolean] = js.native
    
    /** returns the slider model.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** returns current handle number or index
      */
    var sliderIndex: js.UndefOr[Double] = js.native
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** returns the slider value.
      */
    var value: js.UndefOr[Double] = js.native
  }
  object TooltipChangeEventArgs {
    
    @scala.inline
    def apply(): TooltipChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipChangeEventArgs]
    }
    
    @scala.inline
    implicit class TooltipChangeEventArgsMutableBuilder[Self <: TooltipChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsInteraction(value: Boolean): Self = StObject.set(x, "isInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractionUndefined: Self = StObject.set(x, "isInteraction", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setSliderIndex(value: Double): Self = StObject.set(x, "sliderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderIndexUndefined: Self = StObject.set(x, "sliderIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
