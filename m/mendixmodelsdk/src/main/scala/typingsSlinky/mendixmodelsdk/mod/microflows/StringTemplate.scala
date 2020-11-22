package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.UserTask
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.Workflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
class StringTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.StringTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
object StringTemplate extends js.Object {
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  def createInCustomRequestHandlingUnderTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CustomRequestHandling): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  def createInLogMessageActionUnderMessageTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.LogMessageAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  def createInStringTemplateParameterValueUnderTemplate(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplateParameterValue): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'description' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInUserTaskUnderDescription(container: UserTask): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInUserTaskUnderSubject(container: UserTask): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'subject' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInWorkflowUnderSubject(container: Workflow): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.StringTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
