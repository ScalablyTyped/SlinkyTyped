package typingsSlinky.ansiColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesType[T] extends js.Object {
  // background colors
  var bgBlack: T = js.native
  // bright background colors
  var bgBlackBright: T = js.native
  var bgBlue: T = js.native
  var bgBlueBright: T = js.native
  var bgCyan: T = js.native
  var bgCyanBright: T = js.native
  var bgGreen: T = js.native
  var bgGreenBright: T = js.native
  var bgMagenta: T = js.native
  var bgMagentaBright: T = js.native
  var bgRed: T = js.native
  var bgRedBright: T = js.native
  var bgWhite: T = js.native
  var bgWhiteBright: T = js.native
  var bgYellow: T = js.native
  var bgYellowBright: T = js.native
  // colors
  var black: T = js.native
  // bright colors
  var blackBright: T = js.native
  var blue: T = js.native
  var blueBright: T = js.native
  var bold: T = js.native
  var cyan: T = js.native
  var cyanBright: T = js.native
  var dim: T = js.native
  var gray: T = js.native
  var green: T = js.native
  var greenBright: T = js.native
  var grey: T = js.native
  var hidden: T = js.native
  var inverse: T = js.native
  var italic: T = js.native
  var magenta: T = js.native
  var magentaBright: T = js.native
  var red: T = js.native
  var redBright: T = js.native
  // modifiers
  var reset: T = js.native
  var strikethrough: T = js.native
  var underline: T = js.native
  var white: T = js.native
  var whiteBright: T = js.native
  var yellow: T = js.native
  var yellowBright: T = js.native
}

object StylesType {
  @scala.inline
  def apply[T](
    bgBlack: T,
    bgBlackBright: T,
    bgBlue: T,
    bgBlueBright: T,
    bgCyan: T,
    bgCyanBright: T,
    bgGreen: T,
    bgGreenBright: T,
    bgMagenta: T,
    bgMagentaBright: T,
    bgRed: T,
    bgRedBright: T,
    bgWhite: T,
    bgWhiteBright: T,
    bgYellow: T,
    bgYellowBright: T,
    black: T,
    blackBright: T,
    blue: T,
    blueBright: T,
    bold: T,
    cyan: T,
    cyanBright: T,
    dim: T,
    gray: T,
    green: T,
    greenBright: T,
    grey: T,
    hidden: T,
    inverse: T,
    italic: T,
    magenta: T,
    magentaBright: T,
    red: T,
    redBright: T,
    reset: T,
    strikethrough: T,
    underline: T,
    white: T,
    whiteBright: T,
    yellow: T,
    yellowBright: T
  ): StylesType[T] = {
    val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blackBright = blackBright.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesType[T]]
  }
  @scala.inline
  implicit class StylesTypeOps[Self[t] <: StylesType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBgBlack(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlackBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlackBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgBlueBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgCyan(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgCyanBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgGreen(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgGreenBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgMagenta(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgMagentaBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgRed(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgRedBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRedBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgWhite(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgWhiteBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgYellow(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgYellowBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellowBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlack(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyanBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDim(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGray(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreenBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrey(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItalic(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagenta(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagentaBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikethrough(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhite(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellow(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowBright(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowBright")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

