package typingsSlinky.reduxDuck.mod

import typingsSlinky.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-duck", "createDuck")
@js.native
object createDuck extends js.Object {
  
  def apply(a: DuckName): DuckBuilder[AnyAction] = js.native
  def apply(a: DuckName, b: AppName): DuckBuilder[AnyAction] = js.native
}
