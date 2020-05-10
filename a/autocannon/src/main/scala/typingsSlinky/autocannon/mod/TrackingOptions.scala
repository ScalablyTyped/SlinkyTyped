package typingsSlinky.autocannon.mod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  /**
    * The stream to output to.
    * @default process.stderr
    */
  var outputStream: js.UndefOr[WritableStream] = js.native
  /**
    * A `String` defining the format of the progress display output. Must be valid input for the [progress bar module](https://www.npmjs.com/package/progress).
    * @default 'running [:bar] :percent'
    */
  var progressBarString: js.UndefOr[String] = js.native
  /**
    * A truthy value to enable the rendering of the advanced latency table.
    * @default false
    */
  var renderLatencyTable: js.UndefOr[Boolean] = js.native
  /**
    * A truthy value to enable the rendering of the progress bar.
    * @default true
    */
  var renderProgressBar: js.UndefOr[Boolean] = js.native
  /**
    * A truthy value to enable the rendering of the results table.
    * @default true
    */
  var renderResultsTable: js.UndefOr[Boolean] = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputStream")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBarString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBarString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBarString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBarString")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLatencyTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLatencyTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderLatencyTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLatencyTable")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderProgressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProgressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderProgressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderResultsTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderResultsTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderResultsTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderResultsTable")(js.undefined)
        ret
    }
  }
  
}

