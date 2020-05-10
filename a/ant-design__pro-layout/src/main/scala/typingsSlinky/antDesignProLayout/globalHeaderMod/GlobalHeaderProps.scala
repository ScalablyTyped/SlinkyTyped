package typingsSlinky.antDesignProLayout.globalHeaderMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]] = js.native
  var isMobile: js.UndefOr[Boolean] = js.native
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
  var menuRender: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any
  ] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, TagMod[Any]]]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object GlobalHeaderProps {
  @scala.inline
  def apply(): GlobalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalHeaderProps]
  }
  @scala.inline
  implicit class GlobalHeaderPropsOps[Self <: GlobalHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedButtonRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
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
      value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[GlobalHeaderProps]) => TagMod[Any]
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
            /* props */ js.UndefOr[GlobalHeaderProps], 
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
    def withMenuRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: /* collapsed */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentRenderFunction1(value: GlobalHeaderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightContentRender(value: WithFalse[js.Function1[GlobalHeaderProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContentRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.undefined)
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

