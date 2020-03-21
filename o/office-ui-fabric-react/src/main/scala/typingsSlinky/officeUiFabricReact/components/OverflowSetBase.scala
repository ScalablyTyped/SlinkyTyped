package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSet
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverflowSetBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.OverflowSetBase] {
  @JSImport("office-ui-fabric-react", "OverflowSetBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    onRenderItem: IOverflowSetItemProps => js.Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[_]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[_]], ReactElement | Null]]) => ReactElement | Null,
    componentRef: IRefObject[IOverflowSet] = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    itemSubMenuProvider: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[_]] = null,
    items: js.Array[IOverflowSetItemProps] = null,
    keytipSequences: js.Array[String] = null,
    overflowItems: js.Array[IOverflowSetItemProps] = null,
    role: String = null,
    styles: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.OverflowSetBase] = {
    val __obj = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (itemSubMenuProvider != null) __obj.updateDynamic("itemSubMenuProvider")(js.Any.fromFunction1(itemSubMenuProvider))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keytipSequences != null) __obj.updateDynamic("keytipSequences")(keytipSequences.asInstanceOf[js.Any])
    if (overflowItems != null) __obj.updateDynamic("overflowItems")(overflowItems.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IOverflowSetProps
}

