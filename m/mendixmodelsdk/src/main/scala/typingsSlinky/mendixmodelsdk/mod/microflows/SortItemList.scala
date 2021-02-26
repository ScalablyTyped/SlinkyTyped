package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.SortItemList")
@js.native
class SortItemList protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.SortItemList {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object SortItemList {
  
  @JSImport("mendixmodelsdk", "microflows.SortItemList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortItemList.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortItemList.createInDatabaseRetrieveSourceUnderSortItemList")
  @js.native
  def createInDatabaseRetrieveSourceUnderSortItemList(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.DatabaseRetrieveSource): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent Sort element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortItemList.createInSortUnderSortItemList")
  @js.native
  def createInSortUnderSortItemList(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.Sort): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortItemList.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.SortItemList.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
