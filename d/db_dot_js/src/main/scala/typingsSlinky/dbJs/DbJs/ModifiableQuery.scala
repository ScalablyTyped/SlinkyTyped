package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifiableQuery[T] extends js.Object {
  
  def modify(filter: js.Function1[/* value */ T, Boolean]): ExecutableQuery[T] = js.native
  def modify(modifyObj: js.Any): ExecutableQuery[T] = js.native
}
