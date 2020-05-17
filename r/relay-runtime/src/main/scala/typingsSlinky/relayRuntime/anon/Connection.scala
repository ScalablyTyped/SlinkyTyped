package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.native
  val mask: js.UndefOr[Boolean] = js.native
  val plural: js.UndefOr[Boolean] = js.native
  val refetch: js.UndefOr[ReaderRefetchMetadata] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: js.Array[ConnectionMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withPlural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetch(value: ReaderRefetchMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(js.undefined)
        ret
    }
  }
  
}

