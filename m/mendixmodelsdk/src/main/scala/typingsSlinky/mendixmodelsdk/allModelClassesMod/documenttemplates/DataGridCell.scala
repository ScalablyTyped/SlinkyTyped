package typingsSlinky.mendixmodelsdk.allModelClassesMod.documenttemplates

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
  * See: {@link https://docs.mendix.com/refguide/columns-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell")
@js.native
class DataGridCell protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataGridCell {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell.createInDataGridColumnUnderEvenRowsCell")
  @js.native
  def createInDataGridColumnUnderEvenRowsCell(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell.createInDataGridColumnUnderOddRowsCell")
  @js.native
  def createInDataGridColumnUnderOddRowsCell(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridCell.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
