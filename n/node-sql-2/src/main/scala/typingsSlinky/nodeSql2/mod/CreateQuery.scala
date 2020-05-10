package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQuery extends Executable {
  def ifNotExists(): Executable = js.native
}

object CreateQuery {
  @scala.inline
  def apply(ifNotExists: () => Executable, toQuery: () => QueryLike): CreateQuery = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), toQuery = js.Any.fromFunction0(toQuery))
    __obj.asInstanceOf[CreateQuery]
  }
  @scala.inline
  implicit class CreateQueryOps[Self <: CreateQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfNotExists(value: () => Executable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

