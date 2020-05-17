package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.APIResponseSuccess
import typingsSlinky.ionic.definitionsMod.PaginatorGuard
import typingsSlinky.ionic.definitionsMod.PaginatorRequestGenerator
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.definitionsMod.Snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.Snapshot>>>> */
@js.native
trait PartialPaginateArgsResponGuard extends js.Object {
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[Snapshot]]]] = js.native
  var max: js.UndefOr[Double] = js.native
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.native
  var state: js.UndefOr[PartialPaginatorState] = js.native
}

object PartialPaginateArgsResponGuard {
  @scala.inline
  def apply(): PartialPaginateArgsResponGuard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsResponGuard]
  }
  @scala.inline
  implicit class PartialPaginateArgsResponGuardOps[Self <: PartialPaginateArgsResponGuard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGuard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withReqgen(value: () => js.Promise[Req]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqgen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReqgen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqgen")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: PartialPaginatorState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

