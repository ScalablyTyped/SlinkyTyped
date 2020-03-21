package typingsSlinky.reactMessengerCheckbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMessengerCheckbox.mod.ReactMessengerProps
import typingsSlinky.reactMessengerCheckbox.mod.^
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsSlinky.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMessengerCheckbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    appId: String,
    origin: String,
    pageId: String,
    userRef: String,
    allowLogin: js.UndefOr[Boolean] = js.undefined,
    autoLogAppEvents: js.UndefOr[Boolean] = js.undefined,
    centerAlign: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    onEvent: /* event */ js.Any => Unit = null,
    prechecked: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | standard | xlarge = null,
    skin: light | dark = null,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLogin)) __obj.updateDynamic("allowLogin")(allowLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLogAppEvents)) __obj.updateDynamic("autoLogAppEvents")(autoLogAppEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(centerAlign)) __obj.updateDynamic("centerAlign")(centerAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1(onEvent))
    if (!js.isUndefined(prechecked)) __obj.updateDynamic("prechecked")(prechecked.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactMessengerProps
}

