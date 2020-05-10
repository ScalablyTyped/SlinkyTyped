package typingsSlinky.ink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProps extends js.Object {
  val bgBlack: js.UndefOr[Boolean] = js.native
  val bgBlackBright: js.UndefOr[Boolean] = js.native
  val bgBlue: js.UndefOr[Boolean] = js.native
  val bgBlueBright: js.UndefOr[Boolean] = js.native
  val bgCyan: js.UndefOr[Boolean] = js.native
  val bgCyanBright: js.UndefOr[Boolean] = js.native
  val bgGreen: js.UndefOr[Boolean] = js.native
  val bgGreenBright: js.UndefOr[Boolean] = js.native
  val bgHex: js.UndefOr[String] = js.native
  val bgHsl: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val bgHsv: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val bgHwb: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val bgKeyword: js.UndefOr[String] = js.native
  val bgMagenta: js.UndefOr[Boolean] = js.native
  val bgMagentaBright: js.UndefOr[Boolean] = js.native
  val bgRed: js.UndefOr[Boolean] = js.native
  val bgRedBright: js.UndefOr[Boolean] = js.native
  val bgRgb: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val bgWhite: js.UndefOr[Boolean] = js.native
  val bgWhiteBright: js.UndefOr[Boolean] = js.native
  val bgYellow: js.UndefOr[Boolean] = js.native
  val bgYellowBright: js.UndefOr[Boolean] = js.native
  val black: js.UndefOr[Boolean] = js.native
  val blackBright: js.UndefOr[Boolean] = js.native
  val blue: js.UndefOr[Boolean] = js.native
  val blueBright: js.UndefOr[Boolean] = js.native
  val bold: js.UndefOr[Boolean] = js.native
  val cyan: js.UndefOr[Boolean] = js.native
  val cyanBright: js.UndefOr[Boolean] = js.native
  val dim: js.UndefOr[Boolean] = js.native
  val gray: js.UndefOr[Boolean] = js.native
  val green: js.UndefOr[Boolean] = js.native
  val greenBright: js.UndefOr[Boolean] = js.native
  val grey: js.UndefOr[Boolean] = js.native
  val hex: js.UndefOr[String] = js.native
  val hidden: js.UndefOr[Boolean] = js.native
  val hsl: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val hsv: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val hwb: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val inverse: js.UndefOr[Boolean] = js.native
  val italic: js.UndefOr[Boolean] = js.native
  val keyword: js.UndefOr[String] = js.native
  val magenta: js.UndefOr[Boolean] = js.native
  val magentaBright: js.UndefOr[Boolean] = js.native
  val red: js.UndefOr[Boolean] = js.native
  val redBright: js.UndefOr[Boolean] = js.native
  val reset: js.UndefOr[Boolean] = js.native
  val rgb: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  val strikethrough: js.UndefOr[Boolean] = js.native
  val underline: js.UndefOr[Boolean] = js.native
  val visible: js.UndefOr[Boolean] = js.native
  val white: js.UndefOr[Boolean] = js.native
  val whiteBright: js.UndefOr[Boolean] = js.native
  val yellow: js.UndefOr[Boolean] = js.native
  val yellowBright: js.UndefOr[Boolean] = js.native
}

object ColorProps {
  @scala.inline
  def apply(): ColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps]
  }
  @scala.inline
  implicit class ColorPropsOps[Self <: ColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgBlack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgBlack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlack")(js.undefined)
        ret
    }
    @scala.inline
    def withBgBlackBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlackBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgBlackBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlackBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgBlue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlue")(js.undefined)
        ret
    }
    @scala.inline
    def withBgBlueBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgBlueBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgBlueBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgCyan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgCyan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyan")(js.undefined)
        ret
    }
    @scala.inline
    def withBgCyanBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgCyanBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgCyanBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgGreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreen")(js.undefined)
        ret
    }
    @scala.inline
    def withBgGreenBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgGreenBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgGreenBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHex")(js.undefined)
        ret
    }
    @scala.inline
    def withBgHsl(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgHsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHsl")(js.undefined)
        ret
    }
    @scala.inline
    def withBgHsv(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgHsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHsv")(js.undefined)
        ret
    }
    @scala.inline
    def withBgHwb(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHwb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgHwb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgHwb")(js.undefined)
        ret
    }
    @scala.inline
    def withBgKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withBgMagenta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgMagenta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagenta")(js.undefined)
        ret
    }
    @scala.inline
    def withBgMagentaBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgMagentaBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgMagentaBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgRed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRed")(js.undefined)
        ret
    }
    @scala.inline
    def withBgRedBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRedBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgRedBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRedBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgRgb(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgRgb")(js.undefined)
        ret
    }
    @scala.inline
    def withBgWhite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhite")(js.undefined)
        ret
    }
    @scala.inline
    def withBgWhiteBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgWhiteBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgWhiteBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBgYellow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgYellow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellow")(js.undefined)
        ret
    }
    @scala.inline
    def withBgYellowBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellowBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgYellowBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgYellowBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBlack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBlue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueBright")(js.undefined)
        ret
    }
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withCyan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCyan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(js.undefined)
        ret
    }
    @scala.inline
    def withCyanBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyanBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCyanBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyanBright")(js.undefined)
        ret
    }
    @scala.inline
    def withDim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dim")(js.undefined)
        ret
    }
    @scala.inline
    def withGray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(js.undefined)
        ret
    }
    @scala.inline
    def withGreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(js.undefined)
        ret
    }
    @scala.inline
    def withGreenBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreenBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenBright")(js.undefined)
        ret
    }
    @scala.inline
    def withGrey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grey")(js.undefined)
        ret
    }
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHsl(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.undefined)
        ret
    }
    @scala.inline
    def withHsv(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsv")(js.undefined)
        ret
    }
    @scala.inline
    def withHwb(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHwb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hwb")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withMagenta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagenta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magenta")(js.undefined)
        ret
    }
    @scala.inline
    def withMagentaBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMagentaBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magentaBright")(js.undefined)
        ret
    }
    @scala.inline
    def withRed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(js.undefined)
        ret
    }
    @scala.inline
    def withRedBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redBright")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withRgb(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.undefined)
        ret
    }
    @scala.inline
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWhite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("white")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteBright")(js.undefined)
        ret
    }
    @scala.inline
    def withYellow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(js.undefined)
        ret
    }
    @scala.inline
    def withYellowBright(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowBright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYellowBright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowBright")(js.undefined)
        ret
    }
  }
  
}

