package typingsSlinky.inboxsdk.mod.NavMenu

import typingsSlinky.inboxsdk.AnonPreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemDescriptorBase extends js.Object {
  var accessory: js.UndefOr[
    CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
  ] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var expanderForegroundColor: js.UndefOr[String] = js.native
  var name: String = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ AnonPreventDefault, Unit]] = js.native
  var orderHint: js.UndefOr[Double] = js.native
  var routeID: js.UndefOr[String] = js.native
  var routeParams: js.UndefOr[js.Object] = js.native
  var `type`: js.UndefOr[NavItemTypes] = js.native
}

object NavItemDescriptorBase {
  @scala.inline
  def apply(name: String): NavItemDescriptorBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemDescriptorBase]
  }
  @scala.inline
  implicit class NavItemDescriptorBaseOps[Self <: NavItemDescriptorBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessory(
      value: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessory")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanderForegroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanderForegroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanderForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanderForegroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ AnonPreventDefault => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderHint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeID")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NavItemTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

