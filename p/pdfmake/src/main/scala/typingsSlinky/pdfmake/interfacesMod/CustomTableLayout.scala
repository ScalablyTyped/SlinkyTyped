package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTableLayout extends _TableLayout {
  var defaultBorder: js.UndefOr[Boolean] = js.native
  var fillColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  var fillOpacity: js.UndefOr[Double | DynamicLayout[Double]] = js.native
  var hLineColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  var hLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.native
  var hLineWidth: js.UndefOr[DynamicLayout[Double]] = js.native
  var paddingBottom: js.UndefOr[DynamicLayout[Double]] = js.native
  var paddingLeft: js.UndefOr[DynamicLayout[Double]] = js.native
  var paddingRight: js.UndefOr[DynamicLayout[Double]] = js.native
  var paddingTop: js.UndefOr[DynamicLayout[Double]] = js.native
  var vLineColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  var vLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.native
  var vLineWidth: js.UndefOr[DynamicLayout[Double]] = js.native
}

object CustomTableLayout {
  @scala.inline
  def apply(): CustomTableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTableLayout]
  }
  @scala.inline
  implicit class CustomTableLayoutOps[Self <: CustomTableLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFillColor(value: String | DynamicLayout[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacityFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double | DynamicLayout[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineColor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHLineColor(value: String | DynamicLayout[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineStyle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineWidth")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottom(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeft(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRight(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPaddingRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTop(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withVLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineColor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVLineColor(value: String | DynamicLayout[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineStyle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutVLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withVLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineWidth")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutVLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vLineWidth")(js.undefined)
        ret
    }
  }
  
}

