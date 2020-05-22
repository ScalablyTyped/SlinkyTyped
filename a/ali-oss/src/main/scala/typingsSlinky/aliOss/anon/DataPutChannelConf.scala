package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import typingsSlinky.aliOss.mod.PutChannelConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPutChannelConf extends js.Object {
  var data: PutChannelConf
  var res: NormalSuccessResponse
}

object DataPutChannelConf {
  @scala.inline
  def apply(data: PutChannelConf, res: NormalSuccessResponse): DataPutChannelConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPutChannelConf]
  }
}

