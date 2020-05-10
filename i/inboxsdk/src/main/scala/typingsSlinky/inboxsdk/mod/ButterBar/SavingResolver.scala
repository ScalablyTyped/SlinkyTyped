package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingResolver extends js.Object {
  def reject(): Unit = js.native
  def resolve(): Unit = js.native
}

object SavingResolver {
  @scala.inline
  def apply(reject: () => Unit, resolve: () => Unit): SavingResolver = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[SavingResolver]
  }
  @scala.inline
  implicit class SavingResolverOps[Self <: SavingResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReject(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

