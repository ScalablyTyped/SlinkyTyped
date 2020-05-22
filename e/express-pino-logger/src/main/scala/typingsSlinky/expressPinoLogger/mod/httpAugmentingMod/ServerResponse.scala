package typingsSlinky.expressPinoLogger.mod.httpAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResponse extends js.Object {
  var err: js.UndefOr[js.Error] = js.undefined
}

object ServerResponse {
  @scala.inline
  def apply(err: js.Error = null): ServerResponse = {
    val __obj = js.Dynamic.literal()
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponse]
  }
}

