package typingsSlinky.mendixmodelsdk.mod.documenttemplates

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates.Style {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Style {
  
  @JSImport("mendixmodelsdk", "documenttemplates.Style")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDataGridCellUnderStyle")
  @js.native
  def createInDataGridCellUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDataGridColumnUnderStyle")
  @js.native
  def createInDataGridColumnUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDocumentTemplateUnderStyle")
  @js.native
  def createInDocumentTemplateUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDynamicLabelUnderStyle")
  @js.native
  def createInDynamicLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInGridUnderStyle")
  @js.native
  def createInGridUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Grid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInStaticLabelUnderStyle")
  @js.native
  def createInStaticLabelUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTableCellUnderStyle")
  @js.native
  def createInTableCellUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableCell): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTableUnderStyle")
  @js.native
  def createInTableUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTitleUnderStyle")
  @js.native
  def createInTitleUnderStyle(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
