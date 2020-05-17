package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): Boolean = js.native
}

object IsEquivalent {
  @scala.inline
  def apply[T](isEquivalent: T => Boolean): IsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[IsEquivalent[T]]
  }
  @scala.inline
  implicit class IsEquivalentOps[Self[t] <: IsEquivalent[t], T] (val x: Self[T]) extends AnyVal {
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

