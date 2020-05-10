package typingsSlinky.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchOptions extends js.Object {
  /** A string or Array of strings containing the body part section to fetch. Default: (none) Example sections: */
  var bodies: js.UndefOr[String | js.Array[String]] = js.native
  /** Fetch the message envelope. Default: false */
  var envelope: js.UndefOr[Boolean] = js.native
  /** Mark message(s) as read when fetched. Default: false */
  var markSeen: js.UndefOr[Boolean] = js.native
  /** Fetch modifiers defined by IMAP extensions. Default: (none) */
  var modifiers: js.UndefOr[js.Object] = js.native
  /** Fetch the RFC822 size. Default: false */
  var size: js.UndefOr[Boolean] = js.native
  /** Fetch the message structure. Default: false */
  var struct: js.UndefOr[Boolean] = js.native
}

object FetchOptions {
  @scala.inline
  def apply(): FetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions]
  }
  @scala.inline
  implicit class FetchOptionsOps[Self <: FetchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodies(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodies")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvelope(value: Boolean): Self = {
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
    def withMarkSeen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markSeen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkSeen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markSeen")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStruct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("struct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStruct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("struct")(js.undefined)
        ret
    }
  }
  
}

