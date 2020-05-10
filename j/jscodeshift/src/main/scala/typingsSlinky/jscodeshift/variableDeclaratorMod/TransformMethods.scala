package typingsSlinky.jscodeshift.variableDeclaratorMod

import typingsSlinky.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformMethods[N] extends js.Object {
  /**
    * Renames a variable and all its occurrences.
    * This method only applies to VariableDeclarator typed collections.
    */
  def renameTo(newName: String): Collection[N] = js.native
}

object TransformMethods {
  @scala.inline
  def apply[N](renameTo: String => Collection[N]): TransformMethods[N] = {
    val __obj = js.Dynamic.literal(renameTo = js.Any.fromFunction1(renameTo))
    __obj.asInstanceOf[TransformMethods[N]]
  }
  @scala.inline
  implicit class TransformMethodsOps[Self[n] <: TransformMethods[n], N] (val x: Self[N]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[N] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[N] with Other]
    @scala.inline
    def withRenameTo(value: String => Collection[N]): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameTo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

