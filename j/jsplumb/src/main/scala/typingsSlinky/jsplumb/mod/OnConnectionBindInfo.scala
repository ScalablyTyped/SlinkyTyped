package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnConnectionBindInfo extends js.Object {
  var connection: Connection = js.native
  //- the source Endpoint in the Connection
  var newSourceEndpoint: Endpoint = js.native
  var newSourceId: String = js.native
  //- the targetEndpoint in the Connection
  var newTargetEndpoint: Endpoint = js.native
  var newTargetId: String = js.native
  // - id of the source element in the Connection
  var originalSourceId: String = js.native
  // - id of the target element in the Connection
  var originalTargetId: String = js.native
  var source: Element = js.native
  //- the target element in the Connection
  var sourceEndpoint: Endpoint = js.native
  // the new Connection.you can register listeners on this etc.
  var sourceId: String = js.native
  // - the source element in the Connection
  var target: Element = js.native
  var targetEndpoint: Endpoint = js.native
  var targetId: String = js.native
}

object OnConnectionBindInfo {
  @scala.inline
  def apply(
    connection: Connection,
    newSourceEndpoint: Endpoint,
    newSourceId: String,
    newTargetEndpoint: Endpoint,
    newTargetId: String,
    originalSourceId: String,
    originalTargetId: String,
    source: Element,
    sourceEndpoint: Endpoint,
    sourceId: String,
    target: Element,
    targetEndpoint: Endpoint,
    targetId: String
  ): OnConnectionBindInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], newSourceEndpoint = newSourceEndpoint.asInstanceOf[js.Any], newSourceId = newSourceId.asInstanceOf[js.Any], newTargetEndpoint = newTargetEndpoint.asInstanceOf[js.Any], newTargetId = newTargetId.asInstanceOf[js.Any], originalSourceId = originalSourceId.asInstanceOf[js.Any], originalTargetId = originalTargetId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceEndpoint = sourceEndpoint.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetEndpoint = targetEndpoint.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnConnectionBindInfo]
  }
  @scala.inline
  implicit class OnConnectionBindInfoOps[Self <: OnConnectionBindInfo] (val x: Self) extends AnyVal {
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
    def withNewSourceEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSourceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTargetEndpoint(value: Endpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTargetEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Element): Self = {
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
    def withTarget(value: Element): Self = {
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

