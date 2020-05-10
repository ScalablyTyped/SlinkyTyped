package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueInfo extends js.Object {
  /**
    * The ID of the ongoing ingestion. The queued ingestion is waiting for the ongoing ingestion to complete.
    */
  var QueuedIngestion: java.lang.String = js.native
  /**
    * The ID of the queued ingestion.
    */
  var WaitingOnIngestion: java.lang.String = js.native
}

object QueueInfo {
  @scala.inline
  def apply(QueuedIngestion: java.lang.String, WaitingOnIngestion: java.lang.String): QueueInfo = {
    val __obj = js.Dynamic.literal(QueuedIngestion = QueuedIngestion.asInstanceOf[js.Any], WaitingOnIngestion = WaitingOnIngestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInfo]
  }
  @scala.inline
  implicit class QueueInfoOps[Self <: QueueInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueuedIngestion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueuedIngestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitingOnIngestion(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WaitingOnIngestion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

