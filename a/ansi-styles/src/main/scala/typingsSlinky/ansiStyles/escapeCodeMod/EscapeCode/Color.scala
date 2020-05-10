package typingsSlinky.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var black: CodePair = js.native
  var blue: CodePair = js.native
  var blueBright: CodePair = js.native
  var cyan: CodePair = js.native
  var cyanBright: CodePair = js.native
  /**
    * bright black
    */
  var gray: CodePair = js.native
  var green: CodePair = js.native
  var greenBright: CodePair = js.native
  var grey: CodePair = js.native
  var magenta: CodePair = js.native
  var magentaBright: CodePair = js.native
  var red: CodePair = js.native
  var redBright: CodePair = js.native
  var white: CodePair = js.native
  var whiteBright: CodePair = js.native
  var yellow: CodePair = js.native
  var yellowBright: CodePair = js.native
}

object Color {
  @scala.inline
  def apply(
    black: CodePair,
    blue: CodePair,
    blueBright: CodePair,
    cyan: CodePair,
    cyanBright: CodePair,
    gray: CodePair,
    green: CodePair,
    greenBright: CodePair,
    grey: CodePair,
    magenta: CodePair,
    magentaBright: CodePair,
    red: CodePair,
    redBright: CodePair,
    white: CodePair,
    whiteBright: CodePair,
    yellow: CodePair,
    yellowBright: CodePair
  ): Color = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlack(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyanBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGray(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreenBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagenta(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagentaBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhite(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellow(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowBright(value: CodePair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowBright")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

