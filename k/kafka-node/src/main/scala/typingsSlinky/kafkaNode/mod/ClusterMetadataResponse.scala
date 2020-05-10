package typingsSlinky.kafkaNode.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.kafkaNode.AnonControllerId
import typingsSlinky.kafkaNode.AnonIsr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMetadataResponse extends js.Object {
  var clusterMetadata: AnonControllerId = js.native
  var metadata: StringDictionary[NumberDictionary[AnonIsr]] = js.native
}

object ClusterMetadataResponse {
  @scala.inline
  def apply(clusterMetadata: AnonControllerId, metadata: StringDictionary[NumberDictionary[AnonIsr]]): ClusterMetadataResponse = {
    val __obj = js.Dynamic.literal(clusterMetadata = clusterMetadata.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadataResponse]
  }
  @scala.inline
  implicit class ClusterMetadataResponseOps[Self <: ClusterMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterMetadata(value: AnonControllerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[NumberDictionary[AnonIsr]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

