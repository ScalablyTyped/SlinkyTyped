package typingsSlinky.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var bgBlack: CodePair = js.native
  var bgBlackBright: CodePair = js.native
  var bgBlue: CodePair = js.native
  var bgBlueBright: CodePair = js.native
  var bgCyan: CodePair = js.native
  var bgCyanBright: CodePair = js.native
  var bgGreen: CodePair = js.native
  var bgGreenBright: CodePair = js.native
  var bgMagenta: CodePair = js.native
  var bgMagentaBright: CodePair = js.native
  var bgRed: CodePair = js.native
  var bgRedBright: CodePair = js.native
  var bgWhite: CodePair = js.native
  var bgWhiteBright: CodePair = js.native
  var bgYellow: CodePair = js.native
  var bgYellowBright: CodePair = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(
    bgBlack: CodePair,
    bgBlackBright: CodePair,
    bgBlue: CodePair,
    bgBlueBright: CodePair,
    bgCyan: CodePair,
    bgCyanBright: CodePair,
    bgGreen: CodePair,
    bgGreenBright: CodePair,
    bgMagenta: CodePair,
    bgMagentaBright: CodePair,
    bgRed: CodePair,
    bgRedBright: CodePair,
    bgWhite: CodePair,
    bgWhiteBright: CodePair,
    bgYellow: CodePair,
    bgYellowBright: CodePair
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgBlack(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlackBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlackBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlue(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlueBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgCyan(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgCyanBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgGreen(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgGreenBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgMagenta(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgMagentaBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgRed(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgRedBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRedBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgWhite(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgWhiteBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgYellow(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgYellowBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellowBright")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

