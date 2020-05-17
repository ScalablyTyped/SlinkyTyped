package typingsSlinky.googleVisualization.google.visualization

import typingsSlinky.googleVisualization.anon.BarLabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineOptions extends js.Object {
  var avoidOverlappingGridLines: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String | ChartStrokeFill] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var enableInteractivity: js.UndefOr[Boolean] = js.native
  var forceIFrame: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var timeline: js.UndefOr[BarLabelStyle] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TimelineOptions {
  @scala.inline
  def apply(): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineOptions]
  }
  @scala.inline
  implicit class TimelineOptionsOps[Self <: TimelineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidOverlappingGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlappingGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidOverlappingGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverlappingGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | ChartStrokeFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableInteractivity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInteractivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableInteractivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableInteractivity")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeline(value: BarLabelStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

