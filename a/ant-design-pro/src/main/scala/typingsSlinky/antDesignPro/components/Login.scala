package typingsSlinky.antDesignPro.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.loginMod.LoginProps
import typingsSlinky.antDesignPro.loginMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Login {
  @JSImport("ant-design-pro/lib/Login", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultActiveKey(value: String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def onSubmit(value: (/* error */ js.Any, /* values */ js.Any) => Unit): this.type = set("onSubmit", js.Any.fromFunction2(value))
    @scala.inline
    def onTabChange(value: /* key */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Login.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

