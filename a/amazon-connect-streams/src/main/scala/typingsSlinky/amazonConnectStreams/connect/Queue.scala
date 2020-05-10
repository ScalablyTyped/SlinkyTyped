package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var name: String = js.native
  /**
    * The queueARN of the queue.
    */
  var queueARN: String = js.native
}

object Queue {
  @scala.inline
  def apply(name: String, queueARN: String): Queue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queueARN = queueARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueueARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

