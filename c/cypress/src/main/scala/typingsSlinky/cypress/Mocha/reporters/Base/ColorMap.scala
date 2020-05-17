package typingsSlinky.cypress.Mocha.reporters.Base

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default color map
  *
  * @see https://mochajs.org/api/module-base#.colors
  */
@js.native
trait ColorMap extends /* key */ StringDictionary[Double] {
  var `bright fail`: Double = js.native
  var `bright pass`: Double = js.native
  var `bright yellow`: Double = js.native
  var checkmark: Double = js.native
  var `diff added`: Double = js.native
  var `diff gutter`: Double = js.native
  var `diff removed`: Double = js.native
  var `error message`: Double = js.native
  var `error stack`: Double = js.native
  var `error title`: Double = js.native
  var fail: Double = js.native
  var fast: Double = js.native
  var green: Double = js.native
  var light: Double = js.native
  var medium: Double = js.native
  // added by Base
  var pass: Double = js.native
  var pending: Double = js.native
  // added by Landing
  var plane: Double = js.native
  var `plane crash`: Double = js.native
  // added by Progress
  var progress: Double = js.native
  var runway: Double = js.native
  var slow: Double = js.native
  var suite: Double = js.native
}

object ColorMap {
  @scala.inline
  def apply(
    `bright fail`: Double,
    `bright pass`: Double,
    `bright yellow`: Double,
    checkmark: Double,
    `diff added`: Double,
    `diff gutter`: Double,
    `diff removed`: Double,
    `error message`: Double,
    `error stack`: Double,
    `error title`: Double,
    fail: Double,
    fast: Double,
    green: Double,
    light: Double,
    medium: Double,
    pass: Double,
    pending: Double,
    plane: Double,
    `plane crash`: Double,
    progress: Double,
    runway: Double,
    slow: Double,
    suite: Double
  ): ColorMap = {
    val __obj = js.Dynamic.literal(checkmark = checkmark.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], runway = runway.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("bright fail")((`bright fail`).asInstanceOf[js.Any])
    __obj.updateDynamic("bright pass")((`bright pass`).asInstanceOf[js.Any])
    __obj.updateDynamic("bright yellow")((`bright yellow`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff added")((`diff added`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff gutter")((`diff gutter`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff removed")((`diff removed`).asInstanceOf[js.Any])
    __obj.updateDynamic("error message")((`error message`).asInstanceOf[js.Any])
    __obj.updateDynamic("error stack")((`error stack`).asInstanceOf[js.Any])
    __obj.updateDynamic("error title")((`error title`).asInstanceOf[js.Any])
    __obj.updateDynamic("plane crash")((`plane crash`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMap]
  }
  @scala.inline
  implicit class ColorMapOps[Self <: ColorMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBright fail`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bright fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBright pass`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bright pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBright yellow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bright yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckmark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDiff added`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDiff gutter`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDiff removed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withError message`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withError stack`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withError title`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedium(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlane(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPlane crash`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane crash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunway(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suite")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

