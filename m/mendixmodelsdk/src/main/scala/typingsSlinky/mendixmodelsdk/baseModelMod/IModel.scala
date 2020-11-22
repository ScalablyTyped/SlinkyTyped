package typingsSlinky.mendixmodelsdk.baseModelMod

import typingsSlinky.mendixmodelsdk.projectsMod.projects.IModule
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModel extends IBaseModel {
  
  /**
    * Given a qualified name, returns a Module.
    */
  def findModuleByQualifiedName(qualifiedName: String): IModule | Null = js.native
  
  /**
    * The actual contents of the model.
    */
  var root: IProject = js.native
}
