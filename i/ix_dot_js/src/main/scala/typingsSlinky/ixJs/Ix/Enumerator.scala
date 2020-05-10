package typingsSlinky.ixJs.Ix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enumerator[T] extends Disposable {
  def getCurrent(): T = js.native
  def moveNext(): Boolean = js.native
}

@JSGlobal("Ix.Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorStatic]

