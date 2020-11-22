package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.appNavBarMod.AppNavBarPropsT
import typingsSlinky.baseui.appNavBarMod.NavItemT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppNavBar {
  
  @JSImport("baseui/app-nav-bar", "AppNavBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.appNavBarMod.AppNavBar] {
    
    @scala.inline
    def isMainItemActive(value: /* item */ NavItemT => Boolean): this.type = set("isMainItemActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def mainItemsVarargs(value: NavItemT*): this.type = set("mainItems", js.Array(value :_*))
    
    @scala.inline
    def mainItems(value: js.Array[NavItemT]): this.type = set("mainItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapItemToNode(value: /* item */ NavItemT => ReactElement): this.type = set("mapItemToNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMainItemSelect(
      value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ): this.type = set("onMainItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUserItemSelect(
      value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
    ): this.type = set("onUserItemSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def userImgUrl(value: String): this.type = set("userImgUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def userItemsVarargs(value: NavItemT*): this.type = set("userItems", js.Array(value :_*))
    
    @scala.inline
    def userItems(value: js.Array[NavItemT]): this.type = set("userItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def username(value: String): this.type = set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usernameSubtitleReactElement(value: ReactElement): this.type = set("usernameSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usernameSubtitle(value: ReactElement): this.type = set("usernameSubtitle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AppNavBarPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AppNavBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
