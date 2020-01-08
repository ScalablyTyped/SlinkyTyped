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
  @JSName("model")
  var model_FMemberRef: IModel = js.native
  def containerAsAttributeWidget(): AttributeWidget = js.native
  def containerAsClientTemplateParameter(): ClientTemplateParameter = js.native
  def containerAsDataGridColumn(): DataGridColumn = js.native
  def containerAsDocumentTemplatesGridSortItem(): GridSortItem = js.native
  def containerAsGridColumn(): GridColumn = js.native
  def containerAsListViewSearch(): ListViewSearch = js.native
  def containerAsMemberWidget(): MemberWidget = js.native
  def containerAsPagesGridSortItem(): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridSortItem = js.native
  def containerAsRangeSearchField(): RangeSearchField = js.native
  def containerAsSingleSearchField(): SingleSearchField = js.native
  def containerAsSortItem(): SortItem = js.native
  def containerAsStaticOrDynamicString(): StaticOrDynamicString = js.native
  def containerAsVariableRefExpression(): VariableRefExpression = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  def entityRef(): IndirectEntityRef | Null = js.native
  def entityRef(newValue: IndirectEntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

