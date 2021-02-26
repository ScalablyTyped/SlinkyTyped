package typingsSlinky.mendixmodelsdk.mod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SortItem
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typingsSlinky.mendixmodelsdk.pagesMod.pages.GridColumn
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typingsSlinky.mendixmodelsdk.pagesMod.pages.MemberWidget
import typingsSlinky.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels.AttributeRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AttributeRef {
  
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInAttributeWidgetUnderAttributeRef")
  @js.native
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInClientTemplateParameterUnderAttributeRef")
  @js.native
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInDataGridColumnUnderAttributeRef")
  @js.native
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInDocumentTemplatesGridSortItemUnderAttributeRef")
  @js.native
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInGridColumnUnderAttributeRef")
  @js.native
  def createInGridColumnUnderAttributeRef(container: GridColumn): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInListViewSearchUnderSearchRefs")
  @js.native
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInMemberWidgetUnderAttributeRef")
  @js.native
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInPagesGridSortItemUnderAttributeRef")
  @js.native
  def createInPagesGridSortItemUnderAttributeRef(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortItem): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInRangeSearchFieldUnderLowerBoundRef")
  @js.native
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInRangeSearchFieldUnderUpperBoundRef")
  @js.native
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInSingleSearchFieldUnderAttributeRef")
  @js.native
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInSortItemUnderAttributeRef")
  @js.native
  def createInSortItemUnderAttributeRef(container: SortItem): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInStaticOrDynamicStringUnderAttributeRef")
  @js.native
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInVariableRefExpressionUnderMember")
  @js.native
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.createInWidgetValueUnderAttributeRef")
  @js.native
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AttributeRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
