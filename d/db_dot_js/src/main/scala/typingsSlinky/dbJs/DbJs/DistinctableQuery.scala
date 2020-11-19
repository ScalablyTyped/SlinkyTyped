package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistinctableQuery[T] extends js.Object {
  
  def distinct(): DistinctQuery[T] = js.native
  def distinct(filter: js.Function1[/* value */ T, Boolean]): DistinctQuery[T] = js.native
}
