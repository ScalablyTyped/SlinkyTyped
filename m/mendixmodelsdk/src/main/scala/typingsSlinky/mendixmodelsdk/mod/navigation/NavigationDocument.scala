package typingsSlinky.mendixmodelsdk.mod.navigation

import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.navigation.NavigationDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): typingsSlinky.mendixmodelsdk.navigationMod.navigation.NavigationDocument = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
