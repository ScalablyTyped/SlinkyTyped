package typingsSlinky.meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactiveVar[T] extends js.Object {
  def get(): T = js.native
  def set(newValue: T): Unit = js.native
}

@JSGlobal("ReactiveVar")
@js.native
object ReactiveVar extends TopLevel[ReactiveVarStatic]

