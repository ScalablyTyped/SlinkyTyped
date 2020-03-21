package typingsSlinky.reactTwitterAuth.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.reactTwitterAuth.mod.TwitterLoginProps
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsSlinky.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsSlinky.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTwitterAuth
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, style */
  def apply(
    loginUrl: String,
    onFailure: String => Unit,
    onSuccess: String => Unit,
    requestTokenUrl: String,
    credentials: omit | `same-origin` | include = null,
    customHeaders: HeadersInit = null,
    dialogHeight: Int | Double = null,
    dialogWidth: Int | Double = null,
    forceLogin: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    tag: ReactComponentClass[_] = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[slinky.web.html.`*`.tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (dialogHeight != null) __obj.updateDynamic("dialogHeight")(dialogHeight.asInstanceOf[js.Any])
    if (dialogWidth != null) __obj.updateDynamic("dialogWidth")(dialogWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TwitterLoginProps
}

