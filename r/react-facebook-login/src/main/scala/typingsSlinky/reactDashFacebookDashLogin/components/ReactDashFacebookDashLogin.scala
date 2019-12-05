package typingsSlinky.reactDashFacebookDashLogin.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginMod.ReactFacebookFailureResponse
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginMod.ReactFacebookLoginInfo
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginMod.ReactFacebookLoginProps
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginMod.default
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginStrings.medium
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginStrings.metro
import typingsSlinky.reactDashFacebookDashLogin.reactDashFacebookDashLoginStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashFacebookDashLogin
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-facebook-login", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick, scope */
  def apply(
    appId: String,
    callback: ReactFacebookLoginInfo => Unit,
    authType: String = null,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    buttonStyle: CSSProperties = null,
    containerStyle: CSSProperties = null,
    cookie: js.UndefOr[Boolean] = js.undefined,
    cssClass: String = null,
    disableMobileRedirect: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    icon: TagMod[Any] = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onFailure: /* response */ ReactFacebookFailureResponse => Unit = null,
    reAuthenticate: js.UndefOr[Boolean] = js.undefined,
    redirectUri: String = null,
    responseType: String = null,
    returnScopes: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | metro = null,
    state: String = null,
    tag: Node | ReactComponentClass[_] = null,
    textButton: String = null,
    typeButton: String = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[slinky.web.html.div.tag.type, default] = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback))
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobileRedirect)) __obj.updateDynamic("disableMobileRedirect")(disableMobileRedirect.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (!js.isUndefined(reAuthenticate)) __obj.updateDynamic("reAuthenticate")(reAuthenticate.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(returnScopes)) __obj.updateDynamic("returnScopes")(returnScopes.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (textButton != null) __obj.updateDynamic("textButton")(textButton.asInstanceOf[js.Any])
    if (typeButton != null) __obj.updateDynamic("typeButton")(typeButton.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactFacebookLoginProps
}

