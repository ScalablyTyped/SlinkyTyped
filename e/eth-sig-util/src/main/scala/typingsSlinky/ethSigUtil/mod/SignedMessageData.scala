package typingsSlinky.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedMessageData[T] extends MessageData[T] {
  var sig: String = js.native
}

object SignedMessageData {
  @scala.inline
  def apply[T](data: T, sig: String): SignedMessageData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessageData[T]]
  }
  @scala.inline
  implicit class SignedMessageDataOps[Self[t] <: SignedMessageData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSig(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

