package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GapDegree extends js.Object {
  var gapDegree: js.UndefOr[scala.Nothing] = js.native
  var percent: Double = js.native
  var showInfo: Boolean = js.native
  var size: String = js.native
  var strokeLinecap: String = js.native
  var trailColor: Null = js.native
  var `type`: String = js.native
}

object GapDegree {
  @scala.inline
  def apply(
    percent: Double,
    showInfo: Boolean,
    size: String,
    strokeLinecap: String,
    trailColor: Null,
    `type`: String
  ): GapDegree = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapDegree]
  }
  @scala.inline
  implicit class GapDegreeOps[Self <: GapDegree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeLinecap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeLinecap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailColor(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

