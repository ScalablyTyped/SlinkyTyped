package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): Boolean = js.native
}

object AnonIsEquivalent {
  @scala.inline
  def apply[T](isEquivalent: T => Boolean): AnonIsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[AnonIsEquivalent[T]]
  }
  @scala.inline
  implicit class AnonIsEquivalentOps[Self[t] <: AnonIsEquivalent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsEquivalent(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEquivalent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

