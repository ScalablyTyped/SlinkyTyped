package typingsSlinky.rcMentions.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureConfig extends js.Object {
  var measureLocation: Double = js.native
  var prefix: String = js.native
  var selectionStart: Double = js.native
  var split: String = js.native
  var targetText: String = js.native
}

object MeasureConfig {
  @scala.inline
  def apply(measureLocation: Double, prefix: String, selectionStart: Double, split: String, targetText: String): MeasureConfig = {
    val __obj = js.Dynamic.literal(measureLocation = measureLocation.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], targetText = targetText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureConfig]
  }
  @scala.inline
  implicit class MeasureConfigOps[Self <: MeasureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeasureLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

