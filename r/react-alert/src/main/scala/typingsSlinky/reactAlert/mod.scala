package typingsSlinky.reactAlert

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactAlert.anon.Alert
import typingsSlinky.reactAlert.reactAlertStrings.`bottom center`
import typingsSlinky.reactAlert.reactAlertStrings.`bottom left`
import typingsSlinky.reactAlert.reactAlertStrings.`bottom right`
import typingsSlinky.reactAlert.reactAlertStrings.`middle left`
import typingsSlinky.reactAlert.reactAlertStrings.`middle right`
import typingsSlinky.reactAlert.reactAlertStrings.`top center`
import typingsSlinky.reactAlert.reactAlertStrings.`top left`
import typingsSlinky.reactAlert.reactAlertStrings.`top right`
import typingsSlinky.reactAlert.reactAlertStrings.alert
import typingsSlinky.reactAlert.reactAlertStrings.error
import typingsSlinky.reactAlert.reactAlertStrings.fade
import typingsSlinky.reactAlert.reactAlertStrings.info
import typingsSlinky.reactAlert.reactAlertStrings.middle
import typingsSlinky.reactAlert.reactAlertStrings.scale
import typingsSlinky.reactAlert.reactAlertStrings.success
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-alert", "Provider")
  @js.native
  class Provider protected ()
    extends Component[AlertProviderProps, js.Object, js.Any] {
    def this(props: AlertProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AlertProviderProps, context: js.Any) = this()
  }
  
  @JSImport("react-alert", "positions")
  @js.native
  val positions: Positions_ = js.native
  
  @JSImport("react-alert", "transitions")
  @js.native
  val transitions: Transitions_ = js.native
  
  @JSImport("react-alert", "types")
  @js.native
  val types: Types_ = js.native
  
  @JSImport("react-alert", "useAlert")
  @js.native
  def useAlert(): AlertManager = js.native
  @JSImport("react-alert", "useAlert")
  @js.native
  def useAlert(context: Context[js.UndefOr[AlertManager]]): AlertManager = js.native
  
  @JSImport("react-alert", "withAlert")
  @js.native
  def withAlert[P /* <: Alert */](): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = js.native
  @JSImport("react-alert", "withAlert")
  @js.native
  def withAlert[P /* <: Alert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = js.native
  
  @js.native
  trait AlertComponentProps extends StObject {
    
    def close(): Unit = js.native
    
    var id: String = js.native
    
    var message: ReactElement = js.native
    
    var options: AlertCustomOptionsWithType = js.native
  }
  object AlertComponentProps {
    
    @scala.inline
    def apply(close: () => Unit, id: String, options: AlertCustomOptionsWithType): AlertComponentProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertComponentProps]
    }
    
    @scala.inline
    implicit class AlertComponentPropsMutableBuilder[Self <: AlertComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: ReactElement): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOptions(value: AlertCustomOptionsWithType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlertComponentPropsWithStyle extends AlertComponentProps {
    
    var style: CSSProperties = js.native
  }
  object AlertComponentPropsWithStyle {
    
    @scala.inline
    def apply(close: () => Unit, id: String, options: AlertCustomOptionsWithType, style: CSSProperties): AlertComponentPropsWithStyle = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertComponentPropsWithStyle]
    }
    
    @scala.inline
    implicit class AlertComponentPropsWithStyleMutableBuilder[Self <: AlertComponentPropsWithStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AlertCustomOptions extends StObject {
    
    /**
      * Callback that will be executed after this alert is removed
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback that will be executed after this alert open
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Custom timeout just for this one alert
      */
    var timeout: js.UndefOr[Double] = js.native
  }
  object AlertCustomOptions {
    
    @scala.inline
    def apply(): AlertCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCustomOptions]
    }
    
    @scala.inline
    implicit class AlertCustomOptionsMutableBuilder[Self <: AlertCustomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait AlertCustomOptionsWithType extends AlertCustomOptions {
    
    var `type`: js.UndefOr[AlertType] = js.native
  }
  object AlertCustomOptionsWithType {
    
    @scala.inline
    def apply(): AlertCustomOptionsWithType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCustomOptionsWithType]
    }
    
    @scala.inline
    implicit class AlertCustomOptionsWithTypeMutableBuilder[Self <: AlertCustomOptionsWithType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AlertManager extends StObject {
    
    var alerts: js.Array[AlertComponentProps] = js.native
    
    def error(): AlertComponentProps = js.native
    def error(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
    def error(message: ReactElement): AlertComponentProps = js.native
    
    def info(): AlertComponentProps = js.native
    def info(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
    def info(message: ReactElement): AlertComponentProps = js.native
    
    def remove(alert: AlertComponentProps): Unit = js.native
    
    var root: js.UndefOr[HTMLElement] = js.native
    
    def show(): AlertComponentProps = js.native
    def show(message: js.UndefOr[ReactElement], options: AlertCustomOptionsWithType): AlertComponentProps = js.native
    def show(message: ReactElement): AlertComponentProps = js.native
    
    def success(): AlertComponentProps = js.native
    def success(message: js.UndefOr[ReactElement], options: AlertCustomOptions): AlertComponentProps = js.native
    def success(message: ReactElement): AlertComponentProps = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAlert.reactAlertStrings.`top left`
    - typingsSlinky.reactAlert.reactAlertStrings.`top center`
    - typingsSlinky.reactAlert.reactAlertStrings.`top right`
    - typingsSlinky.reactAlert.reactAlertStrings.`middle left`
    - typingsSlinky.reactAlert.reactAlertStrings.middle
    - typingsSlinky.reactAlert.reactAlertStrings.`middle right`
    - typingsSlinky.reactAlert.reactAlertStrings.`bottom left`
    - typingsSlinky.reactAlert.reactAlertStrings.`bottom center`
    - typingsSlinky.reactAlert.reactAlertStrings.`bottom right`
  */
  trait AlertPosition extends StObject
  object AlertPosition {
    
    @scala.inline
    def `bottom center`: typingsSlinky.reactAlert.reactAlertStrings.`bottom center` = ("bottom center").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`bottom center`]
    
    @scala.inline
    def `bottom left`: typingsSlinky.reactAlert.reactAlertStrings.`bottom left` = ("bottom left").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`bottom left`]
    
    @scala.inline
    def `bottom right`: typingsSlinky.reactAlert.reactAlertStrings.`bottom right` = ("bottom right").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`bottom right`]
    
    @scala.inline
    def middle: typingsSlinky.reactAlert.reactAlertStrings.middle = "middle".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.middle]
    
    @scala.inline
    def `middle left`: typingsSlinky.reactAlert.reactAlertStrings.`middle left` = ("middle left").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`middle left`]
    
    @scala.inline
    def `middle right`: typingsSlinky.reactAlert.reactAlertStrings.`middle right` = ("middle right").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`middle right`]
    
    @scala.inline
    def `top center`: typingsSlinky.reactAlert.reactAlertStrings.`top center` = ("top center").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`top center`]
    
    @scala.inline
    def `top left`: typingsSlinky.reactAlert.reactAlertStrings.`top left` = ("top left").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`top left`]
    
    @scala.inline
    def `top right`: typingsSlinky.reactAlert.reactAlertStrings.`top right` = ("top right").asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.`top right`]
  }
  
  @js.native
  trait AlertProviderProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The style of the alert container
      *
      * Default z-index value: 100
      */
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Custom context to separate alerts.
      */
    var context: js.UndefOr[Context[js.UndefOr[AlertManager]]] = js.native
    
    /**
      * The margin of each alert
      *
      * Default value: '10px'
      */
    var offset: js.UndefOr[String] = js.native
    
    /**
      * The position of the alerts in the page
      *
      * Default value: 'top center'
      */
    var position: js.UndefOr[AlertPosition] = js.native
    
    /**
      * The alert component for each message
      */
    var template: ReactComponentClass[AlertComponentPropsWithStyle] = js.native
    
    /**
      * Timeout to alert remove itself, if  set to 0 it never removes itself
      *
      * Default value: 0
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * The transition animation
      *
      * Default value: 'fade'
      */
    var transition: js.UndefOr[AlertTransition] = js.native
    
    /**
      * The default alert type used when calling this.props.alert.show
      *
      * Default value: 'info'
      */
    var `type`: js.UndefOr[AlertType] = js.native
  }
  object AlertProviderProps {
    
    @scala.inline
    def apply(template: ReactComponentClass[AlertComponentPropsWithStyle]): AlertProviderProps = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertProviderProps]
    }
    
    @scala.inline
    implicit class AlertProviderPropsMutableBuilder[Self <: AlertProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setContext(value: Context[js.UndefOr[AlertManager]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: AlertPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTemplate(value: ReactComponentClass[AlertComponentPropsWithStyle]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransition(value: AlertTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAlert.reactAlertStrings.fade
    - typingsSlinky.reactAlert.reactAlertStrings.scale
  */
  trait AlertTransition extends StObject
  object AlertTransition {
    
    @scala.inline
    def fade: typingsSlinky.reactAlert.reactAlertStrings.fade = "fade".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.fade]
    
    @scala.inline
    def scale: typingsSlinky.reactAlert.reactAlertStrings.scale = "scale".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.scale]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactAlert.reactAlertStrings.info
    - typingsSlinky.reactAlert.reactAlertStrings.success
    - typingsSlinky.reactAlert.reactAlertStrings.error
  */
  trait AlertType extends StObject
  object AlertType {
    
    @scala.inline
    def error: typingsSlinky.reactAlert.reactAlertStrings.error = "error".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.error]
    
    @scala.inline
    def info: typingsSlinky.reactAlert.reactAlertStrings.info = "info".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.info]
    
    @scala.inline
    def success: typingsSlinky.reactAlert.reactAlertStrings.success = "success".asInstanceOf[typingsSlinky.reactAlert.reactAlertStrings.success]
  }
  
  @js.native
  trait Positions_ extends StObject {
    
    var BOTTOM_CENTER: `bottom center` = js.native
    
    var BOTTOM_LEFT: `bottom left` = js.native
    
    var BOTTOM_RIGHT: `bottom right` = js.native
    
    var MIDDLE: middle = js.native
    
    var MIDDLE_LEFT: `middle left` = js.native
    
    var MIDDLE_RIGHT: `middle right` = js.native
    
    var TOP_CENTER: `top center` = js.native
    
    var TOP_LEFT: `top left` = js.native
    
    var TOP_RIGHT: `top right` = js.native
  }
  object Positions_ {
    
    @scala.inline
    def apply(
      BOTTOM_CENTER: `bottom center`,
      BOTTOM_LEFT: `bottom left`,
      BOTTOM_RIGHT: `bottom right`,
      MIDDLE: middle,
      MIDDLE_LEFT: `middle left`,
      MIDDLE_RIGHT: `middle right`,
      TOP_CENTER: `top center`,
      TOP_LEFT: `top left`,
      TOP_RIGHT: `top right`
    ): Positions_ = {
      val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], MIDDLE_LEFT = MIDDLE_LEFT.asInstanceOf[js.Any], MIDDLE_RIGHT = MIDDLE_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positions_]
    }
    
    @scala.inline
    implicit class Positions_MutableBuilder[Self <: Positions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOTTOM_CENTER(value: `bottom center`): Self = StObject.set(x, "BOTTOM_CENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOTTOM_LEFT(value: `bottom left`): Self = StObject.set(x, "BOTTOM_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOTTOM_RIGHT(value: `bottom right`): Self = StObject.set(x, "BOTTOM_RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIDDLE(value: middle): Self = StObject.set(x, "MIDDLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIDDLE_LEFT(value: `middle left`): Self = StObject.set(x, "MIDDLE_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMIDDLE_RIGHT(value: `middle right`): Self = StObject.set(x, "MIDDLE_RIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_CENTER(value: `top center`): Self = StObject.set(x, "TOP_CENTER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_LEFT(value: `top left`): Self = StObject.set(x, "TOP_LEFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOP_RIGHT(value: `top right`): Self = StObject.set(x, "TOP_RIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transitions_ extends StObject {
    
    var FADE: fade = js.native
    
    var SCALE: scale = js.native
  }
  object Transitions_ {
    
    @scala.inline
    def apply(FADE: fade, SCALE: scale): Transitions_ = {
      val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transitions_]
    }
    
    @scala.inline
    implicit class Transitions_MutableBuilder[Self <: Transitions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFADE(value: fade): Self = StObject.set(x, "FADE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCALE(value: scale): Self = StObject.set(x, "SCALE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Types_ extends StObject {
    
    var ERROR: error = js.native
    
    var INFO: info = js.native
    
    var SUCCESS: success = js.native
  }
  object Types_ {
    
    @scala.inline
    def apply(ERROR: error, INFO: info, SUCCESS: success): Types_ = {
      val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types_]
    }
    
    @scala.inline
    implicit class Types_MutableBuilder[Self <: Types_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: info): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESS(value: success): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
    }
  }
}
