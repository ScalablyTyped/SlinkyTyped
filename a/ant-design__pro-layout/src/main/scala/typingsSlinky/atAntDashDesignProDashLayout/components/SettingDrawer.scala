package typingsSlinky.atAntDashDesignProDashLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignProDashLayout.MergerSettingsTypeSettings
import typingsSlinky.atAntDashDesignProDashLayout.libSettingDrawerMod.SettingDrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SettingDrawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    collapse: js.UndefOr[Boolean] = js.undefined,
    getContainer: js.Any = null,
    hideColors: js.UndefOr[Boolean] = js.undefined,
    hideCopyButton: js.UndefOr[Boolean] = js.undefined,
    hideHintAlert: js.UndefOr[Boolean] = js.undefined,
    hideLoading: js.UndefOr[Boolean] = js.undefined,
    onCollapseChange: /* collapse */ Boolean => Unit = null,
    onSettingChange: /* settings */ MergerSettingsTypeSettings => Unit = null,
    publicPath: String = null,
    settings: MergerSettingsTypeSettings = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hideColors)) __obj.updateDynamic("hideColors")(hideColors.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCopyButton)) __obj.updateDynamic("hideCopyButton")(hideCopyButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHintAlert)) __obj.updateDynamic("hideHintAlert")(hideHintAlert.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLoading)) __obj.updateDynamic("hideLoading")(hideLoading.asInstanceOf[js.Any])
    if (onCollapseChange != null) __obj.updateDynamic("onCollapseChange")(js.Any.fromFunction1(onCollapseChange))
    if (onSettingChange != null) __obj.updateDynamic("onSettingChange")(js.Any.fromFunction1(onSettingChange))
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SettingDrawerProps
}

