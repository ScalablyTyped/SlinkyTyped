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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn")
@js.native
class DataGridColumn protected ()
  extends typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataGridColumn {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn = js.native
  
  /**
    * Creates and returns a new DataGridColumn instance in the SDK and on the server.
    * The new DataGridColumn will be automatically stored in the 'columns' property
    * of the parent DataGrid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGrid): typingsSlinky.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DataGridColumn.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
