package typingsSlinky.antDesignProLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignProLayout.AnonDefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_HeaderViewProps_1318526730[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, style, title */
  def apply(
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]] = null,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentWidth: ContentWidth = null,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    hasSiderMenu: js.UndefOr[Boolean] = js.undefined,
    headerRender: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    iconfontUrl: String = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    layout: sidemenu | topmenu = null,
    logo: TagMod[Any] = null,
    menu: AnonDefaultOpenAll = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[HeaderViewProps], 
        TagMod[Any]
      ]
    ] = null,
    menuRender: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    primaryColor: String = null,
    rightContentRender: WithFalse[js.Function1[HeaderViewProps, TagMod[Any]]] = null,
    siderWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSiderMenu)) __obj.updateDynamic("hasSiderMenu")(hasSiderMenu.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HeaderViewProps
}

