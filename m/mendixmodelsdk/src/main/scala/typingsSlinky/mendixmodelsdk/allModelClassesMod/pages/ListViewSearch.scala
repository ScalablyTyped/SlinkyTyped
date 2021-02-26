package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch")
@js.native
class ListViewSearch protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ListViewSearch {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewDatabaseSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch.createInListViewDatabaseSourceUnderSearch")
  @js.native
  def createInListViewDatabaseSourceUnderSearch(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewDatabaseSource): typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch = js.native
  
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewXPathSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch.createInListViewXPathSourceUnderSearch")
  @js.native
  def createInListViewXPathSourceUnderSearch(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewXPathSource): typingsSlinky.mendixmodelsdk.pagesMod.pages.ListViewSearch = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListViewSearch.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
