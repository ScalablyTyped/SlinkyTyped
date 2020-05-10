package typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'menuProps' | 'style' | 'theme' | 'subMenuItemRender' | 'menuItemRender', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ @js.native
trait SiderMenuProps extends js.Object {
  var breakpoint: js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var hide: js.UndefOr[Boolean] = js.native
  var links: js.UndefOr[js.Array[TagMod[Any]]] = js.native
  var logo: js.UndefOr[TagMod[Any]] = js.native
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[this.type], 
        TagMod[Any]
      ]
    ]
  ] = js.native
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.native
  var siderWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SiderMenuProps {
  @scala.inline
  def apply(): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiderMenuProps]
  }
  @scala.inline
  implicit class SiderMenuPropsOps[Self <: SiderMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogo(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuHeaderRenderFunction3(
      value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[SiderMenuProps]) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHeaderRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMenuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ TagMod[Any], 
            /* title */ TagMod[Any], 
            /* props */ js.UndefOr[SiderMenuProps], 
            TagMod[Any]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHeaderRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuHeaderRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHeaderRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuHeaderClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuHeaderClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSiderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

