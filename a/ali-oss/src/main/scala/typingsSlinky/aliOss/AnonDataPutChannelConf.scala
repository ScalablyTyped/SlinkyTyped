package typingsSlinky.aliOss

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import typingsSlinky.aliOss.mod.PutChannelConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataPutChannelConf extends js.Object {
  var data: PutChannelConf
  var res: NormalSuccessResponse
}

object AnonDataPutChannelConf {
  @scala.inline
  def apply(data: PutChannelConf, res: NormalSuccessResponse): AnonDataPutChannelConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataPutChannelConf]
  }
}

