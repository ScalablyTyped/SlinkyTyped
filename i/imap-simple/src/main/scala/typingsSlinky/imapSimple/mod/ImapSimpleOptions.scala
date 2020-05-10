package typingsSlinky.imapSimple.mod

import typingsSlinky.imap.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapSimpleOptions extends js.Object {
  /** Time in milliseconds to wait before giving up on a connection attempt. (Deprecated: please use options.imap.authTimeout instead) */
  var connectTimeout: js.UndefOr[Double] = js.native
  /** Options to pass to node-imap constructor. */
  var imap: Config = js.native
  /** Server event emitted when a message was expunged externally. seqno is the sequence number (instead of the unique UID) of the message that was expunged. If you are caching sequence numbers, all sequence numbers higher than this value MUST be decremented by 1 in order to stay synchronized with the server and to keep correct continuity. */
  var onexpunge: js.UndefOr[js.Function1[/* seqno */ Double, Unit]] = js.native
  /** Server event emitted when new mail arrives in the currently open mailbox. */
  var onmail: js.UndefOr[js.Function1[/* numNewMail */ Double, Unit]] = js.native
  /** Server event emitted when message metadata (e.g. flags) changes externally. */
  var onupdate: js.UndefOr[js.Function2[/* seqno */ Double, /* info */ js.Any, Unit]] = js.native
}

object ImapSimpleOptions {
  @scala.inline
  def apply(imap: Config): ImapSimpleOptions = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapSimpleOptions]
  }
  @scala.inline
  implicit class ImapSimpleOptionsOps[Self <: ImapSimpleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImap(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnexpunge(value: /* seqno */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onexpunge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnexpunge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onexpunge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmail(value: /* numNewMail */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnupdate(value: (/* seqno */ Double, /* info */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnupdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdate")(js.undefined)
        ret
    }
  }
  
}

