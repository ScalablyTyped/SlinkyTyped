package typingsSlinky.paystack.anon

import typingsSlinky.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listbanks extends js.Object {
  def list_banks(params: Page): js.Promise[ResponsedataArrayany] = js.native
  def resolve_bin(bin: String): js.Promise[Response] = js.native
}

object Listbanks {
  @scala.inline
  def apply(list_banks: Page => js.Promise[ResponsedataArrayany], resolve_bin: String => js.Promise[Response]): Listbanks = {
    val __obj = js.Dynamic.literal(list_banks = js.Any.fromFunction1(list_banks), resolve_bin = js.Any.fromFunction1(resolve_bin))
    __obj.asInstanceOf[Listbanks]
  }
  @scala.inline
  implicit class ListbanksOps[Self <: Listbanks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList_banks(value: Page => js.Promise[ResponsedataArrayany]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list_banks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve_bin(value: String => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve_bin")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

