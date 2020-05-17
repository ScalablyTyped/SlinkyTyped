package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Gradient
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.text.GraphicCrop
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering an area. */
@js.native
trait FillProperties extends js.Object {
  /** if this is `TRUE` , the transparent background of a hatch filled area is drawn in the current background color. */
  var FillBackground: Boolean = js.native
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is the bitmap used. */
  var FillBitmap: XBitmap = js.native
  /**
    * specifies if the size is given in percentage or as an absolute value.
    *
    * If this is `TRUE` , the properties {@link FillBitmapSizeX} and {@link FillBitmapSizeY} contain the size of the tile in percent of the size of the
    * original bitmap. If this is `FALSE` , the size of the tile is specified with 1/100th mm.
    */
  var FillBitmapLogicalSize: Boolean = js.native
  /**
    * this enum selects how a area is filled with a single bitmap.
    *
    * This property corresponds to the properties {@link FillBitmapStretch} and {@link FillBitmapTile} .
    *
    * If set to BitmapMode::REPEAT, the property FillBitmapStretch is set to `FALSE` , and the property FillBitmapTile is set to `TRUE` .
    *
    * If set to BitmapMode::STRETCH, the property FillBitmapStretch is set to `TRUE` , and the property FillBitmapTile is set to `FALSE` .
    *
    * If set to BitmapMode::NO_REPEAT, both properties FillBitmapStretch and FillBitmapTile are set to `FALSE` .
    */
  var FillBitmapMode: BitmapMode = js.native
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is the name of the used fill bitmap style. */
  var FillBitmapName: String = js.native
  /** Every second line of tiles is moved the given percent of the width of the bitmap. */
  var FillBitmapOffsetX: Double = js.native
  /** Every second row of tiles is moved the given percent of the height of the bitmap. */
  var FillBitmapOffsetY: Double = js.native
  /**
    * This is the horizontal offset where the tile starts.
    *
    * It is given in percent in relation to the width of the bitmap.
    */
  var FillBitmapPositionOffsetX: Double = js.native
  /**
    * This is the vertical offset where the tile starts.
    *
    * It is given in percent in relation to the height of the bitmap.
    */
  var FillBitmapPositionOffsetY: Double = js.native
  /** The RectanglePoint specifies the position inside of the bitmap to use as the top left position for rendering. */
  var FillBitmapRectanglePoint: RectanglePoint = js.native
  /**
    * This is the width of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeX: Double = js.native
  /**
    * This is the height of the tile for filling.
    *
    * Depending on the property {@link FillBitmapLogicalSize} , this is either relative or absolute.
    */
  var FillBitmapSizeY: Double = js.native
  /**
    * if set, the fill bitmap is stretched to fill the area of the shape.
    *
    * This property should not be used anymore and is included here for completeness. The {@link FillBitmapMode} property can be used instead to set all
    * supported bitmap modes.
    *
    * If set to `TRUE` , the value of the FillBitmapMode property changes to BitmapMode::STRETCH. BUT: behavior is undefined, if the property {@link
    * FillBitmapTile} is `TRUE` too.
    *
    * If set to `FALSE` , the value of the FillBitmapMode property changes to BitmapMode::REPEAT or BitmapMode::NO_REPEAT, depending on the current value of
    * the {@link FillBitmapTile} property.
    */
  var FillBitmapStretch: Boolean = js.native
  /**
    * if set, the fill bitmap is repeated to fill the area of the shape.
    *
    * This property should not be used anymore and is included here for completeness. The {@link FillBitmapMode} property can be used instead to set all
    * supported bitmap modes.
    *
    * If set to `TRUE` , the value of the FillBitmapMode property changes to BitmapMode::REPEAT. BUT: behavior is undefined, if the property {@link
    * FillBitmapStretch} is `TRUE` too.
    *
    * If set to `FALSE` , the value of the FillBitmapMode property changes to BitmapMode::STRETCH or BitmapMode::NO_REPEAT, depending on the current value
    * of the {@link FillBitmapStretch} property.
    */
  var FillBitmapTile: Boolean = js.native
  /** If the property {@link FillStyle} is set to FillStyle::BITMAP, this is a URL to the bitmap used. */
  var FillBitmapURL: String = js.native
  /** If the property {@link FillStyle} is set to FillStyle::SOLID, this is the color used. */
  var FillColor: Color = js.native
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this describes the gradient used. */
  var FillGradient: Gradient = js.native
  /** If the property {@link FillStyle} is set to FillStyle::GRADIENT, this is the name of the used fill gradient style. */
  var FillGradientName: String = js.native
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this describes the hatch used. */
  var FillHatch: Hatch = js.native
  /** If the property {@link FillStyle} is set to FillStyle::HATCH, this is the name of the used fill hatch style. */
  var FillHatchName: String = js.native
  /** This enumeration selects the style the area will be filled with. */
  var FillStyle: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.FillStyle = js.native
  /**
    * This is the transparence of the filled area.
    *
    * This property is only valid if the property {@link FillStyle} is set to FillStyle::SOLID.
    */
  var FillTransparence: Double = js.native
  /** This describes the transparency of the fill area as a gradient. */
  var FillTransparenceGradient: Gradient = js.native
  /**
    * If a gradient is used for transparency, this is the name of the used transparence gradient style or it is empty. If you set the name of a transparence
    * gradient style contained in the document, this style used.
    */
  var FillTransparenceGradientName: String = js.native
  /**
    * contains the cropping of the object.
    *
    * If the property {@link FillBitmapMode} is set to BitmapMode::STRETCH, this is the cropping, otherwise it is empty.
    * @see com.sun.star.text.GraphicCrop
    * @since LibreOffice 4.3
    */
  var GraphicCrop: typingsSlinky.activexLibreoffice.com_.sun.star.text.GraphicCrop = js.native
}

object FillProperties {
  @scala.inline
  def apply(
    FillBackground: Boolean,
    FillBitmap: XBitmap,
    FillBitmapLogicalSize: Boolean,
    FillBitmapMode: BitmapMode,
    FillBitmapName: String,
    FillBitmapOffsetX: Double,
    FillBitmapOffsetY: Double,
    FillBitmapPositionOffsetX: Double,
    FillBitmapPositionOffsetY: Double,
    FillBitmapRectanglePoint: RectanglePoint,
    FillBitmapSizeX: Double,
    FillBitmapSizeY: Double,
    FillBitmapStretch: Boolean,
    FillBitmapTile: Boolean,
    FillBitmapURL: String,
    FillColor: Color,
    FillGradient: Gradient,
    FillGradientName: String,
    FillHatch: Hatch,
    FillHatchName: String,
    FillStyle: FillStyle,
    FillTransparence: Double,
    FillTransparenceGradient: Gradient,
    FillTransparenceGradientName: String,
    GraphicCrop: GraphicCrop
  ): FillProperties = {
    val __obj = js.Dynamic.literal(FillBackground = FillBackground.asInstanceOf[js.Any], FillBitmap = FillBitmap.asInstanceOf[js.Any], FillBitmapLogicalSize = FillBitmapLogicalSize.asInstanceOf[js.Any], FillBitmapMode = FillBitmapMode.asInstanceOf[js.Any], FillBitmapName = FillBitmapName.asInstanceOf[js.Any], FillBitmapOffsetX = FillBitmapOffsetX.asInstanceOf[js.Any], FillBitmapOffsetY = FillBitmapOffsetY.asInstanceOf[js.Any], FillBitmapPositionOffsetX = FillBitmapPositionOffsetX.asInstanceOf[js.Any], FillBitmapPositionOffsetY = FillBitmapPositionOffsetY.asInstanceOf[js.Any], FillBitmapRectanglePoint = FillBitmapRectanglePoint.asInstanceOf[js.Any], FillBitmapSizeX = FillBitmapSizeX.asInstanceOf[js.Any], FillBitmapSizeY = FillBitmapSizeY.asInstanceOf[js.Any], FillBitmapStretch = FillBitmapStretch.asInstanceOf[js.Any], FillBitmapTile = FillBitmapTile.asInstanceOf[js.Any], FillBitmapURL = FillBitmapURL.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], FillGradient = FillGradient.asInstanceOf[js.Any], FillGradientName = FillGradientName.asInstanceOf[js.Any], FillHatch = FillHatch.asInstanceOf[js.Any], FillHatchName = FillHatchName.asInstanceOf[js.Any], FillStyle = FillStyle.asInstanceOf[js.Any], FillTransparence = FillTransparence.asInstanceOf[js.Any], FillTransparenceGradient = FillTransparenceGradient.asInstanceOf[js.Any], FillTransparenceGradientName = FillTransparenceGradientName.asInstanceOf[js.Any], GraphicCrop = GraphicCrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillProperties]
  }
  @scala.inline
  implicit class FillPropertiesOps[Self <: FillProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmap(value: XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapLogicalSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapLogicalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapMode(value: BitmapMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapPositionOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapPositionOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapPositionOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapPositionOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapRectanglePoint(value: RectanglePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapRectanglePoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapSizeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapSizeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapSizeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapSizeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapStretch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapTile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillBitmapURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillBitmapURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillGradient(value: Gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillGradientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillGradientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillHatch(value: Hatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillHatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillHatchName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillHatchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyle(value: FillStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillTransparence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillTransparence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillTransparenceGradient(value: Gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillTransparenceGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillTransparenceGradientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillTransparenceGradientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphicCrop(value: GraphicCrop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GraphicCrop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

