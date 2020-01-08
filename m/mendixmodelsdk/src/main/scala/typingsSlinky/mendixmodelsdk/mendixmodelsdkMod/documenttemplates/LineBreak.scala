package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/line-break-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.LineBreak")
@js.native
class LineBreak protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.LineBreak {
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
@JSImport("mendixmodelsdk", "documenttemplates.LineBreak")
@js.native
object LineBreak extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.LineBreak = js.native
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * The new LineBreak will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(
    container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplate
  ): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.LineBreak = js.native
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * The new LineBreak will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DropZone): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.LineBreak = js.native
}

