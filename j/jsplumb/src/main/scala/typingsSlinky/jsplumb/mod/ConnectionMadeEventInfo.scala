package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionMadeEventInfo extends js.Object {
  var connection: Connection = js.native
  var source: HTMLDivElement = js.native
  var sourceEndpoint: Endpoint = js.native
  var sourceId: String = js.native
  var target: HTMLDivElement = js.native
  var targetEndpoint: Endpoint = js.native
  var targetId: String = js.native
}

object ConnectionMadeEventInfo {
  @scala.inline
  def apply(
    connection: Connection,
    source: HTMLDivElement,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: HTMLDivElement,
    targetEndpoint: Endpoint,
    targetId: String
  ): ConnectionMadeEventInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionMadeEventInfo]
  }
  @scala.inline
  implicit class ConnectionMadeEventInfoOps[Self <: ConnectionMadeEventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLDivElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

