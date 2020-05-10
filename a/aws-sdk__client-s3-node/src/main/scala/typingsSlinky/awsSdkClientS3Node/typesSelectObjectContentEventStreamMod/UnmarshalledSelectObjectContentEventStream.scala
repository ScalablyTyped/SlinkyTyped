package typingsSlinky.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod

import typingsSlinky.awsSdkClientS3Node.typesContinuationEventMod.UnmarshalledContinuationEvent
import typingsSlinky.awsSdkClientS3Node.typesEndEventMod.UnmarshalledEndEvent
import typingsSlinky.awsSdkClientS3Node.typesProgressEventMod.UnmarshalledProgressEvent
import typingsSlinky.awsSdkClientS3Node.typesRecordsEventMod.UnmarshalledRecordsEvent
import typingsSlinky.awsSdkClientS3Node.typesStatsEventMod.UnmarshalledStatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSelectObjectContentEventStream extends SelectObjectContentEventStream {
  /**
    * <p>The Continuation Event.</p>
    */
  @JSName("Cont")
  var Cont_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledContinuationEvent] = js.native
  /**
    * <p>The End Event.</p>
    */
  @JSName("End")
  var End_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledEndEvent] = js.native
  /**
    * <p>The Progress Event.</p>
    */
  @JSName("Progress")
  var Progress_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledProgressEvent] = js.native
  /**
    * <p>The Records Event.</p>
    */
  @JSName("Records")
  var Records_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledRecordsEvent] = js.native
  /**
    * <p>The Stats Event.</p>
    */
  @JSName("Stats")
  var Stats_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledStatsEvent] = js.native
}

object UnmarshalledSelectObjectContentEventStream {
  @scala.inline
  def apply(): UnmarshalledSelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSelectObjectContentEventStream]
  }
  @scala.inline
  implicit class UnmarshalledSelectObjectContentEventStreamOps[Self <: UnmarshalledSelectObjectContentEventStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCont(value: UnmarshalledContinuationEvent): Self = {
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
    def withEnd(value: UnmarshalledEndEvent): Self = {
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
    def withProgress(value: UnmarshalledProgressEvent): Self = {
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
    def withRecords(value: UnmarshalledRecordsEvent): Self = {
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
    def withStats(value: UnmarshalledStatsEvent): Self = {
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

