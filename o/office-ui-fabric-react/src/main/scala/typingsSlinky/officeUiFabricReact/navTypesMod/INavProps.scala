package typingsSlinky.officeUiFabricReact.navTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavProps extends js.Object {
  /**
    * (Optional) The nav container aria label.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Additional css class to apply to the Nav
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the INav interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[INav]] = js.native
  /**
    * (Optional) The nav container aria label. The link name is prepended to this label.
    * If not provided, the aria label will default to the link name.
    *
    * @deprecated - Use expandAriaLabel and collapseAriaLabel on groups instead
    */
  var expandButtonAriaLabel: js.UndefOr[String] = js.native
  /**
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null = js.native
  /**
    * (Optional) The key of the nav item initially selected.
    */
  var initialSelectedKey: js.UndefOr[String] = js.native
  /**
    * Indicates whether the navigation component renders on top of other content in the UI
    */
  var isOnTop: js.UndefOr[Boolean] = js.native
  /**
    * Render a custom link in place of the normal one.
    * This replaces the entire button rather than simply button content
    */
  var linkAs: js.UndefOr[IComponentAs[INavButtonProps]] = js.native
  /**
    * Function callback invoked when a link in the navigation is clicked
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.native
  /**
    * Function callback invoked when the chevron on a link is clicked
    */
  var onLinkExpandClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.native
  /**
    * Used to customize how content inside the group header is rendered
    * @defaultvalue Default group header rendering
    */
  var onRenderGroupHeader: js.UndefOr[IRenderFunction[INavLinkGroup]] = js.native
  /**
    * Used to customize how content inside the link tag is rendered
    * @defaultvalue Default link rendering
    */
  var onRenderLink: js.UndefOr[IRenderFunction[INavLink]] = js.native
  /**
    * (Deprecated) Use ariaCurrent on links instead
    * @deprecated Use ariaCurrent on links instead
    */
  var selectedAriaLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) The key of the nav item selected by caller.
    */
  var selectedKey: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[INavStyleProps, INavStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object INavProps {
  @scala.inline
  def apply(): INavProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INavProps]
  }
  @scala.inline
  implicit class INavPropsOps[Self <: INavProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
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
    def withComponentRefFunction1(value: /* ref */ INav | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[INav]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[INav]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandButtonAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandButtonAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandButtonAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[INavLinkGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(null)
        ret
    }
    @scala.inline
    def withInitialSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[INavButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkAsComponentClass(value: ReactComponentClass[IComponentAsProps[INavButtonProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkAs(value: IComponentAs[INavButtonProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkAs")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkExpandClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkExpandClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLinkExpandClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkExpandClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderGroupHeader(
      value: (/* props */ js.UndefOr[INavLinkGroup], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLinkGroup], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderGroupHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderGroupHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderGroupHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderLink(
      value: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: INavStyleProps => Partial[INavStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[INavStyleProps, INavStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
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

