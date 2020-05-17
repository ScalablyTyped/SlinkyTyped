package typingsSlinky.activexFaxcomexlib.anon

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BstrMessageId extends js.Object {
  val bstrMessageId: String = js.native
  val fAddedToReceiveFolder: Boolean = js.native
  val pFaxAccount: FaxAccount = js.native
}

object BstrMessageId {
  @scala.inline
  def apply(bstrMessageId: String, fAddedToReceiveFolder: Boolean, pFaxAccount: FaxAccount): BstrMessageId = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fAddedToReceiveFolder = fAddedToReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageId]
  }
  @scala.inline
  implicit class BstrMessageIdOps[Self <: BstrMessageId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBstrMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bstrMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAddedToReceiveFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fAddedToReceiveFolder")(value.asInstanceOf[js.Any])
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

