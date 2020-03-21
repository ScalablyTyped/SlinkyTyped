package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SortItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typingsSlinky.mendixmodelsdk.pagesMod.pages.MemberWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
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
  def containerAsPagesGridSortItem(): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortItem = js.native
  def containerAsRangeSearchField(): RangeSearchField = js.native
  def containerAsSingleSearchField(): SingleSearchField = js.native
  def containerAsSortItem(): SortItem = js.native
  def containerAsStaticOrDynamicString(): StaticOrDynamicString = js.native
  def containerAsVariableRefExpression(): VariableRefExpression = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  def entityRef(): js.Any = js.native
  def entityRef(newValue: IndirectEntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Union(): IndirectEntityRef | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

