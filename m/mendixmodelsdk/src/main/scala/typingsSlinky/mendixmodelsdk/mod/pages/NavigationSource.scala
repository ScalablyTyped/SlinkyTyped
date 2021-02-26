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

@JSImport("mendixmodelsdk", "pages.NavigationSource")
@js.native
class NavigationSource protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.NavigationSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NavigationSource {
  
  @JSImport("mendixmodelsdk", "pages.NavigationSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NavigationSource.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationSource = js.native
  
  /**
    * Creates and returns a new NavigationSource instance in the SDK and on the server.
    * The new NavigationSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NavigationSource.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.MenuWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationSource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NavigationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.NavigationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
