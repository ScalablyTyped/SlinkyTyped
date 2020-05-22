package typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'menuProps' | 'style' | 'theme' | 'subMenuItemRender' | 'menuItemRender', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var breakpoint: js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var links: js.UndefOr[js.Array[TagMod[Any]]] = js.undefined
  var logo: js.UndefOr[TagMod[Any]] = js.undefined
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[this.type], 
        TagMod[Any]
      ]
    ]
  ] = js.undefined
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.undefined
  var siderMenuStyle: js.UndefOr[CSSProperties] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[TagMod[Any]] = null,
    logo: TagMod[Any] = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[SiderMenuProps], 
        TagMod[Any]
      ]
    ] = null,
    onMenuHeaderClick: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Unit = null,
    siderMenuStyle: CSSProperties = null,
    siderWidth: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (siderMenuStyle != null) __obj.updateDynamic("siderMenuStyle")(siderMenuStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(siderWidth)) __obj.updateDynamic("siderWidth")(siderWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

