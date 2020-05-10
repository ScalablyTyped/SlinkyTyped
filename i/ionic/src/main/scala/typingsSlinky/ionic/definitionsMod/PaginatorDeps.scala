package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonReq
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  val client: IClient = js.native
  val max: js.UndefOr[Double] = js.native
  val state: js.UndefOr[Partial[S]] = js.native
  def guard(res: APIResponseSuccess): /* is T */ Boolean = js.native
  def reqgen(): js.Promise[AnonReq] = js.native
}

object PaginatorDeps {
  @scala.inline
  def apply[T, S](
    client: IClient,
    guard: APIResponseSuccess => /* is T */ Boolean,
    reqgen: () => js.Promise[AnonReq]
  ): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
  @scala.inline
  implicit class PaginatorDepsOps[Self[t, s] <: PaginatorDeps[t, s], T, S] (val x: Self[T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, S]) with Other]
    @scala.inline
    def withClient(value: IClient): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuard(value: APIResponseSuccess => /* is T */ Boolean): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReqgen(value: () => js.Promise[AnonReq]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqgen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Partial[S]): Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

