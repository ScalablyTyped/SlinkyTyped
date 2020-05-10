package typingsSlinky.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueUrlResult extends js.Object {
  /**
    * The URL of the queue.
    */
  var QueueUrl: js.UndefOr[String] = js.native
}

object GetQueueUrlResult {
  @scala.inline
  def apply(): GetQueueUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueueUrlResult]
  }
  @scala.inline
  implicit class GetQueueUrlResultOps[Self <: GetQueueUrlResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueueUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueUrl")(js.undefined)
        ret
    }
  }
  
}

