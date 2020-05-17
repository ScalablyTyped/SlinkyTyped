package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsSlinky.activexLibreoffice.com_.sun.star.graphic.XGraphic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** properties that are used for {@link DataSeries} that display symbols. */
@js.native
trait Symbol extends js.Object {
  /**
    * The color used for drawing the border of symbols.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var BorderColor: Double = js.native
  /**
    * The color used for filling symbols that contain closed polygons.
    *
    * Only effective if {@link Style} is SymbolStyle::AUTO, SymbolStyle::STANDARD or SymbolStyle::POLYGON.
    */
  var FillColor: Double = js.native
  /** use this graphic as symbol */
  var Graphic: XGraphic = js.native
  /** The given polygon is used as symbol. */
  var PolygonCoords: PolyPolygonBezierCoords = js.native
  /** The size of the symbol in 100th of a mm. */
  var Size: typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size = js.native
  /**
    * Use the nth standard symbol, if {@link Style} is set to SymbolStlye::STANDARD.
    *
    * If n is the number of standard symbols available in an implementation, the symbol number is {@link StandardSymbol} modulo n.
    *
    * The default implementation for example currently uses 8 different standard symbols that are matched to the numbers 0 to 7.
    *
    * {{table here, see documentation}}
    */
  var StandardSymbol: Double = js.native
  /** determines which of the following members determines the appearance of the symbol. */
  var Style: SymbolStyle = js.native
}

object Symbol {
  @scala.inline
  def apply(
    BorderColor: Double,
    FillColor: Double,
    Graphic: XGraphic,
    PolygonCoords: PolyPolygonBezierCoords,
    Size: Size,
    StandardSymbol: Double,
    Style: SymbolStyle
  ): Symbol = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor.asInstanceOf[js.Any], FillColor = FillColor.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PolygonCoords = PolygonCoords.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StandardSymbol = StandardSymbol.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphic(value: XGraphic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Graphic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygonCoords(value: PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolygonCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardSymbol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: SymbolStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

