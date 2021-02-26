package typingsSlinky.jqueryJoyride

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Default function, no options
        * @method
        * @return {JQuery} JQuery instance
        */
      /**
        * joyride function
        * @return {Joyride} Joyride instance.
        */
      def joyride(): JQuery = js.native
      /**
        * Function with method name and params
        * @method
        * @param {string} methodName Name of method to call.
        * @param {any[]} params parameters for method
        * @return {JQuery} JQuery instance
        */
      /**
        * joyride function
        * @return {Joyride} Joyride instance.
        */
      def joyride(methodName: String, params: js.Any*): JQuery = js.native
      /**
        * Function with options
        * @method
        * @param {JoyrideOptions} options An object with all the joyride options you want to overwrite.
        * @return {JQuery} JQuery instance
        */
      /**
        * joyride function
        * @return {Joyride} Joyride instance.
        */
      def joyride(options: JoyrideOptions): JQuery = js.native
      /**
        * joyride function
        * @return {Joyride} Joyride instance.
        */
      @JSName("joyride")
      var joyride_Original: Joyride = js.native
    }
    
    @js.native
    trait Joyride extends StObject {
      
      /**
        * Default function, no options
        * @method
        * @return {JQuery} JQuery instance
        */
      def apply(): JQuery = js.native
      /**
        * Function with method name and params
        * @method
        * @param {string} methodName Name of method to call.
        * @param {any[]} params parameters for method
        * @return {JQuery} JQuery instance
        */
      def apply(methodName: String, params: js.Any*): JQuery = js.native
      /**
        * Function with options
        * @method
        * @param {JoyrideOptions} options An object with all the joyride options you want to overwrite.
        * @return {JQuery} JQuery instance
        */
      def apply(options: JoyrideOptions): JQuery = js.native
    }
    
    @js.native
    trait JoyrideOptions extends StObject {
      
      /**
        * true or false - false tour starts when restart called
        * @member {boolean}
        */
      var autoStart: js.UndefOr[Boolean] = js.native
      
      /**
        * Will this cookie be attached to a domain, ie. '.notableapp.com'
        * @member {any}
        */
      var cookieDomain: js.UndefOr[js.Any] = js.native
      
      /**
        * true/false for whether cookies are used
        * @member {boolean}
        */
      var cookieMonster: js.UndefOr[Boolean] = js.native
      
      /**
        * choose your own cookie name
        * member {string}
        */
      var cookieName: js.UndefOr[String] = js.native
      
      /**
        * Set to '/' if you want the cookie for the whole website
        * @member {any}
        */
      var cookiePath: js.UndefOr[js.Any] = js.native
      
      /**
        *  Whether to expose the elements at each step in the tour (requires modal:true)
        * @member {boolean}
        */
      var expose: js.UndefOr[Boolean] = js.native
      
      /**
        * true or false to control whether localstorage is used
        * @member {boolean}
        */
      var localStorage: js.UndefOr[Boolean] = js.native
      
      /**
        * Keyname in localstorage
        @member {string}
        */
      var localStorageKey: js.UndefOr[String] = js.native
      
      /**
        * Whether to cover page with modal during the tour
        * @member {boolean}
        */
      var modal: js.UndefOr[Boolean] = js.native
      
      /**
        * true/false for next button visibility
        * @member {boolean}
        */
      var nextButton: js.UndefOr[Boolean] = js.native
      
      /**
        * override on a per tooltip bases
        * @member {any}
        */
      var nubPosition: js.UndefOr[js.Any] = js.native
      
      /**
        * array of indexes where to pause the tour after
        * @member {any[]}
        */
      var pauseAfter: js.UndefOr[js.Array[_]] = js.native
      
      /**
        * A method to call after an element has been exposed
        * @method
        * @param {number} index Tip Index
        * @param {JQuery} nextTip Tip object
        * @param {JQuery} el Element
        */
      var postExposeCallback: js.UndefOr[
            js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
          ] = js.native
      
      /**
        * a method to call once the tour closes
        * @method
        * @param {number} index Current Tip Index
        * @param {JQuery} currentTip Current Tip object
        * @param {boolean} isAborted Is Aborted?
        */
      var postRideCallback: js.UndefOr[
            js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
          ] = js.native
      
      /**
        * A method to call after each step
        * @method
        * @param {number} index Current Tip Index
        * @param {JQuery} currentTip Current Tip object
        * @param {boolean} isAborted Is Aborted?
        */
      var postStepCallback: js.UndefOr[
            js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
          ] = js.native
      
      /**
        * A method to call before the tour starts (passed index, tip, and cloned exposed element)
        * @method
        * @param {number} index Current Tip Index
        * @param {JQuery} currentTip Current Tip object
        * @param {JQuery} el Element
        */
      var preRideCallback: js.UndefOr[
            js.Function3[/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
          ] = js.native
      
      /**
        * A method to call before each step
        * @method
        * @param {number} index Tip Index
        * @param {JQuery} nextTip Tip object
        * @param {JQuery} el Element
        */
      var preStepCallback: js.UndefOr[
            js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
          ] = js.native
      
      /**
        * whether to scroll to tips
        * @member {boolean}
        */
      var scroll: js.UndefOr[Boolean] = js.native
      
      /**
        * Page scrolling speed in ms
        * @member {number}
        */
      var scrollSpeed: js.UndefOr[Double] = js.native
      
      /**
        * the index of the tooltip you want to start on (index of the li)
        * @member {number}
        */
      var startOffset: js.UndefOr[Double] = js.native
      
      /**
        * true/false to start timer on first click
        * @member {boolean}
        */
      var startTimerOnClick: js.UndefOr[Boolean] = js.native
      
      /**
        * HTML segments for tip layout
        * @member {JoyrideTemplate}
        */
      var template: js.UndefOr[JoyrideTemplate] = js.native
      
      /**
        * 0 = off, all other numbers = time(ms)
        * @member {number}
        */
      var timer: js.UndefOr[Double] = js.native
      
      /**
        * 'pop' or 'fade' in each tip
        * @member {string}
        */
      var tipAnimation: js.UndefOr[String] = js.native
      
      /**
        * if 'fade'- speed in ms of transition
        * @member {number}
        */
      var tipAnimationFadeSpeed: js.UndefOr[Double] = js.native
      
      /**
        * Where the tip be attached if not inline
        * @member {HTMLElement}
        */
      var tipContainer: js.UndefOr[HTMLElement] = js.native
      
      /**
        * 'top' or 'bottom' in relation to parent
        * @member {string}
        */
      var tipLocation: js.UndefOr[String] = js.native
      
      /**
        * Version
        * @member {string}
        */
      var version: js.UndefOr[String] = js.native
    }
    object JoyrideOptions {
      
      @scala.inline
      def apply(): JoyrideOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JoyrideOptions]
      }
      
      @scala.inline
      implicit class JoyrideOptionsMutableBuilder[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
        
        @scala.inline
        def setCookieDomain(value: js.Any): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
        
        @scala.inline
        def setCookieMonster(value: Boolean): Self = StObject.set(x, "cookieMonster", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookieMonsterUndefined: Self = StObject.set(x, "cookieMonster", js.undefined)
        
        @scala.inline
        def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
        
        @scala.inline
        def setCookiePath(value: js.Any): Self = StObject.set(x, "cookiePath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookiePathUndefined: Self = StObject.set(x, "cookiePath", js.undefined)
        
        @scala.inline
        def setExpose(value: Boolean): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
        
        @scala.inline
        def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalStorageKey(value: String): Self = StObject.set(x, "localStorageKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalStorageKeyUndefined: Self = StObject.set(x, "localStorageKey", js.undefined)
        
        @scala.inline
        def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
        
        @scala.inline
        def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
        
        @scala.inline
        def setNextButton(value: Boolean): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
        
        @scala.inline
        def setNubPosition(value: js.Any): Self = StObject.set(x, "nubPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNubPositionUndefined: Self = StObject.set(x, "nubPosition", js.undefined)
        
        @scala.inline
        def setPauseAfter(value: js.Array[_]): Self = StObject.set(x, "pauseAfter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPauseAfterUndefined: Self = StObject.set(x, "pauseAfter", js.undefined)
        
        @scala.inline
        def setPauseAfterVarargs(value: js.Any*): Self = StObject.set(x, "pauseAfter", js.Array(value :_*))
        
        @scala.inline
        def setPostExposeCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = StObject.set(x, "postExposeCallback", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPostExposeCallbackUndefined: Self = StObject.set(x, "postExposeCallback", js.undefined)
        
        @scala.inline
        def setPostRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "postRideCallback", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPostRideCallbackUndefined: Self = StObject.set(x, "postRideCallback", js.undefined)
        
        @scala.inline
        def setPostStepCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "postStepCallback", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPostStepCallbackUndefined: Self = StObject.set(x, "postStepCallback", js.undefined)
        
        @scala.inline
        def setPreRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = StObject.set(x, "preRideCallback", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPreRideCallbackUndefined: Self = StObject.set(x, "preRideCallback", js.undefined)
        
        @scala.inline
        def setPreStepCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = StObject.set(x, "preStepCallback", js.Any.fromFunction3(value))
        
        @scala.inline
        def setPreStepCallbackUndefined: Self = StObject.set(x, "preStepCallback", js.undefined)
        
        @scala.inline
        def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
        
        @scala.inline
        def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
        
        @scala.inline
        def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
        
        @scala.inline
        def setStartTimerOnClick(value: Boolean): Self = StObject.set(x, "startTimerOnClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTimerOnClickUndefined: Self = StObject.set(x, "startTimerOnClick", js.undefined)
        
        @scala.inline
        def setTemplate(value: JoyrideTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        @scala.inline
        def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
        
        @scala.inline
        def setTipAnimation(value: String): Self = StObject.set(x, "tipAnimation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTipAnimationFadeSpeed(value: Double): Self = StObject.set(x, "tipAnimationFadeSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTipAnimationFadeSpeedUndefined: Self = StObject.set(x, "tipAnimationFadeSpeed", js.undefined)
        
        @scala.inline
        def setTipAnimationUndefined: Self = StObject.set(x, "tipAnimation", js.undefined)
        
        @scala.inline
        def setTipContainer(value: HTMLElement): Self = StObject.set(x, "tipContainer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTipContainerUndefined: Self = StObject.set(x, "tipContainer", js.undefined)
        
        @scala.inline
        def setTipLocation(value: String): Self = StObject.set(x, "tipLocation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTipLocationUndefined: Self = StObject.set(x, "tipLocation", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * HTML segments for tip layout
      */
    @js.native
    trait JoyrideTemplate extends StObject {
      
      /**
        * Button template
        * @member {string}
        */
      var button: js.UndefOr[String] = js.native
      
      /**
        * Exposed Cover template
        * @member {string}
        */
      var exposeCover: js.UndefOr[String] = js.native
      
      /**
        * Link template
        * @member {string}
        */
      var link: js.UndefOr[String] = js.native
      
      /**
        * Modal template
        * @member {string}
        */
      var modal: js.UndefOr[String] = js.native
      
      /**
        * Timer template
        * @member {string}
        */
      var timer: js.UndefOr[String] = js.native
      
      /**
        * Tip template
        * @member {string}
        */
      var tip: js.UndefOr[String] = js.native
      
      /**
        * Wrapper template
        * @member {string}
        */
      var wrapper: js.UndefOr[String] = js.native
    }
    object JoyrideTemplate {
      
      @scala.inline
      def apply(): JoyrideTemplate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JoyrideTemplate]
      }
      
      @scala.inline
      implicit class JoyrideTemplateMutableBuilder[Self <: JoyrideTemplate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
        
        @scala.inline
        def setExposeCover(value: String): Self = StObject.set(x, "exposeCover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExposeCoverUndefined: Self = StObject.set(x, "exposeCover", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
        
        @scala.inline
        def setTimer(value: String): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
        
        @scala.inline
        def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
        
        @scala.inline
        def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
      }
    }
  }
}
