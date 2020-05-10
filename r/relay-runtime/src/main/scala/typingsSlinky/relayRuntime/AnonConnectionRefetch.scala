package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.connectionHandlerMod.ConnectionMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnectionRefetch extends js.Object {
  val connection: js.Array[ConnectionMetadata] = js.native
  val refetch: ReaderRefetchMetadataconn = js.native
}

object AnonConnectionRefetch {
  @scala.inline
  def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): AnonConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnectionRefetch]
  }
  @scala.inline
  implicit class AnonConnectionRefetchOps[Self <: AnonConnectionRefetch] (val x: Self) extends AnyVal {
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
    def withRefetch(value: ReaderRefetchMetadataconn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

