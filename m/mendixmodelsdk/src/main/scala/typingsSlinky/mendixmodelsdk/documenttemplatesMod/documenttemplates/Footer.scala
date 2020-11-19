package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/footer-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Footer")
@js.native
class Footer protected () extends DropZone {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def bottomMargin: Double = js.native
  def bottomMargin_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FFooter: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Footer")
@js.native
object Footer extends js.Object {
  
  /**
    * Creates and returns a new Footer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Footer = js.native
  
  /**
    * Creates and returns a new Footer instance in the SDK and on the server.
    * The new Footer will be automatically stored in the 'footer' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createIn(container: DocumentTemplate): Footer = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
