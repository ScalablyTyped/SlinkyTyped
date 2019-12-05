package typingsSlinky.ink.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.ink.inkMod.ColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Color
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("ink", "Color")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: hidden */
  def apply(
    bgBlack: js.UndefOr[Boolean] = js.undefined,
    bgBlackBright: js.UndefOr[Boolean] = js.undefined,
    bgBlue: js.UndefOr[Boolean] = js.undefined,
    bgBlueBright: js.UndefOr[Boolean] = js.undefined,
    bgCyan: js.UndefOr[Boolean] = js.undefined,
    bgCyanBright: js.UndefOr[Boolean] = js.undefined,
    bgGreen: js.UndefOr[Boolean] = js.undefined,
    bgGreenBright: js.UndefOr[Boolean] = js.undefined,
    bgHex: String = null,
    bgHsl: js.Tuple3[Double, Double, Double] = null,
    bgHsv: js.Tuple3[Double, Double, Double] = null,
    bgHwb: js.Tuple3[Double, Double, Double] = null,
    bgKeyword: String = null,
    bgMagenta: js.UndefOr[Boolean] = js.undefined,
    bgMagentaBright: js.UndefOr[Boolean] = js.undefined,
    bgRed: js.UndefOr[Boolean] = js.undefined,
    bgRedBright: js.UndefOr[Boolean] = js.undefined,
    bgRgb: js.Tuple3[Double, Double, Double] = null,
    bgWhite: js.UndefOr[Boolean] = js.undefined,
    bgWhiteBright: js.UndefOr[Boolean] = js.undefined,
    bgYellow: js.UndefOr[Boolean] = js.undefined,
    bgYellowBright: js.UndefOr[Boolean] = js.undefined,
    black: js.UndefOr[Boolean] = js.undefined,
    blackBright: js.UndefOr[Boolean] = js.undefined,
    blue: js.UndefOr[Boolean] = js.undefined,
    blueBright: js.UndefOr[Boolean] = js.undefined,
    bold: js.UndefOr[Boolean] = js.undefined,
    cyan: js.UndefOr[Boolean] = js.undefined,
    cyanBright: js.UndefOr[Boolean] = js.undefined,
    dim: js.UndefOr[Boolean] = js.undefined,
    gray: js.UndefOr[Boolean] = js.undefined,
    green: js.UndefOr[Boolean] = js.undefined,
    greenBright: js.UndefOr[Boolean] = js.undefined,
    grey: js.UndefOr[Boolean] = js.undefined,
    hex: String = null,
    hsl: js.Tuple3[Double, Double, Double] = null,
    hsv: js.Tuple3[Double, Double, Double] = null,
    hwb: js.Tuple3[Double, Double, Double] = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    keyword: String = null,
    magenta: js.UndefOr[Boolean] = js.undefined,
    magentaBright: js.UndefOr[Boolean] = js.undefined,
    red: js.UndefOr[Boolean] = js.undefined,
    redBright: js.UndefOr[Boolean] = js.undefined,
    reset: js.UndefOr[Boolean] = js.undefined,
    rgb: js.Tuple3[Double, Double, Double] = null,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    white: js.UndefOr[Boolean] = js.undefined,
    whiteBright: js.UndefOr[Boolean] = js.undefined,
    yellow: js.UndefOr[Boolean] = js.undefined,
    yellowBright: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bgBlack)) __obj.updateDynamic("bgBlack")(bgBlack.asInstanceOf[js.Any])
    if (!js.isUndefined(bgBlackBright)) __obj.updateDynamic("bgBlackBright")(bgBlackBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bgBlue)) __obj.updateDynamic("bgBlue")(bgBlue.asInstanceOf[js.Any])
    if (!js.isUndefined(bgBlueBright)) __obj.updateDynamic("bgBlueBright")(bgBlueBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bgCyan)) __obj.updateDynamic("bgCyan")(bgCyan.asInstanceOf[js.Any])
    if (!js.isUndefined(bgCyanBright)) __obj.updateDynamic("bgCyanBright")(bgCyanBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bgGreen)) __obj.updateDynamic("bgGreen")(bgGreen.asInstanceOf[js.Any])
    if (!js.isUndefined(bgGreenBright)) __obj.updateDynamic("bgGreenBright")(bgGreenBright.asInstanceOf[js.Any])
    if (bgHex != null) __obj.updateDynamic("bgHex")(bgHex.asInstanceOf[js.Any])
    if (bgHsl != null) __obj.updateDynamic("bgHsl")(bgHsl.asInstanceOf[js.Any])
    if (bgHsv != null) __obj.updateDynamic("bgHsv")(bgHsv.asInstanceOf[js.Any])
    if (bgHwb != null) __obj.updateDynamic("bgHwb")(bgHwb.asInstanceOf[js.Any])
    if (bgKeyword != null) __obj.updateDynamic("bgKeyword")(bgKeyword.asInstanceOf[js.Any])
    if (!js.isUndefined(bgMagenta)) __obj.updateDynamic("bgMagenta")(bgMagenta.asInstanceOf[js.Any])
    if (!js.isUndefined(bgMagentaBright)) __obj.updateDynamic("bgMagentaBright")(bgMagentaBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bgRed)) __obj.updateDynamic("bgRed")(bgRed.asInstanceOf[js.Any])
    if (!js.isUndefined(bgRedBright)) __obj.updateDynamic("bgRedBright")(bgRedBright.asInstanceOf[js.Any])
    if (bgRgb != null) __obj.updateDynamic("bgRgb")(bgRgb.asInstanceOf[js.Any])
    if (!js.isUndefined(bgWhite)) __obj.updateDynamic("bgWhite")(bgWhite.asInstanceOf[js.Any])
    if (!js.isUndefined(bgWhiteBright)) __obj.updateDynamic("bgWhiteBright")(bgWhiteBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bgYellow)) __obj.updateDynamic("bgYellow")(bgYellow.asInstanceOf[js.Any])
    if (!js.isUndefined(bgYellowBright)) __obj.updateDynamic("bgYellowBright")(bgYellowBright.asInstanceOf[js.Any])
    if (!js.isUndefined(black)) __obj.updateDynamic("black")(black.asInstanceOf[js.Any])
    if (!js.isUndefined(blackBright)) __obj.updateDynamic("blackBright")(blackBright.asInstanceOf[js.Any])
    if (!js.isUndefined(blue)) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (!js.isUndefined(blueBright)) __obj.updateDynamic("blueBright")(blueBright.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(cyan)) __obj.updateDynamic("cyan")(cyan.asInstanceOf[js.Any])
    if (!js.isUndefined(cyanBright)) __obj.updateDynamic("cyanBright")(cyanBright.asInstanceOf[js.Any])
    if (!js.isUndefined(dim)) __obj.updateDynamic("dim")(dim.asInstanceOf[js.Any])
    if (!js.isUndefined(gray)) __obj.updateDynamic("gray")(gray.asInstanceOf[js.Any])
    if (!js.isUndefined(green)) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (!js.isUndefined(greenBright)) __obj.updateDynamic("greenBright")(greenBright.asInstanceOf[js.Any])
    if (!js.isUndefined(grey)) __obj.updateDynamic("grey")(grey.asInstanceOf[js.Any])
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (hsl != null) __obj.updateDynamic("hsl")(hsl.asInstanceOf[js.Any])
    if (hsv != null) __obj.updateDynamic("hsv")(hsv.asInstanceOf[js.Any])
    if (hwb != null) __obj.updateDynamic("hwb")(hwb.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (!js.isUndefined(magenta)) __obj.updateDynamic("magenta")(magenta.asInstanceOf[js.Any])
    if (!js.isUndefined(magentaBright)) __obj.updateDynamic("magentaBright")(magentaBright.asInstanceOf[js.Any])
    if (!js.isUndefined(red)) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    if (!js.isUndefined(redBright)) __obj.updateDynamic("redBright")(redBright.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (rgb != null) __obj.updateDynamic("rgb")(rgb.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(white)) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    if (!js.isUndefined(whiteBright)) __obj.updateDynamic("whiteBright")(whiteBright.asInstanceOf[js.Any])
    if (!js.isUndefined(yellow)) __obj.updateDynamic("yellow")(yellow.asInstanceOf[js.Any])
    if (!js.isUndefined(yellowBright)) __obj.updateDynamic("yellowBright")(yellowBright.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ColorProps
}

