package typingsSlinky.childProcessPromise.mod

import typingsSlinky.childProcessPromise.childProcessPromiseStrings.stderr
import typingsSlinky.childProcessPromise.childProcessPromiseStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Pass an additional capture option to buffer the result of stdout and/or stderr
    * Default: []
    */
  var capture: js.UndefOr[
    (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])
  ] = js.native
  /**
    * Array of the numbers that should be interpreted as successful execution codes
    * Default: [0]
    */
  var successfulExitCodes: js.UndefOr[js.Array[Double]] = js.native
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
    def withCapture(value: (js.Array[stdout | stderr | js.Any]) | (js.Tuple2[stdout | stderr, stderr | stdout])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessfulExitCodes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulExitCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessfulExitCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulExitCodes")(js.undefined)
        ret
    }
  }
  
}

