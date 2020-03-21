package typingsSlinky.jweixin

import typingsSlinky.jweixin.mod.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworkType extends js.Object {
  var networkType: typingsSlinky.jweixin.mod.networkType
}

object AnonNetworkType {
  @scala.inline
  def apply(networkType: networkType): AnonNetworkType = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNetworkType]
  }
}

