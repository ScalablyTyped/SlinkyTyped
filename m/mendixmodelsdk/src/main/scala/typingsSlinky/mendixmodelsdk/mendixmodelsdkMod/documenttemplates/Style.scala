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
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.Style {
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
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(
    container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
  ): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(
    container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplate
  ): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Grid): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticLabel): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableCell): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Table): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Title): typingsSlinky.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
}

