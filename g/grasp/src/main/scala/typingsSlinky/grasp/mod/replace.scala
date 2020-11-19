package typingsSlinky.grasp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grasp", "replace")
@js.native
object replace extends js.Object {
  
  def apply(engine: QueryEngineType): GraspReplaceWithQueryEngine = js.native
  def apply(engine: QueryEngineType, selector: String): GraspReplaceWithSelector = js.native
  def apply(engine: QueryEngineType, selector: String, replacement: Replacement): js.Function1[/* input */ String, String] = js.native
  def apply(engine: QueryEngineType, selector: String, replacement: Replacement, input: String): String = js.native
}
