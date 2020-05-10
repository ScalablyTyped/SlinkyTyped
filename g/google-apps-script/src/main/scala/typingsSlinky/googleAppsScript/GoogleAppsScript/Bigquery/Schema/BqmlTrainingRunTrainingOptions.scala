package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BqmlTrainingRunTrainingOptions extends js.Object {
  var earlyStop: js.UndefOr[Boolean] = js.native
  var l1Reg: js.UndefOr[Double] = js.native
  var l2Reg: js.UndefOr[Double] = js.native
  var learnRate: js.UndefOr[Double] = js.native
  var learnRateStrategy: js.UndefOr[String] = js.native
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.native
  var maxIteration: js.UndefOr[String] = js.native
  var minRelProgress: js.UndefOr[Double] = js.native
  var warmStart: js.UndefOr[Boolean] = js.native
}

object BqmlTrainingRunTrainingOptions {
  @scala.inline
  def apply(): BqmlTrainingRunTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
  }
  @scala.inline
  implicit class BqmlTrainingRunTrainingOptionsOps[Self <: BqmlTrainingRunTrainingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarlyStop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyStop")(js.undefined)
        ret
    }
    @scala.inline
    def withL1Reg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1Reg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL1Reg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1Reg")(js.undefined)
        ret
    }
    @scala.inline
    def withL2Reg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2Reg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL2Reg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2Reg")(js.undefined)
        ret
    }
    @scala.inline
    def withLearnRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLearnRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRate")(js.undefined)
        ret
    }
    @scala.inline
    def withLearnRateStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLearnRateStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("learnRateStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSearchInitLearnRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSearchInitLearnRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSearchInitLearnRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSearchInitLearnRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIteration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRelProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRelProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRelProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRelProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withWarmStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarmStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warmStart")(js.undefined)
        ret
    }
  }
  
}

