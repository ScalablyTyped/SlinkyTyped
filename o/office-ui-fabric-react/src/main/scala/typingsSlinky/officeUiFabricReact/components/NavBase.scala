package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.navTypesMod.INav
import typingsSlinky.officeUiFabricReact.navTypesMod.INavButtonProps
import typingsSlinky.officeUiFabricReact.navTypesMod.INavLink
import typingsSlinky.officeUiFabricReact.navTypesMod.INavLinkGroup
import typingsSlinky.officeUiFabricReact.navTypesMod.INavProps
import typingsSlinky.officeUiFabricReact.navTypesMod.INavStyleProps
import typingsSlinky.officeUiFabricReact.navTypesMod.INavStyles
import typingsSlinky.officeUiFabricReact.navTypesMod.IRenderGroupHeaderProps
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAs
import typingsSlinky.uifabricUtilities.icomponentasMod.IComponentAsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavBase {
  @JSImport("office-ui-fabric-react", "NavBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.NavBase] {
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ INav | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[INav]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[INav]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def expandButtonAriaLabel(value: String): this.type = set("expandButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def groupsVarargs(value: INavLinkGroup*): this.type = set("groups", js.Array(value :_*))
    @scala.inline
    def groups(value: js.Array[INavLinkGroup]): this.type = set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def groupsNull: this.type = set("groups", null)
    @scala.inline
    def initialSelectedKey(value: String): this.type = set("initialSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def isOnTop(value: Boolean): this.type = set("isOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def linkAsFunctionComponent(value: ReactComponentClass[IComponentAsProps[INavButtonProps]]): this.type = set("linkAs", value.asInstanceOf[js.Any])
    @scala.inline
    def linkAsComponentClass(value: ReactComponentClass[IComponentAsProps[INavButtonProps]]): this.type = set("linkAs", value.asInstanceOf[js.Any])
    @scala.inline
    def linkAs(value: IComponentAs[INavButtonProps]): this.type = set("linkAs", value.asInstanceOf[js.Any])
    @scala.inline
    def onLinkClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit
    ): this.type = set("onLinkClick", js.Any.fromFunction2(value))
    @scala.inline
    def onLinkExpandClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit
    ): this.type = set("onLinkExpandClick", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderGroupHeader(
      value: (/* props */ js.UndefOr[IRenderGroupHeaderProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IRenderGroupHeaderProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderGroupHeader", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderLink(
      value: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderLink", js.Any.fromFunction2(value))
    @scala.inline
    def selectedAriaLabel(value: String): this.type = set("selectedAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKey(value: String): this.type = set("selectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: INavStyleProps => DeepPartial[INavStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[INavStyleProps, INavStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: INavProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NavBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

