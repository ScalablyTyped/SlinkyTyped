package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

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
  * See: {@link https://docs.mendix.com/refguide/template-grid-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid")
@js.native
class TemplateGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def evenRowsContents: TemplateGridContents | Null = js.native
  def evenRowsContents_=(newValue: TemplateGridContents | Null): Unit = js.native
  
  def numberOfColumns: Double = js.native
  def numberOfColumns_=(newValue: Double): Unit = js.native
  
  def oddRowsContents: TemplateGridContents = js.native
  def oddRowsContents_=(newValue: TemplateGridContents): Unit = js.native
}
object TemplateGrid {
  
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid.create")
  @js.native
  def create(model: IModel): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid.createInDocumentTemplateUnderToplevels")
  @js.native
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): TemplateGrid = js.native
  
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid.createInDropZoneUnderWidget")
  @js.native
  def createInDropZoneUnderWidget(container: DropZone): TemplateGrid = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
