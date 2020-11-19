package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.pagesMod.pages.PageSettings
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TextTemplate")
@js.native
class TextTemplate protected () extends Template {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FTextTemplate: IModel = js.native
  
  def text: Text = js.native
  def text_=(newValue: Text): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.TextTemplate")
@js.native
object TextTemplate extends js.Object {
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'titleOverride' property
    * of the parent pages.PageSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  def createInPageSettingsUnderTitleOverride(container: PageSettings): TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'template' property
    * of the parent ShowMessageAction element passed as argument.
    */
  def createInShowMessageActionUnderTemplate(container: ShowMessageAction): TextTemplate = js.native
  
  /**
    * Creates and returns a new TextTemplate instance in the SDK and on the server.
    * The new TextTemplate will be automatically stored in the 'feedbackTemplate' property
    * of the parent ValidationFeedbackAction element passed as argument.
    */
  def createInValidationFeedbackActionUnderFeedbackTemplate(container: ValidationFeedbackAction): TextTemplate = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
