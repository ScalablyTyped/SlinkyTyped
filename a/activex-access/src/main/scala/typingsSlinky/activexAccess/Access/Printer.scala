package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Printer extends js.Object {
  @JSName("Access.Printer_typekey")
  var AccessDotPrinter_typekey: Printer = js.native
  var BottomMargin: Double = js.native
  var ColorMode: AcPrintColor = js.native
  var ColumnSpacing: Double = js.native
  var Copies: Double = js.native
  var DataOnly: Boolean = js.native
  var DefaultSize: Boolean = js.native
  val DeviceName: String = js.native
  val DriverName: String = js.native
  var Duplex: AcPrintDuplex = js.native
  var ItemLayout: AcPrintItemLayout = js.native
  var ItemSizeHeight: Double = js.native
  var ItemSizeWidth: Double = js.native
  var ItemsAcross: Double = js.native
  var LeftMargin: Double = js.native
  var Orientation: AcPrintOrientation = js.native
  var PaperBin: AcPrintPaperBin = js.native
  var PaperSize: AcPrintPaperSize = js.native
  val Port: String = js.native
  var PrintQuality: AcPrintObjQuality = js.native
  var RightMargin: Double = js.native
  var RowSpacing: Double = js.native
  var TopMargin: Double = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object Printer {
  @scala.inline
  def apply(
    AccessDotPrinter_typekey: Printer,
    BottomMargin: Double,
    ColorMode: AcPrintColor,
    ColumnSpacing: Double,
    Copies: Double,
    DataOnly: Boolean,
    DefaultSize: Boolean,
    DeviceName: String,
    DriverName: String,
    Duplex: AcPrintDuplex,
    IsMemberSafe: Double => Boolean,
    ItemLayout: AcPrintItemLayout,
    ItemSizeHeight: Double,
    ItemSizeWidth: Double,
    ItemsAcross: Double,
    LeftMargin: Double,
    Orientation: AcPrintOrientation,
    PaperBin: AcPrintPaperBin,
    PaperSize: AcPrintPaperSize,
    Port: String,
    PrintQuality: AcPrintObjQuality,
    RightMargin: Double,
    RowSpacing: Double,
    TopMargin: Double
  ): Printer = {
    val __obj = js.Dynamic.literal(BottomMargin = BottomMargin.asInstanceOf[js.Any], ColorMode = ColorMode.asInstanceOf[js.Any], ColumnSpacing = ColumnSpacing.asInstanceOf[js.Any], Copies = Copies.asInstanceOf[js.Any], DataOnly = DataOnly.asInstanceOf[js.Any], DefaultSize = DefaultSize.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], DriverName = DriverName.asInstanceOf[js.Any], Duplex = Duplex.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), ItemLayout = ItemLayout.asInstanceOf[js.Any], ItemSizeHeight = ItemSizeHeight.asInstanceOf[js.Any], ItemSizeWidth = ItemSizeWidth.asInstanceOf[js.Any], ItemsAcross = ItemsAcross.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PaperBin = PaperBin.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Printer_typekey")(AccessDotPrinter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printer]
  }
  @scala.inline
  implicit class PrinterOps[Self <: Printer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotPrinter_typekey(value: Printer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.Printer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: AcPrintColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriverName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplex(value: AcPrintDuplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemLayout(value: AcPrintItemLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSizeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSizeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemSizeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemSizeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemsAcross(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemsAcross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: AcPrintOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaperBin(value: AcPrintPaperBin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaperBin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaperSize(value: AcPrintPaperSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintQuality(value: AcPrintObjQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

