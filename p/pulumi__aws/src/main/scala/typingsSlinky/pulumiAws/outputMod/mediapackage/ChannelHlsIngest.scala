package typingsSlinky.pulumiAws.outputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHlsIngest extends js.Object {
  /**
    * A list of the ingest endpoints
    */
  var ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint] = js.native
}

object ChannelHlsIngest {
  @scala.inline
  def apply(ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]): ChannelHlsIngest = {
    val __obj = js.Dynamic.literal(ingestEndpoints = ingestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHlsIngest]
  }
  @scala.inline
  implicit class ChannelHlsIngestOps[Self <: ChannelHlsIngest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIngestEndpoints(value: js.Array[ChannelHlsIngestIngestEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

