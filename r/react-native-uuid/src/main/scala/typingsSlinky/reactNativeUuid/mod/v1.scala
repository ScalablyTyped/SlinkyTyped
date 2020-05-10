package typingsSlinky.reactNativeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v1 extends js.Object {
  var clockseq: Double = js.native
  var msecs: Double | js.Date = js.native
  var node: js.Array[Double] = js.native
  var nsecs: Double = js.native
}

object v1 {
  @scala.inline
  def apply(clockseq: Double, msecs: Double | js.Date, node: js.Array[Double], nsecs: Double): v1 = {
    val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[v1]
  }
  @scala.inline
  implicit class v1Ops[Self <: v1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockseq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockseq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsecsDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsecs(value: Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNsecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsecs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

