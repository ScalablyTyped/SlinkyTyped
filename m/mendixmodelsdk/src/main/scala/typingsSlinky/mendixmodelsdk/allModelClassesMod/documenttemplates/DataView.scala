package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-view-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataView")
@js.native
class DataView protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataView")
@js.native
object DataView extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView = js.native
  /**
    * Creates and returns a new DataView instance in the SDK and on the server.
    * The new DataView will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DropZone): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataView = js.native
}

