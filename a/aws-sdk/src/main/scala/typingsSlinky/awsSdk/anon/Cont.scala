package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.s3Mod.ContinuationEvent
import typingsSlinky.awsSdk.s3Mod.EndEvent
import typingsSlinky.awsSdk.s3Mod.ProgressEvent
import typingsSlinky.awsSdk.s3Mod.RecordsEvent
import typingsSlinky.awsSdk.s3Mod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cont extends js.Object {
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  var End: js.UndefOr[EndEvent] = js.native
  var Progress: js.UndefOr[ProgressEvent] = js.native
  var Records: js.UndefOr[RecordsEvent] = js.native
  var Stats: js.UndefOr[StatsEvent] = js.native
}

object Cont {
  @scala.inline
  def apply(): Cont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cont]
  }
  @scala.inline
  implicit class ContOps[Self <: Cont] (val x: Self) extends AnyVal {
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

