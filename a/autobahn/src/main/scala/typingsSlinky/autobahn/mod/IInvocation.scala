package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInvocation extends js.Object {
  var caller: js.UndefOr[Double] = js.native
  var procedure: String = js.native
  var progress: js.UndefOr[js.Function2[/* args */ js.Array[_], /* kwargs */ js.Any, Unit]] = js.native
}

object IInvocation {
  @scala.inline
  def apply(procedure: String): IInvocation = {
    val __obj = js.Dynamic.literal(procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvocation]
  }
  @scala.inline
  implicit class IInvocationOps[Self <: IInvocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcedure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaller(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caller")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: (/* args */ js.Array[_], /* kwargs */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
  }
  
}

