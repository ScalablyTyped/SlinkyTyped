package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Error | Null] = js.undefined
  var info: ComponentStack
}

object Error {
  @scala.inline
  def apply(info: ComponentStack, error: js.UndefOr[Null | js.Error] = js.undefined): Error = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

