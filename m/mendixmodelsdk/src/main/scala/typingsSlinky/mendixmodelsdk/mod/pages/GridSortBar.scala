package typingsSlinky.mendixmodelsdk.mod.pages

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
  * See: {@link https://docs.mendix.com/refguide/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.GridSortBar")
@js.native
class GridSortBar protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.GridSortBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSortBar {
  
  @JSImport("mendixmodelsdk", "pages.GridSortBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.createInDropDownSearchFieldUnderSortBar")
  @js.native
  def createInDropDownSearchFieldUnderSortBar(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DropDownSearchField): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.createInSelectorDatabaseSourceUnderSortBar")
  @js.native
  def createInSelectorDatabaseSourceUnderSortBar(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SelectorDatabaseSource): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.createInSelectorXPathSourceUnderSortBar")
  @js.native
  def createInSelectorXPathSourceUnderSortBar(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SelectorXPathSource): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.createInSortableEntityPathSourceUnderSortBar")
  @js.native
  def createInSortableEntityPathSourceUnderSortBar(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.SortableEntityPathSource): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSortBar = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GridSortBar.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
