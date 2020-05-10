package typingsSlinky.maildev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for mail.
  */
@js.native
trait Mail extends js.Object {
  /**
    * Client.
    */
  var envelope: js.UndefOr[js.Object] = js.native
  /**
    * Identifier.
    */
  var id: js.UndefOr[String] = js.native
}

object Mail {
  @scala.inline
  def apply(): Mail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mail]
  }
  @scala.inline
  implicit class MailOps[Self <: Mail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvelope(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvelope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

