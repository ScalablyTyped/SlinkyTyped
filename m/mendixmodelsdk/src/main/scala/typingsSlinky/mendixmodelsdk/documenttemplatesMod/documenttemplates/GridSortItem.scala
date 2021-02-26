package typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.pages.SortDirection
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem")
@js.native
class GridSortItem protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef = js.native
  def attributeRef_=(newValue: AttributeRef): Unit = js.native
  
  def containerAsGridSortBar: GridSortBar = js.native
  
  def sortOrder: SortDirection = js.native
  def sortOrder_=(newValue: SortDirection): Unit = js.native
}
object GridSortItem {
  
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem.create")
  @js.native
  def create(model: IModel): GridSortItem = js.native
  
  /**
    * Creates and returns a new GridSortItem instance in the SDK and on the server.
    * The new GridSortItem will be automatically stored in the 'sortItems' property
    * of the parent GridSortBar element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem.createIn")
  @js.native
  def createIn(container: GridSortBar): GridSortItem = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.GridSortItem.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
