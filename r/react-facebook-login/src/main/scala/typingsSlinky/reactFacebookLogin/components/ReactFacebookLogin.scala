package typingsSlinky.reactFacebookLogin.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.Node
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactFacebookLogin.mod.ReactFacebookFailureResponse
import typingsSlinky.reactFacebookLogin.mod.ReactFacebookLoginInfo
import typingsSlinky.reactFacebookLogin.mod.ReactFacebookLoginProps
import typingsSlinky.reactFacebookLogin.mod.default
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.medium
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.metro
import typingsSlinky.reactFacebookLogin.reactFacebookLoginStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFacebookLogin {
  @JSImport("react-facebook-login", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.div.tag.type, default] {
    @scala.inline
    def authType(value: String): this.type = set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def autoLoad(value: Boolean): this.type = set("autoLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonStyle(value: CSSProperties): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def cookie(value: Boolean): this.type = set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def cssClass(value: String): this.type = set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def disableMobileRedirect(value: Boolean): this.type = set("disableMobileRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def fields(value: String): this.type = set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: TagMod[Any]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onFailure(value: /* response */ ReactFacebookFailureResponse => Unit): this.type = set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def reAuthenticate(value: Boolean): this.type = set("reAuthenticate", value.asInstanceOf[js.Any])
    @scala.inline
    def redirectUri(value: String): this.type = set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def responseType(value: String): this.type = set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def returnScopes(value: Boolean): this.type = set("returnScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def scope(value: String): this.type = set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | medium | metro): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def state(value: String): this.type = set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def tagNode(value: Node): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def tagComponent(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def tag(value: Node | ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def textButton(value: String): this.type = set("textButton", value.asInstanceOf[js.Any])
    @scala.inline
    def typeButton(value: String): this.type = set("typeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def version(value: String): this.type = set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def xfbml(value: Boolean): this.type = set("xfbml", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactFacebookLoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(appId: String, callback: ReactFacebookLoginInfo => Unit): Builder = {
    val __props = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback))
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactFacebookLoginProps]))
  }
}

