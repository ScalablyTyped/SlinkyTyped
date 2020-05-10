package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSet
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetStyles
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverflowSet {
  @JSImport("office-ui-fabric-react", "OverflowSet")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IOverflowSet | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IOverflowSet]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IOverflowSet]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def doNotContainWithinFocusZone(value: Boolean): this.type = set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    @scala.inline
    def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def itemSubMenuProvider(value: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[_]]): this.type = set("itemSubMenuProvider", js.Any.fromFunction1(value))
    @scala.inline
    def items(value: js.Array[IOverflowSetItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def keytipSequences(value: js.Array[String]): this.type = set("keytipSequences", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowItems(value: js.Array[IOverflowSetItemProps]): this.type = set("overflowItems", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowSide(value: start | end): this.type = set("overflowSide", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IOverflowSetProps => Partial[IOverflowSetStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IOverflowSetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    onRenderItem: IOverflowSetItemProps => js.Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], ReactElement | Null]]) => ReactElement | Null
  ): Builder = {
    val __props = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    new Builder(js.Array(this.component, __props.asInstanceOf[IOverflowSetProps]))
  }
}

