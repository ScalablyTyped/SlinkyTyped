package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains options related to exporting a dashboard/dashboard item to an image.
  */
@js.native
trait DashboardImageExportOptions extends js.Object {
  /**
    * Gets or sets whether to add the state of master filter items to the exported document.
    */
  var ExportFilters: Boolean = js.native
  /**
    * Gets or sets whether to add current parameter values to the exported document.
    */
  var ExportParameters: Boolean = js.native
  var FontInfo: ExportFontInfo = js.native
  /**
    * Gets or sets an image format in which the dashboard/dashboard item is exported.
    */
  var Format: String = js.native
  /**
    * Gets or sets whether to add current values of a hidden parameter to the exported document.
    */
  var IncludeHiddenParameters: Boolean = js.native
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard/dashboard item to an image.
    */
  var Resolution: Double = js.native
  /**
    * Gets or sets the scale factor (in fractions of 1), by which a dashboard/dashboard item is scaled in the exported document.
    */
  var ScaleFactor: Double = js.native
  /**
    * Gets or sets whether a dashboard title (or dashboard item's caption) is included as the exported document title.
    */
  var ShowTitle: Boolean = js.native
  /**
    * Gets or sets a title of the exported document.
    */
  var Title: String = js.native
}

object DashboardImageExportOptions {
  @scala.inline
  def apply(
    ExportFilters: Boolean,
    ExportParameters: Boolean,
    FontInfo: ExportFontInfo,
    Format: String,
    IncludeHiddenParameters: Boolean,
    Resolution: Double,
    ScaleFactor: Double,
    ShowTitle: Boolean,
    Title: String
  ): DashboardImageExportOptions = {
    val __obj = js.Dynamic.literal(ExportFilters = ExportFilters.asInstanceOf[js.Any], ExportParameters = ExportParameters.asInstanceOf[js.Any], FontInfo = FontInfo.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], IncludeHiddenParameters = IncludeHiddenParameters.asInstanceOf[js.Any], Resolution = Resolution.asInstanceOf[js.Any], ScaleFactor = ScaleFactor.asInstanceOf[js.Any], ShowTitle = ShowTitle.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardImageExportOptions]
  }
  @scala.inline
  implicit class DashboardImageExportOptionsOps[Self <: DashboardImageExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontInfo(value: ExportFontInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeHiddenParameters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeHiddenParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

