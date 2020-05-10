package typingsSlinky.parsimmon.mod

import typingsSlinky.parsimmon.parsimmonBooleans.`false`
import typingsSlinky.parsimmon.parsimmonNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureReply
  extends Reply[js.Any] {
  var expected: js.Array[String] = js.native
  var furthest: Double = js.native
  var index: `-1` = js.native
  var status: `false` = js.native
  var value: Null = js.native
}

object FailureReply {
  @scala.inline
  def apply(expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): FailureReply = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureReply]
  }
  @scala.inline
  implicit class FailureReplyOps[Self <: FailureReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFurthest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("furthest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

