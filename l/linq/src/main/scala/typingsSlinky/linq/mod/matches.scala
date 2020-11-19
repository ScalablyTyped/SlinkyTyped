package typingsSlinky.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("linq", "matches")
@js.native
object matches extends js.Object {
  
  def apply[T](input: String, pattern: String): IEnumerable[T] = js.native
  def apply[T](input: String, pattern: String, flags: String): IEnumerable[T] = js.native
  def apply[T](input: String, pattern: js.RegExp): IEnumerable[T] = js.native
}
