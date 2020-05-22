package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.NormalSuccessResponse
import typingsSlinky.aliOss.mod.StyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRes extends js.Object {
  var data: StyleData
  var res: NormalSuccessResponse
}

object DataRes {
  @scala.inline
  def apply(data: StyleData, res: NormalSuccessResponse): DataRes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRes]
  }
}

