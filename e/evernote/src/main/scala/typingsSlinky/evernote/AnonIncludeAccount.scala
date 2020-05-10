package typingsSlinky.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeAccount extends js.Object {
  var includeAccount: js.UndefOr[Boolean] = js.native
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.native
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.native
}

object AnonIncludeAccount {
  @scala.inline
  def apply(): AnonIncludeAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeAccount]
  }
  @scala.inline
  implicit class AnonIncludeAccountOps[Self <: AnonIncludeAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBusinessLinkedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBusinessLinkedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBusinessLinkedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBusinessLinkedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePersonalLinkedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePersonalLinkedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePersonalLinkedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePersonalLinkedNotebooks")(js.undefined)
        ret
    }
  }
  
}

