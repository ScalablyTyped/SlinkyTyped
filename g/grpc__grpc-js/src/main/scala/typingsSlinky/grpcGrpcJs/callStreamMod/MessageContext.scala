package typingsSlinky.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageContext extends js.Object {
  var callback: js.UndefOr[WriteCallback] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
}

object MessageContext {
  @scala.inline
  def apply(
    callback: /* error */ js.UndefOr[js.Error | Null] => Unit = null,
    flags: js.UndefOr[Double] = js.undefined
  ): MessageContext = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContext]
  }
}

