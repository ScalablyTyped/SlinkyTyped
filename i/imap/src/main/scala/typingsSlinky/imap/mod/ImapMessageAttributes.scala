package typingsSlinky.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapMessageAttributes extends js.Object {
  /** The internal server date for the message. */
  var date: js.Date = js.native
  /** A list of flags currently set on this message. */
  var flags: js.Array[String] = js.native
  /** The RFC822 message size (only set if requested with fetch()). */
  var size: js.UndefOr[Double] = js.native
  /** The message's body structure (only set if requested with fetch()). */
  var struct: js.UndefOr[js.Array[_]] = js.native
  /** A 32-bit ID that uniquely identifies this message within its mailbox. */
  var uid: Double = js.native
}

object ImapMessageAttributes {
  @scala.inline
  def apply(date: js.Date, flags: js.Array[String], uid: Double): ImapMessageAttributes = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapMessageAttributes]
  }
  @scala.inline
  implicit class ImapMessageAttributesOps[Self <: ImapMessageAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
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
    def withStruct(value: js.Array[_]): Self = {
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

