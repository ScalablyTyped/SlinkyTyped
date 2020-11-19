package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.imagesMod.images.IImage
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-image-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
class DynamicImageViewer protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def defaultImage: IImage | Null = js.native
  
  def defaultImageQualifiedName: String | Null = js.native
  
  def defaultImage_=(newValue: IImage | Null): Unit = js.native
  
  def height: Double = js.native
  def height_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FDynamicImageViewer: IModel = js.native
  
  def useThumbnail: Boolean = js.native
  def useThumbnail_=(newValue: Boolean): Unit = js.native
  
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
object DynamicImageViewer extends js.Object {
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DynamicImageViewer = js.native
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicImageViewer = js.native
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): DynamicImageViewer = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
