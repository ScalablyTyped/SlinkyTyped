package typingsSlinky.antDesignProLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignProLayout.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.baseMenuMod.BaseMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/BaseMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    formatMessage: /* message */ MessageDescriptor => String = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Unit = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    menuProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any = null,
    mode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    openKeys: WithFalse[js.Array[String]] = null,
    subMenuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1(handleOpenChange))
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (menuData != null) __obj.updateDynamic("menuData")(menuData.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (subMenuItemRender != null) __obj.updateDynamic("subMenuItemRender")(subMenuItemRender.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BaseMenuProps
}

