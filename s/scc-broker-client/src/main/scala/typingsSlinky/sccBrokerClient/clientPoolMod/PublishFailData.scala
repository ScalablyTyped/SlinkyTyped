package typingsSlinky.sccBrokerClient.clientPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishFailData extends js.Object {
  var channel: String
  var error: js.Error
  var poolIndex: Double
  var targetURI: String
}

object PublishFailData {
  @scala.inline
  def apply(channel: String, error: js.Error, poolIndex: Double, targetURI: String): PublishFailData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], poolIndex = poolIndex.asInstanceOf[js.Any], targetURI = targetURI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublishFailData]
  }
}

