package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRefetch extends js.Object {
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.native
  val refetch: ReaderRefetchMetadata = js.native
}

object AnonRefetch {
  @scala.inline
  def apply(refetch: ReaderRefetchMetadata): AnonRefetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRefetch]
  }
  @scala.inline
  implicit class AnonRefetchOps[Self <: AnonRefetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefetch(value: ReaderRefetchMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

