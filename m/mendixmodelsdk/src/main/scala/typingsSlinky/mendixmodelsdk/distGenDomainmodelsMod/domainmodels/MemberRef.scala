package typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.AttributeWidget
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.GridSortItem
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRefExpression
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.SortItem
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridColumn
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListViewSearch
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.MemberWidget
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.RangeSearchField
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.SingleSearchField
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.StaticOrDynamicString
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
abstract class MemberRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsAttributeWidget: AttributeWidget = js.native
  val containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  val containerAsDataGridColumn: DataGridColumn = js.native
  val containerAsDocumentTemplatesGridSortItem: GridSortItem = js.native
  val containerAsGridColumn: GridColumn = js.native
  val containerAsListViewSearch: ListViewSearch = js.native
  val containerAsMemberWidget: MemberWidget = js.native
  val containerAsPagesGridSortItem: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridSortItem = js.native
  val containerAsRangeSearchField: RangeSearchField = js.native
  val containerAsSingleSearchField: SingleSearchField = js.native
  val containerAsSortItem: SortItem = js.native
  val containerAsStaticOrDynamicString: StaticOrDynamicString = js.native
  val containerAsVariableRefExpression: VariableRefExpression = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  var entityRef: IndirectEntityRef | Null = js.native
  @JSName("model")
  var model_MemberRef: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

