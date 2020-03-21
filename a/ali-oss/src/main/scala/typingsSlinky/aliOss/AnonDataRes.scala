package typingsSlinky.aliOss

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import typingsSlinky.aliOss.mod.StyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataRes extends js.Object {
  var data: StyleData
  var res: NormalSuccessResponse
}

object AnonDataRes {
  @scala.inline
  def apply(data: StyleData, res: NormalSuccessResponse): AnonDataRes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataRes]
  }
}

