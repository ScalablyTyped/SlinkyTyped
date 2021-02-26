package typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate")
@js.native
class StringTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInCustomRequestHandlingUnderTemplate")
  @js.native
  def createInCustomRequestHandlingUnderTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CustomRequestHandling): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInHttpConfigurationUnderCustomLocationTemplate")
  @js.native
  def createInHttpConfigurationUnderCustomLocationTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInLogMessageActionUnderMessageTemplate")
  @js.native
  def createInLogMessageActionUnderMessageTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.LogMessageAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInStringTemplateParameterValueUnderTemplate")
  @js.native
  def createInStringTemplateParameterValueUnderTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'description' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInUserTaskUnderDescription")
  @js.native
  def createInUserTaskUnderDescription(container: UserTask): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInUserTaskUnderSubject")
  @js.native
  def createInUserTaskUnderSubject(container: UserTask): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.createInWorkflowUnderSubject")
  @js.native
  def createInWorkflowUnderSubject(container: Workflow): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.StringTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
