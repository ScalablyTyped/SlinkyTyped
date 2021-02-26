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

@JSImport("mendixmodelsdk", "pages.LayoutGridRow")
@js.native
class LayoutGridRow protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.LayoutGridRow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LayoutGridRow {
  
  @JSImport("mendixmodelsdk", "pages.LayoutGridRow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutGridRow.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow = js.native
  
  /**
    * Creates and returns a new LayoutGridRow instance in the SDK and on the server.
    * The new LayoutGridRow will be automatically stored in the 'rows' property
    * of the parent LayoutGrid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutGridRow.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGrid): typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutGridRow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.LayoutGridRow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
