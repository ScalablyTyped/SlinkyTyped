package typingsSlinky.expressBoom.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoomError[Data] extends js.Object {
  var data: Data = js.native
  var isBoom: Boolean = js.native
  var isServer: Boolean = js.native
  var message: String = js.native
  var output: Output = js.native
  def reformat(): Unit = js.native
}

object BoomError {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    output: Output,
    reformat: () => Unit
  ): BoomError[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reformat = js.Any.fromFunction0(reformat))
    __obj.asInstanceOf[BoomError[Data]]
  }
  @scala.inline
  implicit class BoomErrorOps[Self[data] <: BoomError[data], Data] (val x: Self[Data]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Data] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Data]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Data] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Data] with Other]
    @scala.inline
    def withData(value: Data): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBoom(value: Boolean): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsServer(value: Boolean): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: Output): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReformat(value: () => Unit): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reformat")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

