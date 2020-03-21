package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalReact.AnonGlyph
import typingsSlinky.fundamentalReact.AnonImage
import typingsSlinky.fundamentalReact.AnonLabel
import typingsSlinky.fundamentalReact.AnonLink
import typingsSlinky.fundamentalReact.AnonNotificationsButton
import typingsSlinky.fundamentalReact.shellbarMod.ShellbarProps
import typingsSlinky.fundamentalReact.shellbarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Shellbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/Shellbar/Shellbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actions: js.Array[AnonGlyph] = null,
    copilot: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    localizedText: AnonNotificationsButton = null,
    logo: TagMod[Any] = null,
    logoSAP: js.UndefOr[Boolean] = js.undefined,
    notifications: AnonLabel = null,
    productMenu: js.Array[AnonLink] = null,
    productSwitcher: js.Object = null,
    productSwitcherList: js.Array[AnonImage] = null,
    productTitle: String = null,
    profileMenu: js.Array[StringDictionary[_]] = null,
    subtitle: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(copilot)) __obj.updateDynamic("copilot")(copilot.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(logoSAP)) __obj.updateDynamic("logoSAP")(logoSAP.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (productMenu != null) __obj.updateDynamic("productMenu")(productMenu.asInstanceOf[js.Any])
    if (productSwitcher != null) __obj.updateDynamic("productSwitcher")(productSwitcher.asInstanceOf[js.Any])
    if (productSwitcherList != null) __obj.updateDynamic("productSwitcherList")(productSwitcherList.asInstanceOf[js.Any])
    if (productTitle != null) __obj.updateDynamic("productTitle")(productTitle.asInstanceOf[js.Any])
    if (profileMenu != null) __obj.updateDynamic("profileMenu")(profileMenu.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.fundamentalReact.shellbarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ShellbarProps
}

