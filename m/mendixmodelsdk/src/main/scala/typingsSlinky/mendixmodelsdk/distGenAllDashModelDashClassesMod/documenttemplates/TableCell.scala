package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/cell-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableCell")
@js.native
class TableCell protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableCell {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.TableCell")
@js.native
object TableCell extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableCell = js.native
  /**
    * Creates and returns a new TableCell instance in the SDK and on the server.
    * The new TableCell will be automatically stored in the 'cells' property
    * of the parent TableRow element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableRow): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableCell = js.native
}

