package typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod

import typingsSlinky.awsSdkClientS3Node.typesContinuationEventMod.ContinuationEvent
import typingsSlinky.awsSdkClientS3Node.typesEndEventMod.EndEvent
import typingsSlinky.awsSdkClientS3Node.typesProgressEventMod.ProgressEvent
import typingsSlinky.awsSdkClientS3Node.typesRecordsEventMod.RecordsEvent
import typingsSlinky.awsSdkClientS3Node.typesStatsEventMod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectObjectContentEventStream extends js.Object {
  /**
    * <p>The Continuation Event.</p>
    */
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  /**
    * <p>The End Event.</p>
    */
  var End: js.UndefOr[EndEvent] = js.native
  /**
    * <p>The Progress Event.</p>
    */
  var Progress: js.UndefOr[ProgressEvent] = js.native
  /**
    * <p>The Records Event.</p>
    */
  var Records: js.UndefOr[RecordsEvent] = js.native
  /**
    * <p>The Stats Event.</p>
    */
  var Stats: js.UndefOr[StatsEvent] = js.native
}

object SelectObjectContentEventStream {
  @scala.inline
  def apply(): SelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentEventStream]
  }
  @scala.inline
  implicit class SelectObjectContentEventStreamOps[Self <: SelectObjectContentEventStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCont(value: ContinuationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cont")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: EndEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: ProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progress")(js.undefined)
        ret
    }
    @scala.inline
    def withRecords(value: RecordsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: StatsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stats")(js.undefined)
        ret
    }
  }
  
}

