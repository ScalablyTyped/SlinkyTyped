package typingsSlinky.mendixmodelsdk.projectsMod.projects

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
  */
@js.native
trait IProjectDocument extends IModelUnit {
  
  val containerAsProject: IProject = js.native
  
  @JSName("model")
  val model_IProjectDocument: IModel = js.native
}
