package typingsSlinky.qrcodeSvg.mod

import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.H
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.L
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.M
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.Q
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.`svg-viewbox`
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.g
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.none
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Color of background, color name or hex string. Default is `#fffff`. */
  var background: js.UndefOr[String] = js.native
  /** Color of modules (squares), color name or hex string. Default is `#000000`. */
  var color: js.UndefOr[String] = js.native
  /**
    * Wrapping element. Default is `svg`. \
    * `svg`: Populate squares in a SVG document with `width` and `height` attribute.
    * Recommended for converting to raster images or PDF where QR Code is being static (exact size). \
    * `svg-viewbox`: Populate squares in a SVG document with viewBox attriute.
    * **Recommended** for responsive web pages. \
    * `g`: Put squares in `g` element.
    * Useful when you need to put multiple QR Codes in a single SVG document \
    * `none`: No wrapper.
    */
  var container: js.UndefOr[svg | `svg-viewbox` | g | none] = js.native
  /** QR Code content, the only **required** parameter. */
  var content: String = js.native
  /** Error correction level. Default is `"M"`. */
  var ecl: js.UndefOr[L | M | H | Q] = js.native
  /** QR Code height in pixels. Default is `256`. */
  var height: js.UndefOr[Double] = js.native
  /** Join modules (squares) into one shape, into the SVG path element, **recommended** for web and responsive use. Default is `false`. */
  var join: js.UndefOr[Boolean] = js.native
  /** White space padding. `0` for no border. Default is `4`. */
  var padding: js.UndefOr[Double] = js.native
  /** To create a squares as pattern, then populate the canvas. Default is `false`. */
  var predefined: js.UndefOr[Boolean] = js.native
  /** Apply indents and new lines. Default is `true`. */
  var pretty: js.UndefOr[Boolean] = js.native
  /** Swap X and Y modules, only if you have issues with some QR readers. Default is `false`. */
  var swap: js.UndefOr[Boolean] = js.native
  /** QR Code width in pixels. Default is `256`. */
  var width: js.UndefOr[Double] = js.native
  /** Prepend XML declaration to the SVG document, i.e. ```<?xml version="1.0" standalone="yes"?>```. Default is `true`. */
  var xmlDeclaration: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(content: String): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: svg | `svg-viewbox` | g | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withEcl(value: L | M | H | Q): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withJoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefined")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withSwap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlDeclaration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDeclaration")(js.undefined)
        ret
    }
  }
  
}

