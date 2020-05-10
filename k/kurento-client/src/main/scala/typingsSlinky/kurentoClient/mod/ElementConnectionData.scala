package typingsSlinky.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementConnectionData extends js.Object {
  var sink: WebRtcEndpoint = js.native
  var sinkDescription: String = js.native
  var source: WebRtcEndpoint = js.native
  var sourceDescription: String = js.native
  var `type`: js.Any = js.native
}

object ElementConnectionData {
  @scala.inline
  def apply(
    sink: WebRtcEndpoint,
    sinkDescription: String,
    source: WebRtcEndpoint,
    sourceDescription: String,
    `type`: js.Any
  ): ElementConnectionData = {
    val __obj = js.Dynamic.literal(sink = sink.asInstanceOf[js.Any], sinkDescription = sinkDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementConnectionData]
  }
  @scala.inline
  implicit class ElementConnectionDataOps[Self <: ElementConnectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSink(value: WebRtcEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSinkDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sinkDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: WebRtcEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

