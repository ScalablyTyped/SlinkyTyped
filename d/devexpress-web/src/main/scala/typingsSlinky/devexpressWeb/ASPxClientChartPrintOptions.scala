package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chart print options storage.
  */
@js.native
trait ASPxClientChartPrintOptions extends js.Object {
  /**
    * Gets the custom paper height which will be used to print a chart.
    */
  def GetCustomPaperHeight(): Double = js.native
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): String = js.native
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): Double = js.native
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): Boolean = js.native
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): Double = js.native
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): Double = js.native
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): Double = js.native
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): Double = js.native
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): String = js.native
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): Boolean = js.native
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): String = js.native
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: Double): Unit = js.native
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: String): Unit = js.native
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: Double): Unit = js.native
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: Boolean): Unit = js.native
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: Double): Unit = js.native
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: Double): Unit = js.native
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: Double): Unit = js.native
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: Double): Unit = js.native
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: String): Unit = js.native
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: Boolean): Unit = js.native
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: String): Unit = js.native
}

object ASPxClientChartPrintOptions {
  @scala.inline
  def apply(
    GetCustomPaperHeight: () => Double,
    GetCustomPaperName: () => String,
    GetCustomPaperWidth: () => Double,
    GetLandscape: () => Boolean,
    GetMarginBottom: () => Double,
    GetMarginLeft: () => Double,
    GetMarginRight: () => Double,
    GetMarginTop: () => Double,
    GetPaperKind: () => String,
    GetPrintCrosshair: () => Boolean,
    GetSizeMode: () => String,
    SetCustomPaperHeight: Double => Unit,
    SetCustomPaperName: String => Unit,
    SetCustomPaperWidth: Double => Unit,
    SetLandscape: Boolean => Unit,
    SetMarginBottom: Double => Unit,
    SetMarginLeft: Double => Unit,
    SetMarginRight: Double => Unit,
    SetMarginTop: Double => Unit,
    SetPaperKind: String => Unit,
    SetPrintCrosshair: Boolean => Unit,
    SetSizeMode: String => Unit
  ): ASPxClientChartPrintOptions = {
    val __obj = js.Dynamic.literal(GetCustomPaperHeight = js.Any.fromFunction0(GetCustomPaperHeight), GetCustomPaperName = js.Any.fromFunction0(GetCustomPaperName), GetCustomPaperWidth = js.Any.fromFunction0(GetCustomPaperWidth), GetLandscape = js.Any.fromFunction0(GetLandscape), GetMarginBottom = js.Any.fromFunction0(GetMarginBottom), GetMarginLeft = js.Any.fromFunction0(GetMarginLeft), GetMarginRight = js.Any.fromFunction0(GetMarginRight), GetMarginTop = js.Any.fromFunction0(GetMarginTop), GetPaperKind = js.Any.fromFunction0(GetPaperKind), GetPrintCrosshair = js.Any.fromFunction0(GetPrintCrosshair), GetSizeMode = js.Any.fromFunction0(GetSizeMode), SetCustomPaperHeight = js.Any.fromFunction1(SetCustomPaperHeight), SetCustomPaperName = js.Any.fromFunction1(SetCustomPaperName), SetCustomPaperWidth = js.Any.fromFunction1(SetCustomPaperWidth), SetLandscape = js.Any.fromFunction1(SetLandscape), SetMarginBottom = js.Any.fromFunction1(SetMarginBottom), SetMarginLeft = js.Any.fromFunction1(SetMarginLeft), SetMarginRight = js.Any.fromFunction1(SetMarginRight), SetMarginTop = js.Any.fromFunction1(SetMarginTop), SetPaperKind = js.Any.fromFunction1(SetPaperKind), SetPrintCrosshair = js.Any.fromFunction1(SetPrintCrosshair), SetSizeMode = js.Any.fromFunction1(SetSizeMode))
    __obj.asInstanceOf[ASPxClientChartPrintOptions]
  }
  @scala.inline
  implicit class ASPxClientChartPrintOptionsOps[Self <: ASPxClientChartPrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCustomPaperHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomPaperHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomPaperName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomPaperName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomPaperWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCustomPaperWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLandscape(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLandscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarginBottom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMarginBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarginLeft(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMarginLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarginRight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMarginRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMarginTop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMarginTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPaperKind(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPaperKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrintCrosshair(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPrintCrosshair")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSizeMode(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSizeMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCustomPaperHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCustomPaperHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCustomPaperName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCustomPaperName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCustomPaperWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetCustomPaperWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLandscape(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLandscape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMarginBottom(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMarginBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMarginLeft(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMarginLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMarginRight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMarginRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMarginTop(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMarginTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPaperKind(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPaperKind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrintCrosshair(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetPrintCrosshair")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSizeMode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSizeMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

