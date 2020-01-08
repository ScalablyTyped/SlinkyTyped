package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

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
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.AttributeRef")
@js.native
object AttributeRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInGridColumnUnderAttributeRef(container: GridColumn): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInPagesGridSortItemUnderAttributeRef(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GridSortItem): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSortItemUnderAttributeRef(container: SortItem): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef = js.native
}

