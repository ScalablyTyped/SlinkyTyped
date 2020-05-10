package typingsSlinky.rotJs.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayOptions extends js.Object {
  var bg: String = js.native
  var border: Double = js.native
  var fg: String = js.native
  var fontFamily: String = js.native
  var fontSize: Double = js.native
  var fontStyle: String = js.native
  var forceSquareRatio: Boolean = js.native
  var height: Double = js.native
  var layout: LayoutType = js.native
  var spacing: Double = js.native
  var tileColorize: Boolean = js.native
  var tileHeight: Double = js.native
  var tileMap: StringDictionary[js.Tuple2[Double, Double]] = js.native
  var tileSet: Null | HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap = js.native
  var tileWidth: Double = js.native
  var transpose: Boolean = js.native
  var width: Double = js.native
}

object DisplayOptions {
  @scala.inline
  def apply(
    bg: String,
    border: Double,
    fg: String,
    fontFamily: String,
    fontSize: Double,
    fontStyle: String,
    forceSquareRatio: Boolean,
    height: Double,
    layout: LayoutType,
    spacing: Double,
    tileColorize: Boolean,
    tileHeight: Double,
    tileMap: StringDictionary[js.Tuple2[Double, Double]],
    tileWidth: Double,
    transpose: Boolean,
    width: Double
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], forceSquareRatio = forceSquareRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], tileColorize = tileColorize.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileMap = tileMap.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
  @scala.inline
  implicit class DisplayOptionsOps[Self <: DisplayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceSquareRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSquareRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: LayoutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileColorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileColorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileMap(value: StringDictionary[js.Tuple2[Double, Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranspose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSetHTMLVideoElement(value: HTMLVideoElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSetHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSetHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSet(value: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement | ImageBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileSetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSet")(null)
        ret
    }
  }
  
}

