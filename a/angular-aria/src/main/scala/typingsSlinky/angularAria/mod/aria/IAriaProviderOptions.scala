package typingsSlinky.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
@js.native
trait IAriaProviderOptions extends js.Object {
  var ariaChecked: js.UndefOr[Boolean] = js.native
  var ariaDisabled: js.UndefOr[Boolean] = js.native
  var ariaHidden: js.UndefOr[Boolean] = js.native
  var ariaInvalid: js.UndefOr[Boolean] = js.native
  var ariaReadonly: js.UndefOr[Boolean] = js.native
  var ariaRequired: js.UndefOr[Boolean] = js.native
  var ariaValue: js.UndefOr[Boolean] = js.native
  var bindKeydown: js.UndefOr[Boolean] = js.native
  var bindRoleForClick: js.UndefOr[Boolean] = js.native
  var tabindex: js.UndefOr[Boolean] = js.native
}

object IAriaProviderOptions {
  @scala.inline
  def apply(): IAriaProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAriaProviderOptions]
  }
  @scala.inline
  implicit class IAriaProviderOptionsOps[Self <: IAriaProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaReadonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaReadonly")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBindKeydown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindKeydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindKeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withBindRoleForClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRoleForClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindRoleForClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRoleForClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
  }
  
}

