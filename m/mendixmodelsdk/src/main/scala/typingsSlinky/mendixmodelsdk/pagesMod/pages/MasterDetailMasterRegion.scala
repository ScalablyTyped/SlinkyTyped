package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion")
@js.native
class MasterDetailMasterRegion protected () extends MasterDetailRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def responsiveWeight: Double = js.native
  def responsiveWeight_=(newValue: Double): Unit = js.native
  
  def tabletWeight: Double = js.native
  def tabletWeight_=(newValue: Double): Unit = js.native
}
object MasterDetailMasterRegion {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MasterDetailMasterRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion.create")
  @js.native
  def create(model: IModel): MasterDetailMasterRegion = js.native
  
  /**
    * Creates and returns a new MasterDetailMasterRegion instance in the SDK and on the server.
    * The new MasterDetailMasterRegion will be automatically stored in the 'master' property
    * of the parent MasterDetail element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion.createIn")
  @js.native
  def createIn(container: MasterDetail): MasterDetailMasterRegion = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MasterDetailMasterRegion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
