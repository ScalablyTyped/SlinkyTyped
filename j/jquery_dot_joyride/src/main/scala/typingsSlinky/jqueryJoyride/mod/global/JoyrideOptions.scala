package typingsSlinky.jqueryJoyride.mod.global

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoyrideOptions extends js.Object {
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
  implicit class JoyrideOptionsOps[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieDomain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieMonster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMonster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMonster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMonster")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withCookiePath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalStorageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalStorageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localStorageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withNubPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nubPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNubPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nubPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withPauseAfter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPauseAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pauseAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withPostExposeCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postExposeCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostExposeCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postExposeCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPostRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRideCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostRideCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRideCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPostStepCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postStepCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPostStepCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postStepCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRideCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPreRideCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRideCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPreStepCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preStepCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPreStepCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preStepCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimerOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimerOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimerOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: JoyrideTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withTipAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withTipAnimationFadeSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipAnimationFadeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipAnimationFadeSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipAnimationFadeSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withTipContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTipLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

