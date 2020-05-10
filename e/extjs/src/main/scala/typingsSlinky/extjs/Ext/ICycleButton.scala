package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.button.ISplit
import typingsSlinky.extjs.Ext.menu.ICheckItem
import typingsSlinky.extjs.Ext.menu.IMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICycleButton extends ISplit {
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.native
  /** [Method] Gets the currently active menu item
  		* @returns Ext.menu.CheckItem The active item
  		*/
  var getActiveItem: js.UndefOr[js.Function0[ICheckItem]] = js.native
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.native
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[IMenu] = js.native
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the button s active menu item
  		* @param item Ext.menu.CheckItem The item to activate
  		* @param suppressEvent Boolean True to prevent the button's change event from firing.
  		*/
  var setActiveItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[Boolean] = js.native
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[Unit]] = js.native
}

object ICycleButton {
  @scala.inline
  def apply(): ICycleButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICycleButton]
  }
  @scala.inline
  implicit class ICycleButtonOps[Self <: ICycleButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withForceGlyph(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceGlyph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceGlyph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceGlyph")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIcon(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveItem(value: () => ICheckItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: IMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrependText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveItem(value: (/* item */ js.UndefOr[ICheckItem], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withShowText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showText")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleSelected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggleSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSelected")(js.undefined)
        ret
    }
  }
  
}

