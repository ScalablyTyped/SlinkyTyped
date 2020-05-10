package typingsSlinky.extjs.Ext.util

import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloating extends IBase {
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  var center: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  /** [Method] Moves this floating Component into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
  		*/
  var doConstrain: js.UndefOr[js.Function1[/* constrainTo */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.native
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  var setActive: js.UndefOr[
    js.Function2[/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent], Unit]
  ] = js.native
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.native
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  var toBack: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  var toFront: js.UndefOr[js.Function1[/* preventFocus */ js.UndefOr[Boolean], IComponent]] = js.native
}

object IFloating {
  @scala.inline
  def apply(): IFloating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFloating]
  }
  @scala.inline
  implicit class IFloatingOps[Self <: IFloating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrain")(js.undefined)
        ret
    }
    @scala.inline
    def withDoConstrain(value: /* constrainTo */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doConstrain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoConstrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doConstrain")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOnToFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnToFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusOnToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnToFront")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActive(value: (/* active */ js.UndefOr[Boolean], /* newActive */ js.UndefOr[IComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActive")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withToBack(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBack")(js.undefined)
        ret
    }
    @scala.inline
    def withToFront(value: /* preventFocus */ js.UndefOr[Boolean] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFront")(js.undefined)
        ret
    }
  }
  
}

