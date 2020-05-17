package typingsSlinky.amqplib.anon

import typingsSlinky.amqplib.amqplibStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("!")
  var Exclamationmark: timestamp = js.native
  var value: Double = js.native
}

object _empty {
  @scala.inline
  def apply(Exclamationmark: timestamp, value: Double): _empty = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclamationmark(value: timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

