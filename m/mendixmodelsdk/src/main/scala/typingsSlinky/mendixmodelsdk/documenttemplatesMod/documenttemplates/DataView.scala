package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataView")
@js.native
class DataView protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def contents: DataViewContents = js.native
  def contents_=(newValue: DataViewContents): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  @JSName("model")
  var model_FDataView: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataView")
@js.native
object DataView extends js.Object {
  
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataView = js.native
  
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DataView = js.native
  
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): DataView = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
