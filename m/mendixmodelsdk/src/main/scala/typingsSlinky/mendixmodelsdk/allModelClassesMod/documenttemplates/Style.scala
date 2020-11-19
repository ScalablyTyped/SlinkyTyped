package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Grid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableCell): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
