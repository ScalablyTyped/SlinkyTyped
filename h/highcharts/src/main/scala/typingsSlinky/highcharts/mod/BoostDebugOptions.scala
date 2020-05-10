package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoostDebugOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Show the number of points
    * skipped through culling.
    *
    * When set to true, the number of points skipped in series processing is
    * outputted. Points are skipped if they are closer than 1 pixel from each
    * other.
    */
  var showSkipSummary: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the WebGL to SVG buffer
    * copy
    *
    * After rendering, the result is copied to an image which is injected into
    * the SVG.
    *
    * If this property is set to true, the time it takes for the buffer copy to
    * complete is outputted.
    */
  var timeBufferCopy: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the building of the k-d
    * tree.
    *
    * This outputs the time spent building the k-d tree used for markers etc.
    *
    * Note that the k-d tree is built async, and runs post-rendering.
    * Following, it does not affect the performance of the rendering itself.
    */
  var timeKDTree: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series rendering.
    *
    * This outputs the time spent on actual rendering in the console when set
    * to true.
    */
  var timeRendering: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the series processing.
    *
    * This outputs the time spent on transforming the series data to vertex
    * buffers when set to true.
    */
  var timeSeriesProcessing: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time the the WebGL setup.
    *
    * This outputs the time spent on setting up the WebGL context, creating
    * shaders, and textures.
    */
  var timeSetup: js.UndefOr[Boolean] = js.native
}

object BoostDebugOptions {
  @scala.inline
  def apply(): BoostDebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoostDebugOptions]
  }
  @scala.inline
  implicit class BoostDebugOptionsOps[Self <: BoostDebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowSkipSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSkipSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSkipSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeBufferCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBufferCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeBufferCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeBufferCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeKDTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeKDTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeKDTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeKDTree")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSeriesProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeriesProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeriesProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeriesProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSetup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSetup")(js.undefined)
        ret
    }
  }
  
}

