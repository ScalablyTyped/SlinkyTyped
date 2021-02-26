package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
@js.native
class ListViewDatabaseSource protected () extends DatabaseSourceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def search: ListViewSearch = js.native
  def search_=(newValue: ListViewSearch): Unit = js.native
}
object ListViewDatabaseSource {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.create")
  @js.native
  def create(model: IModel): ListViewDatabaseSource = js.native
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.createIn")
  @js.native
  def createIn(container: EntityWidget): ListViewDatabaseSource = js.native
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.createInEntityWidgetUnderDataSource")
  @js.native
  def createInEntityWidgetUnderDataSource(container: EntityWidget): ListViewDatabaseSource = js.native
  
  /**
    * Creates and returns a new ListViewDatabaseSource instance in the SDK and on the server.
    * The new ListViewDatabaseSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.createInWidgetValueUnderDataSource")
  @js.native
  def createInWidgetValueUnderDataSource(container: WidgetValue): ListViewDatabaseSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewDatabaseSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
