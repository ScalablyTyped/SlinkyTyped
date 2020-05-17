package typingsSlinky.antDesignProLayout.baseMenuMod

import slinky.core.TagMod
import typingsSlinky.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>[P]}
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps * / any, 'openKeys' | 'onOpenChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps * / any[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ @js.native
trait BaseMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.native
  var isMobile: js.UndefOr[Boolean] = js.native
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  /**
    * 要给菜单的props, 参考antd-menu的属性。https://ant.design/components/menu-cn/
    */
  var menuProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any
  ] = js.native
  var mode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any
  ] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subMenuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  var theme: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.native
}

object BaseMenuProps {
  @scala.inline
  def apply(): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuProps]
  }
  @scala.inline
  implicit class BaseMenuPropsOps[Self <: BaseMenuProps] (val x: Self) extends AnyVal {
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
    def withFormatMessage(value: /* message */ MessageDescriptor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleOpenChange(value: /* openKeys */ js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleOpenChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleOpenChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleOpenChange")(js.undefined)
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
    def withMenuData(value: js.Array[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuData")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
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
    def withOpenKeys(value: WithFalse[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openKeys")(js.undefined)
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
    @scala.inline
    def withSubMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuItemRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuItemRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubMenuItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuItemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

