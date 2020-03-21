package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowFieldsTypesMod.IDetailsRowFieldsProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typingsSlinky.officeUiFabricReact.kinkeyofPickIDetailsRowSt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DetailsRowFields
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "DetailsRowFields")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    columnStartIndex: Double,
    columns: js.Array[IColumn],
    item: js.Any,
    itemIndex: Double,
    rowClassNames: kinkeyofPickIDetailsRowSt,
    cellStyleProps: ICellStyleProps = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableUpdateAnimations: js.UndefOr[Boolean] = js.undefined,
    getCellValueKey: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => String = null,
    onRenderItemColumn: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* column */ js.UndefOr[IColumn]) => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], rowClassNames = rowClassNames.asInstanceOf[js.Any])
    if (cellStyleProps != null) __obj.updateDynamic("cellStyleProps")(cellStyleProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUpdateAnimations)) __obj.updateDynamic("enableUpdateAnimations")(enableUpdateAnimations.asInstanceOf[js.Any])
    if (getCellValueKey != null) __obj.updateDynamic("getCellValueKey")(js.Any.fromFunction3(getCellValueKey))
    if (onRenderItemColumn != null) __obj.updateDynamic("onRenderItemColumn")(js.Any.fromFunction3(onRenderItemColumn))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDetailsRowFieldsProps
}

