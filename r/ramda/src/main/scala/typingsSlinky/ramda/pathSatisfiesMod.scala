package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/pathSatisfies", JSImport.Namespace)
@js.native
object pathSatisfiesMod extends js.Object {
  
  def default[T, U](pred: js.Function1[/* val */ T, Boolean]): js.Any = js.native
  def default[T, U](pred: js.Function1[/* val */ T, Boolean], path: Path): js.Function1[/* obj */ U, Boolean] = js.native
  def default[T, U](pred: js.Function1[/* val */ T, Boolean], path: Path, obj: U): Boolean = js.native
}
