package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.15.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.ITemplateType because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IWorkflowTemplateType because Already inherited
- typingsSlinky.mendixmodelsdk.pagesMod.pages.IWorkflowOverviewTemplateType because var conflicts: containerAsPageTemplate, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType")
@js.native
class WorkflowOverviewTemplateType protected () extends WorkflowTemplateType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsPageTemplate")
  def containerAsPageTemplate_MWorkflowOverviewTemplateType: PageTemplate = js.native
}
object WorkflowOverviewTemplateType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowOverviewTemplateType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType.create")
  @js.native
  def create(model: IModel): WorkflowOverviewTemplateType = js.native
  
  /**
    * Creates and returns a new WorkflowOverviewTemplateType instance in the SDK and on the server.
    * The new WorkflowOverviewTemplateType will be automatically stored in the 'templateType' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType.createIn")
  @js.native
  def createIn(container: PageTemplate): WorkflowOverviewTemplateType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WorkflowOverviewTemplateType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
