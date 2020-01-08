package typingsSlinky.fundamentalDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.Anon_Args
import typingsSlinky.fundamentalDashReact.Anon_CallbackEvent
import typingsSlinky.fundamentalDashReact.Anon_CallbackEventGlyph
import typingsSlinky.fundamentalDashReact.Anon_CallbackEventLabel
import typingsSlinky.fundamentalDashReact.Anon_CounterLabelNotificationsButton
import typingsSlinky.fundamentalDashReact.libShellbarShellbarMod.ShellbarProps
import typingsSlinky.fundamentalDashReact.libShellbarShellbarMod.default
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
    actions: js.Array[Anon_CallbackEvent] = null,
    copilot: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    localizedText: Anon_CounterLabelNotificationsButton = null,
    logo: TagMod[Any] = null,
    logoSAP: js.UndefOr[Boolean] = js.undefined,
    notifications: Anon_CallbackEventLabel = null,
    productMenu: js.Array[Anon_Args] = null,
    productSwitcher: js.Object = null,
    productSwitcherList: js.Array[Anon_CallbackEventGlyph] = null,
    productTitle: String = null,
    profile: StringDictionary[js.Any] = null,
    profileMenu: js.Array[StringDictionary[_]] = null,
    searchInput: StringDictionary[js.Any] = null,
    subtitle: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(copilot)) __obj.updateDynamic("copilot")(copilot.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (!js.isUndefined(logoSAP)) __obj.updateDynamic("logoSAP")(logoSAP.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (productMenu != null) __obj.updateDynamic("productMenu")(productMenu.asInstanceOf[js.Any])
    if (productSwitcher != null) __obj.updateDynamic("productSwitcher")(productSwitcher.asInstanceOf[js.Any])
    if (productSwitcherList != null) __obj.updateDynamic("productSwitcherList")(productSwitcherList.asInstanceOf[js.Any])
    if (productTitle != null) __obj.updateDynamic("productTitle")(productTitle.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileMenu != null) __obj.updateDynamic("profileMenu")(profileMenu.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.fundamentalDashReact.libShellbarShellbarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ShellbarProps
}

