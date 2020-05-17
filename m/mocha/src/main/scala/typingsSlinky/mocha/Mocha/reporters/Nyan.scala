package typingsSlinky.mocha.Mocha.reporters

import typingsSlinky.mocha.Mocha.Runner
import typingsSlinky.mocha.Mocha.Stats
import typingsSlinky.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `NyanCat` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
  */
@js.native
trait Nyan extends Base {
  var appendRainbow: js.Any = js.native
  var colorIndex: js.Any = js.native
  var cursorDown: js.Any = js.native
  var cursorUp: js.Any = js.native
  var draw: js.Any = js.native
  var drawNyanCat: js.Any = js.native
  var drawRainbow: js.Any = js.native
  var drawScoreboard: js.Any = js.native
  var face: js.Any = js.native
  var generateColors: js.Any = js.native
  var numberOfLines: js.Any = js.native
  var rainbowColors: js.Any = js.native
  var rainbowify: js.Any = js.native
  var scoreboardWidth: js.Any = js.native
  var tick: js.Any = js.native
  var trajectories: js.Any = js.native
  var trajectoryWidthMax: js.Any = js.native
}

object Nyan {
  @scala.inline
  def apply(
    appendRainbow: js.Any,
    colorIndex: js.Any,
    cursorDown: js.Any,
    cursorUp: js.Any,
    draw: js.Any,
    drawNyanCat: js.Any,
    drawRainbow: js.Any,
    drawScoreboard: js.Any,
    epilogue: () => Unit,
    face: js.Any,
    failures: js.Array[Test],
    generateColors: js.Any,
    numberOfLines: js.Any,
    rainbowColors: js.Any,
    rainbowify: js.Any,
    runner: Runner,
    scoreboardWidth: js.Any,
    stats: Stats,
    tick: js.Any,
    trajectories: js.Any,
    trajectoryWidthMax: js.Any
  ): Nyan = {
    val __obj = js.Dynamic.literal(appendRainbow = appendRainbow.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], cursorDown = cursorDown.asInstanceOf[js.Any], cursorUp = cursorUp.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], drawNyanCat = drawNyanCat.asInstanceOf[js.Any], drawRainbow = drawRainbow.asInstanceOf[js.Any], drawScoreboard = drawScoreboard.asInstanceOf[js.Any], epilogue = js.Any.fromFunction0(epilogue), face = face.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], generateColors = generateColors.asInstanceOf[js.Any], numberOfLines = numberOfLines.asInstanceOf[js.Any], rainbowColors = rainbowColors.asInstanceOf[js.Any], rainbowify = rainbowify.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], scoreboardWidth = scoreboardWidth.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], trajectories = trajectories.asInstanceOf[js.Any], trajectoryWidthMax = trajectoryWidthMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nyan]
  }
  @scala.inline
  implicit class NyanOps[Self <: Nyan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendRainbow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendRainbow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursorUp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraw(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawNyanCat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawNyanCat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawRainbow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawRainbow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawScoreboard(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawScoreboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfLines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRainbowColors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rainbowColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRainbowify(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rainbowify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScoreboardWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scoreboardWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrajectories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trajectories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrajectoryWidthMax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trajectoryWidthMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

