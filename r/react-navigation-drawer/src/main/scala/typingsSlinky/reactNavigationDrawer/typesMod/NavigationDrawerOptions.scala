package typingsSlinky.reactNavigationDrawer.typesMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDrawerOptions extends js.Object {
  var drawerIcon: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ DrawerIconProps, TagMod[Any]])] = js.native
  var drawerLabel: js.UndefOr[TagMod[Any] | (js.Function1[/* props */ DrawerLabelProps, TagMod[Any]])] = js.native
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.native
  var title: js.UndefOr[String] = js.native
}

object NavigationDrawerOptions {
  @scala.inline
  def apply(): NavigationDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationDrawerOptions]
  }
  @scala.inline
  implicit class NavigationDrawerOptionsOps[Self <: NavigationDrawerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerIconFunction1(value: /* props */ DrawerIconProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawerIcon(value: TagMod[Any] | (js.Function1[/* props */ DrawerIconProps, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerLabelFunction1(value: /* props */ DrawerLabelProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawerLabel(value: TagMod[Any] | (js.Function1[/* props */ DrawerLabelProps, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawerLockMode(value: DrawerLockMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawerLockMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerLockMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

