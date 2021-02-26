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

/**
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton")
@js.native
class GridSelectAllButton protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSelectAllButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GridSelectAllButton {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GridSelectAllButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSelectAllButton = js.native
  
  /**
    * Creates and returns a new GridSelectAllButton instance in the SDK and on the server.
    * The new GridSelectAllButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBar): typingsSlinky.mendixmodelsdk.pagesMod.pages.GridSelectAllButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.GridSelectAllButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
