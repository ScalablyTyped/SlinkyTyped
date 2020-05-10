package typingsSlinky.cliProgress.mod

import typingsSlinky.cliProgress.cliProgressStrings.center
import typingsSlinky.cliProgress.cliProgressStrings.left
import typingsSlinky.cliProgress.cliProgressStrings.right
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**  position of the progress bar - 'left' (default), 'right' or 'center  */
  var align: js.UndefOr[left | right | center] = js.native
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteChar: js.UndefOr[String] = js.native
  /** character to use as "complete" indicator in the bar (default: "=") */
  var barCompleteString: js.UndefOr[String] = js.native
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteChar: js.UndefOr[String] = js.native
  /** character to use as "incomplete" indicator in the bar (default: "-") */
  var barIncompleteString: js.UndefOr[String] = js.native
  /** the length of the progress bar in chars (default: 40) */
  var barsize: js.UndefOr[Double] = js.native
  /** clear the progress bar on complete / stop() call (default: false) */
  var clearOnComplete: js.UndefOr[Boolean] = js.native
  /** display progress bars with 'total' of zero(0) as empty, not full (default: false) */
  var emptyOnZero: js.UndefOr[Boolean] = js.native
  /** number of updates with which to calculate the eta; higher numbers give a more stable eta (default: 10) */
  var etaBuffer: js.UndefOr[Double] = js.native
  /** trigger redraw on every frame even if progress remains the same; can be useful if progress bar gets overwritten by other concurrent writes to the terminal (default: false) */
  var forceRedraw: js.UndefOr[Boolean] = js.native
  /**
    * progress bar output format.
    * The progressbar can be customized by using the following build-in placeholders. They can be combined in any order.
    *   {bar} - the progress bar, customizable by the options barsize, barCompleteString and barIncompleteString
    *   {percentage} - the current progress in percent (0-100)
    *   {total} - the end value
    *   {value} - the current value set by last update() call
    *   {eta} - expected time of accomplishment in seconds
    *   {duration} - elapsed time in seconds
    *   {eta_formatted} - expected time of accomplishment formatted into appropriate units
    *   {duration_formatted} - elapsed time formatted into appropriate units
    *
    * Example:
    *      progress [{bar}] {percentage}% | ETA: {eta}s | {value}/{total}
    *    is rendered as
    *      progress [========================================] 100% | ETA: 0s | 200/200
    */
  var format: js.UndefOr[String] = js.native
  /** the maximum update rate (default: 10) */
  var fps: js.UndefOr[Double] = js.native
  /**
    * hide the cursor during progress operation; restored on complete (default: false)
    * - pass `null` to keep terminal settings
    */
  var hideCursor: js.UndefOr[Boolean | Null] = js.native
  /** disable line wrapping (default: false) - pass null to keep terminal settings; pass true to trim the output to terminal width */
  var linewrap: js.UndefOr[Boolean | Null] = js.native
  /** enable scheduled output to notty streams - e.g. redirect to files (default: false) */
  var noTTYOutput: js.UndefOr[Boolean] = js.native
  /** set the output schedule/interval for notty output in ms (default: 2000ms) */
  var notTTYSchedule: js.UndefOr[Double] = js.native
  /**  automatically call stop() when the value reaches the total (default: false) */
  var stopOnComplete: js.UndefOr[Boolean] = js.native
  /** output stream to use (default: process.stderr) */
  var stream: js.UndefOr[WritableStream] = js.native
  /** trigger redraw during update() in case threshold time x2 is exceeded (default: true) - limited to single bar usage */
  var synchronousUpdate: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | right | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBarCompleteChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCompleteChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarCompleteChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCompleteChar")(js.undefined)
        ret
    }
    @scala.inline
    def withBarCompleteString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCompleteString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarCompleteString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barCompleteString")(js.undefined)
        ret
    }
    @scala.inline
    def withBarIncompleteChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIncompleteChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarIncompleteChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIncompleteChar")(js.undefined)
        ret
    }
    @scala.inline
    def withBarIncompleteString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIncompleteString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarIncompleteString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barIncompleteString")(js.undefined)
        ret
    }
    @scala.inline
    def withBarsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barsize")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyOnZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyOnZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyOnZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyOnZero")(js.undefined)
        ret
    }
    @scala.inline
    def withEtaBuffer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etaBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtaBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etaBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withForceRedraw(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRedraw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceRedraw")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fps")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCursorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(null)
        ret
    }
    @scala.inline
    def withLinewrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinewrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewrap")(js.undefined)
        ret
    }
    @scala.inline
    def withLinewrapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linewrap")(null)
        ret
    }
    @scala.inline
    def withNoTTYOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTTYOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTTYOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTTYOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withNotTTYSchedule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notTTYSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotTTYSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notTTYSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronousUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronousUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronousUpdate")(js.undefined)
        ret
    }
  }
  
}

