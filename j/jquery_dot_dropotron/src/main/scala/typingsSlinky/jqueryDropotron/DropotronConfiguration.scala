package typingsSlinky.jqueryDropotron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropotronConfiguration extends js.Object {
  /**
    * @summary IE Offset X.
    * @type {number}
    */
  var IEOffsetX: Double = js.native
  /**
    * @summary IE Offset Y.
    * @type {number}
    */
  var IEOffsetY: Double = js.native
  /**
    * @summary Alignment ("left", "center", "right").
    * @type {string}
    */
  var alignment: String = js.native
  /**
    * @summary Base Z-Index.
    * @type {number}
    */
  var baseZIndex: Double = js.native
  /**
    * @summary If true and detach = true, leave original menu intact.
    * @type {boolean}
    */
  var cloneOnDetach: Boolean = js.native
  /**
    * @summary Detach second level menus (prevents parent style bleed).
    * @type {boolean}
    */
  var detach: Boolean = js.native
  /**
    * @summary Easing mode ("swing", "linear").
    * @type {string}
    */
  var easing: String = js.native
  /**
    * @summary Expansion mode ("hover" or "click").
    * @type {string}
    */
  var expandMode: String = js.native
  /**
    * @summary Global offset Y.
    * @type {number}
    */
  var globalOffsetY: Double = js.native
  /**
    * @summary Hide delay (in ms; 0 disables).
    * @type {number}
    */
  var hideDelay: Double = js.native
  /**
    * @summary Hover delay (in ms).
    * @type {number}
    */
  var hoverDelay: Double = js.native
  /**
    * @summary Menu class (assigned to every <ul>).
    * @type {string}
    */
  var menuClass: String = js.native
  /**
    * @summary Menu mode ("instant", "fade", "slide", "zoom").
    * @type {string}
    */
  var mode: String = js.native
  /**
    * @summary If true and mode = "fade", prevents top-level opener fade.
    * @type {boolean}
    */
  var noOpenerFade: Boolean = js.native
  /**
    * @summary Submenu offset X.
    * @type {number}
    */
  var offsetX: Double = js.native
  /**
    * @summary Submenu offset Y.
    * @type {number}
    */
  var offsetY: Double = js.native
  /**
    * @summary Active opener class.
    * @type {string}
    */
  var openerActiveClass: String = js.native
  /**
    * @summary Opener class.
    * @type {string}
    */
  var openerClass: String = js.native
  /**
    * @summary Parent jQuery object.
    * @type {JQuery}
    */
  var selectorParent: JQuery = js.native
  /**
    * @summary Menu speed ("fast", "slow", or ms).
    * @type {string}
    */
  var speed: String = js.native
  /**
    * @summary Submenu class prefix.
    * @type {string}
    */
  var submenuClassPrefix: String = js.native
}

object DropotronConfiguration {
  @scala.inline
  def apply(
    IEOffsetX: Double,
    IEOffsetY: Double,
    alignment: String,
    baseZIndex: Double,
    cloneOnDetach: Boolean,
    detach: Boolean,
    easing: String,
    expandMode: String,
    globalOffsetY: Double,
    hideDelay: Double,
    hoverDelay: Double,
    menuClass: String,
    mode: String,
    noOpenerFade: Boolean,
    offsetX: Double,
    offsetY: Double,
    openerActiveClass: String,
    openerClass: String,
    selectorParent: JQuery,
    speed: String,
    submenuClassPrefix: String
  ): DropotronConfiguration = {
    val __obj = js.Dynamic.literal(IEOffsetX = IEOffsetX.asInstanceOf[js.Any], IEOffsetY = IEOffsetY.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], baseZIndex = baseZIndex.asInstanceOf[js.Any], cloneOnDetach = cloneOnDetach.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], expandMode = expandMode.asInstanceOf[js.Any], globalOffsetY = globalOffsetY.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], hoverDelay = hoverDelay.asInstanceOf[js.Any], menuClass = menuClass.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], noOpenerFade = noOpenerFade.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], openerActiveClass = openerActiveClass.asInstanceOf[js.Any], openerClass = openerClass.asInstanceOf[js.Any], selectorParent = selectorParent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], submenuClassPrefix = submenuClassPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropotronConfiguration]
  }
  @scala.inline
  implicit class DropotronConfigurationOps[Self <: DropotronConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIEOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIEOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IEOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneOnDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneOnDetach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoOpenerFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noOpenerFade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenerActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerActiveClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectorParent(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmenuClassPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submenuClassPrefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

