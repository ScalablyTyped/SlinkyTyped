package typingsSlinky.reactLottie

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactLottie.anon.ClassName
import typingsSlinky.reactLottie.reactLottieStrings.DOMLoaded
import typingsSlinky.reactLottie.reactLottieStrings.animation
import typingsSlinky.reactLottie.reactLottieStrings.button
import typingsSlinky.reactLottie.reactLottieStrings.complete
import typingsSlinky.reactLottie.reactLottieStrings.config_ready
import typingsSlinky.reactLottie.reactLottieStrings.data_ready
import typingsSlinky.reactLottie.reactLottieStrings.destroy
import typingsSlinky.reactLottie.reactLottieStrings.enterFrame
import typingsSlinky.reactLottie.reactLottieStrings.loaded_images
import typingsSlinky.reactLottie.reactLottieStrings.loopComplete
import typingsSlinky.reactLottie.reactLottieStrings.segmentStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Lottie allows you to render an animation from a JSON structure exported from Adobe After Effects using the Bodymovin plugin
    */
  @JSImport("react-lottie", JSImport.Default)
  @js.native
  class default ()
    extends Component[LottieProps, js.Any, js.Any]
  
  @js.native
  trait EventListener extends StObject {
    
    /**
      * A callback that will be executed when the given eventName is received
      */
    def callback(): Unit = js.native
    
    /**
      * The event sent by Lottie
      */
    var eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy = js.native
  }
  object EventListener {
    
    @scala.inline
    def apply(
      callback: () => Unit,
      eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
    ): EventListener = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListener]
    }
    
    @scala.inline
    implicit class EventListenerMutableBuilder[Self <: EventListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEventName(
        value: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
      ): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Lottie allows you to render an animation from a JSON structure exported from Adobe After Effects using the Bodymovin plugin
    */
  type Lottie = ReactComponentClass[LottieProps]
  
  @js.native
  trait LottieProps extends StObject {
    
    var ariaLabel: js.UndefOr[String | animation] = js.native
    
    var ariaRole: js.UndefOr[String | button] = js.native
    
    var direction: js.UndefOr[Double] = js.native
    
    /**
      * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
      * Refer to Lottie documentation for a list of available events.
      */
    var eventListeners: js.UndefOr[js.Array[EventListener]] = js.native
    
    /**
      * Height size in pixels
      * @default '100%'
      */
    var height: js.UndefOr[Double | String] = js.native
    
    var isClickToPauseDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Describes if the animation must be in paused mode
      */
    var isPaused: js.UndefOr[Boolean] = js.native
    
    /**
      * Describes if the animation must be in stopped mode
      */
    var isStopped: js.UndefOr[Boolean] = js.native
    
    /**
      * Object representing animation settings
      */
    var options: Options = js.native
    
    var segments: js.UndefOr[js.Array[Double]] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    /**
      * Width size in pixels
      * @default '100%'
      */
    var width: js.UndefOr[Double | String] = js.native
  }
  object LottieProps {
    
    @scala.inline
    def apply(options: Options): LottieProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[LottieProps]
    }
    
    @scala.inline
    implicit class LottiePropsMutableBuilder[Self <: LottieProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String | animation): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaRole(value: String | button): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEventListeners(value: js.Array[EventListener]): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventListenersUndefined: Self = StObject.set(x, "eventListeners", js.undefined)
      
      @scala.inline
      def setEventListenersVarargs(value: EventListener*): Self = StObject.set(x, "eventListeners", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsClickToPauseDisabled(value: Boolean): Self = StObject.set(x, "isClickToPauseDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClickToPauseDisabledUndefined: Self = StObject.set(x, "isClickToPauseDisabled", js.undefined)
      
      @scala.inline
      def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
      
      @scala.inline
      def setIsStopped(value: Boolean): Self = StObject.set(x, "isStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStoppedUndefined: Self = StObject.set(x, "isStopped", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[Double]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      @scala.inline
      def setSegmentsVarargs(value: Double*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The JSON data exported from Adobe After Effects using the Bodymovin plugin
      */
    var animationData: js.Any = js.native
    
    /**
      * Defines if the animation should immediately play when the component enters the DOM
      */
    var autoplay: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines if the animation should play only once or repeatedly in an endless loop
      * or the number of loops that should be completed before the animation ends
      */
    var loop: js.UndefOr[Boolean | Double] = js.native
    
    var rendererSettings: js.UndefOr[ClassName] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(animationData: js.Any): Options = {
      val __obj = js.Dynamic.literal(animationData = animationData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationData(value: js.Any): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean | Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setRendererSettings(value: ClassName): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
    }
  }
}
