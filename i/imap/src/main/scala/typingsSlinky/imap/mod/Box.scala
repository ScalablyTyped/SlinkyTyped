package typingsSlinky.imap.mod

import typingsSlinky.imap.anon.New
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
  /** array - A list of system-defined flags applicable for this mailbox. Flags in this list but not in permFlags may be stored for the current session only. Additional server implementation-specific flags may also be available. */
  var flags: js.Array[String] = js.native
  /** Contains various message counts for this mailbox: */
  var messages: New = js.native
  /** The name of this mailbox. */
  var name: String = js.native
  /** True if new keywords can be added to messages in this mailbox. */
  var newKeywords: Boolean = js.native
  /** A list of flags that can be permanently added/removed to/from messages in this mailbox. */
  var permFlags: js.Array[String] = js.native
  /** Whether or not this mailbox has persistent UIDs. This should almost always be true for modern mailboxes and should only be false for legacy mail stores where supporting persistent UIDs was not technically feasible. */
  var persistentUIDs: Boolean = js.native
  /** True if this mailbox was opened in read-only mode. (Only available with openBox() calls) */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** The uid that will be assigned to the next message that arrives at this mailbox. */
  var uidnext: Double = js.native
  /** A 32-bit number that can be used to determine if UIDs in this mailbox have changed since the last time this mailbox was opened. */
  var uidvalidity: Double = js.native
}

object Box {
  @scala.inline
  def apply(
    flags: js.Array[String],
    messages: New,
    name: String,
    newKeywords: Boolean,
    permFlags: js.Array[String],
    persistentUIDs: Boolean,
    uidnext: Double,
    uidvalidity: Double
  ): Box = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newKeywords = newKeywords.asInstanceOf[js.Any], permFlags = permFlags.asInstanceOf[js.Any], persistentUIDs = persistentUIDs.asInstanceOf[js.Any], uidnext = uidnext.asInstanceOf[js.Any], uidvalidity = uidvalidity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: New): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewKeywords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistentUIDs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentUIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUidnext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uidnext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUidvalidity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uidvalidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
  }
  
}

