package typingsSlinky.ramda.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  def apply[T](fn: js.Function1[/* value */ T, Boolean]): FilterOnceApplied[T] = js.native
  def apply[T](fn: js.Function1[/* value */ T, Boolean], list: js.Array[T]): js.Array[T] = js.native
  def apply[T](fn: js.Function1[/* value */ T, Boolean], obj: Dictionary[T]): Dictionary[T] = js.native
}
