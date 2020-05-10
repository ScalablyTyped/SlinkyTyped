package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.Target
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenu
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuListProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyleProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyles
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.std.Partial
import typingsSlinky.std.Window_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextualMenu {
  @JSImport("office-ui-fabric-react", "ContextualMenu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def alignTargetEdge(value: Boolean): this.type = set("alignTargetEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def beakWidth(value: Double): this.type = set("beakWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def boundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window_]) => js.UndefOr[IRectangle]
    ): this.type = set("bounds", js.Any.fromFunction2(value))
    @scala.inline
    def bounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window_], 
          js.UndefOr[IRectangle]
        ])
    ): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IContextualMenu | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IContextualMenu]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IContextualMenu]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def contextualMenuItemAsFunctionComponent(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    @scala.inline
    def contextualMenuItemAsComponentClass(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    @scala.inline
    def contextualMenuItemAs(value: ReactComponentClass[IContextualMenuItemProps]): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    @scala.inline
    def coverTarget(value: Boolean): this.type = set("coverTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def delayUpdateFocusOnHover(value: Boolean): this.type = set("delayUpdateFocusOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def directionalHint(value: DirectionalHint): this.type = set("directionalHint", value.asInstanceOf[js.Any])
    @scala.inline
    def directionalHintFixed(value: Boolean): this.type = set("directionalHintFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def directionalHintForRTL(value: DirectionalHint): this.type = set("directionalHintForRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def doNotLayer(value: Boolean): this.type = set("doNotLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def gapSpace(value: Double): this.type = set("gapSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def getMenuClassNames(value: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames): this.type = set("getMenuClassNames", js.Any.fromFunction2(value))
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isBeakVisible(value: Boolean): this.type = set("isBeakVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def isSubMenu(value: Boolean): this.type = set("isSubMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def labelElementId(value: String): this.type = set("labelElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Unit
    ): this.type = set("onDismiss", js.Any.fromFunction2(value))
    @scala.inline
    def onItemClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): this.type = set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def onMenuDismissed(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): this.type = set("onMenuDismissed", js.Any.fromFunction1(value))
    @scala.inline
    def onMenuOpened(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): this.type = set("onMenuOpened", js.Any.fromFunction1(value))
    @scala.inline
    def onRenderMenuList(
      value: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
          js.Function1[/* props */ js.UndefOr[IContextualMenuListProps], ReactElement | Null]
        ]) => ReactElement | Null
    ): this.type = set("onRenderMenuList", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderSubMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderSubMenu", js.Any.fromFunction2(value))
    @scala.inline
    def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFocusOnContainer(value: Boolean): this.type = set("shouldFocusOnContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFocusOnMount(value: Boolean): this.type = set("shouldFocusOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldUpdateWhenHidden(value: Boolean): this.type = set("shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IContextualMenuStyleProps => Partial[IContextualMenuStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def subMenuHoverDelay(value: Double): this.type = set("subMenuHoverDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def targetRefObject(value: ReactRef[Element]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetElement(value: Element): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetMouseEvent(value: MouseEvent): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: Target): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetNull: this.type = set("target", null)
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def useTargetAsMinWidth(value: Boolean): this.type = set("useTargetAsMinWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def useTargetWidth(value: Boolean): this.type = set("useTargetWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IContextualMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[IContextualMenuItem]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IContextualMenuProps]))
  }
}

