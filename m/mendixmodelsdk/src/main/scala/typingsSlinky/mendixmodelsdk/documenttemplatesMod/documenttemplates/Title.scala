package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/title-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Title")
@js.native
class Title protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  
  @JSName("model")
  var model_FTitle: IModel = js.native
  
  def style: Style = js.native
  def style_=(newValue: Style): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Title")
@js.native
object Title extends js.Object {
  
  /**
    * Creates and returns a new Title instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Title = js.native
  
  /**
    * Creates and returns a new Title instance in the SDK and on the server.
    * The new Title will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): Title = js.native
  
  /**
    * Creates and returns a new Title instance in the SDK and on the server.
    * The new Title will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): Title = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
