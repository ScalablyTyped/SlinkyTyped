package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Item
import typingsSlinky.baseui.appNavBarMod.AppNavBarPropsT
import typingsSlinky.baseui.appNavBarMod.MainNavItemT
import typingsSlinky.baseui.appNavBarMod.UserNavItemT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UnstableAppNavBar {
  @JSImport("baseui/app-nav-bar", "Unstable_AppNavBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.appNavBarMod.UnstableAppNavBar] {
    @scala.inline
    def appDisplayNameReactElement(value: ReactElement): this.type = set("appDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def appDisplayName(value: TagMod[Any]): this.type = set("appDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def mainNav(value: js.Array[MainNavItemT]): this.type = set("mainNav", value.asInstanceOf[js.Any])
    @scala.inline
    def userImgUrl(value: String): this.type = set("userImgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def userNav(value: js.Array[UserNavItemT]): this.type = set("userNav", value.asInstanceOf[js.Any])
    @scala.inline
    def username(value: String): this.type = set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def usernameSubtitleReactElement(value: ReactElement): this.type = set("usernameSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def usernameSubtitle(value: TagMod[Any]): this.type = set("usernameSubtitle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppNavBarPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isNavItemActive: Item => Boolean, onNavItemSelect: Item => js.Any): Builder = {
    val __props = js.Dynamic.literal(isNavItemActive = js.Any.fromFunction1(isNavItemActive), onNavItemSelect = js.Any.fromFunction1(onNavItemSelect))
    new Builder(js.Array(this.component, __props.asInstanceOf[AppNavBarPropsT]))
  }
}

