package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrJobId extends js.Object {
  val bstrJobId: String = js.native
  val pFaxAccount: FaxAccount = js.native
}

object BstrJobId {
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount): BstrJobId = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobId]
  }
  @scala.inline
  implicit class BstrJobIdOps[Self <: BstrJobId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrJobId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPFaxAccount(value: FaxAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pFaxAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

