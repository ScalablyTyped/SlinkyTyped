package typingsSlinky.reactTwitterAuth.components

import org.scalajs.dom.experimental.Headers
import slinky.core.ReactComponentClass
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reactTwitterAuth.mod.TwitterLoginProps
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTwitterAuth {
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
    @scala.inline
    def credentials(value: omit | `same-origin` | include): this.type = set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def customHeadersVarargs(value: js.Array[String]*): this.type = set("customHeaders", js.Array(value :_*))
    @scala.inline
    def customHeadersHeaders(value: Headers): this.type = set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def customHeaders(value: HeadersInit): this.type = set("customHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogHeight(value: Double): this.type = set("dialogHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def dialogWidth(value: Double): this.type = set("dialogWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def forceLogin(value: Boolean): this.type = set("forceLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tagFunctionComponent(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def tagComponentClass(value: ReactComponentClass[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def tag(value: ReactType[_]): this.type = set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TwitterLoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(loginUrl: String, onFailure: String => Unit, onSuccess: String => Unit, requestTokenUrl: String): Builder = {
    val __props = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TwitterLoginProps]))
  }
}

