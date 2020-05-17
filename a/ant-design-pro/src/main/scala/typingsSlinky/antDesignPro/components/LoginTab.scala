package typingsSlinky.antDesignPro.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.AddTab
import typingsSlinky.antDesignPro.loginTabMod.LoginTabProps
import typingsSlinky.antDesignPro.loginTabMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginTab {
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def tabReactElement(value: ReactElement): this.type = set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def tab(value: TagMod[Any]): this.type = set("tab", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginTabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(tabUtil: AddTab): Builder = {
    val __props = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LoginTabProps]))
  }
}

