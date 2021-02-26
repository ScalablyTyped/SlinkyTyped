package typingsSlinky.jqueryEasyLoading

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryEasyLoading {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.resize
    - typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.start
    - typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.stop
    - typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle
  */
  trait Command extends StObject
  object Command {
    
    @scala.inline
    def resize: typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.resize = "resize".asInstanceOf[typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.resize]
    
    @scala.inline
    def start: typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.start = "start".asInstanceOf[typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.start]
    
    @scala.inline
    def stop: typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.stop = "stop".asInstanceOf[typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.stop]
    
    @scala.inline
    def toggle: typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle = "toggle".asInstanceOf[typingsSlinky.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle]
  }
  
  @js.native
  trait LoadingObject extends StObject {
    
    /**
      * Check whether the loading state is active or not
      *
      * @return {Boolean}
      */
    def active(): Boolean = js.native
    
    /**
      * Attach some internal methods to external events
      * e.g. overlay click, window resize etc
      */
    def attachMethodsToExternalEvents(): Unit = js.native
    
    /**
      * Attach the handlers defined on `options` for the respective events
      */
    def attachOptionsHandlers(): Unit = js.native
    
    /**
      * Calculate the z-index for the default overlay element
      * Return the z-index passed as setting to the plugin or calculate it
      * based on the target's z-index
      */
    def calcZIndex(): Double = js.native
    
    /**
      * Return a new default overlay
      *
      * @return {jQuery} A new overlay already appended to the page's body
      */
    def createOerlay(): JQuery = js.native
    
    /**
      * Initializes the overlay and attach handlers to the appropriate events
      */
    def init(): Unit = js.native
    
    /**
      * Reposition the overlay on the top of the target element
      * This method needs to be called if the target element changes position
      *  or dimension
      */
    def resize(): Unit = js.native
    
    /**
      * Trigger the `loading.start` event and turn on the loading state
      */
    def start(): Unit = js.native
    
    /**
      * Trigger the `loading.stop` event and turn off the loading state
      */
    def stop(): Unit = js.native
    
    /**
      * Toggle the state of the loading overlay
      */
    def toggle(): Unit = js.native
  }
  object LoadingObject {
    
    @scala.inline
    def apply(
      active: () => Boolean,
      attachMethodsToExternalEvents: () => Unit,
      attachOptionsHandlers: () => Unit,
      calcZIndex: () => Double,
      createOerlay: () => JQuery,
      init: () => Unit,
      resize: () => Unit,
      start: () => Unit,
      stop: () => Unit,
      toggle: () => Unit
    ): LoadingObject = {
      val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), attachMethodsToExternalEvents = js.Any.fromFunction0(attachMethodsToExternalEvents), attachOptionsHandlers = js.Any.fromFunction0(attachOptionsHandlers), calcZIndex = js.Any.fromFunction0(calcZIndex), createOerlay = js.Any.fromFunction0(createOerlay), init = js.Any.fromFunction0(init), resize = js.Any.fromFunction0(resize), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[LoadingObject]
    }
    
    @scala.inline
    implicit class LoadingObjectMutableBuilder[Self <: LoadingObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachMethodsToExternalEvents(value: () => Unit): Self = StObject.set(x, "attachMethodsToExternalEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachOptionsHandlers(value: () => Unit): Self = StObject.set(x, "attachOptionsHandlers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCalcZIndex(value: () => Double): Self = StObject.set(x, "calcZIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateOerlay(value: () => JQuery): Self = StObject.set(x, "createOerlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Class(es) to be applied to the overlay element when the loading state is stopped
      */
    var hiddenClass: js.UndefOr[String] = js.native
    
    /**
      * Message to be rendered on the overlay content
      * Has no effect if a custom overlay is defined
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * Function to be executed when the overlay is clicked
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.click` event
      */
    var onClick: js.UndefOr[js.Function] = js.native
    
    /**
      * Function to be executed when the loading state is started
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.start` event
      */
    var onStart: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.native
    
    /**
      * Function to be executed when the loading state is stopped
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.stop` event
      */
    var onStop: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.native
    
    /**
      * jQuery element to be used as overlay
      * If not defined, a default overlay will be created
      */
    var overlay: js.UndefOr[JQuery] = js.native
    
    /**
      * Class(es) to be applied to the overlay element when the loading state is started
      */
    var shownClass: js.UndefOr[String] = js.native
    
    /**
      * Set to false to not start the loading state when initialized
      */
    var start: js.UndefOr[Boolean] = js.native
    
    /**
      * Set to true to stop the loading state if the overlay is clicked
      * This options does NOT override the onClick event
      */
    var stoppable: js.UndefOr[Boolean] = js.native
    
    /**
      * Theme to be applied on the loading element
      *
      * Some default themes are implemented on `jquery.loading.css`, but you can
      *  define your own. Just add a `.loading-theme-my_awesome_theme` selector
      *  somewhere with your custom styles and change this option
      *  to 'my_awesome_theme'. The class is applied to the parent overlay div
      *
      * Has no effect if a custom overlay is defined
      */
    var theme: js.UndefOr[String] = js.native
    
    /**
      * z-index to be used by the default overlay
      * If not defined, a z-index will be calculated based on the
      * target's z-index
      * Has no effect if a custom overlay is defined
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnStart(value: /* loading */ LoadingObject => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: /* loading */ LoadingObject => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setOverlay(value: JQuery): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setShownClass(value: String): Self = StObject.set(x, "shownClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShownClassUndefined: Self = StObject.set(x, "shownClass", js.undefined)
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStoppable(value: Boolean): Self = StObject.set(x, "stoppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoppableUndefined: Self = StObject.set(x, "stoppable", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /**
      * Extend the Loading plugin default settings with the user options
      * Use it as `$.Loading.setDefaults({ ... })`
      *
      * @param {Object} options Custom options to override the plugin defaults
      */
    def setDefaults(options: Options): Unit = js.native
  }
  object Static {
    
    @scala.inline
    def apply(setDefaults: Options => Unit): Static = {
      val __obj = js.Dynamic.literal(setDefaults = js.Any.fromFunction1(setDefaults))
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit class StaticMutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetDefaults(value: Options => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
    }
  }
}
