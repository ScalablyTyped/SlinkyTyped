package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents page zoom properties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutZoomOptions extends js.Object {
  /**
    *
    * Number of pages to fit horizontally. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalFitToPages: js.UndefOr[Double] = js.native
  /**
    *
    * Print page scale value can be between 10 and 400. This value can be null if fit to page tall or wide is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    *
    * Number of pages to fit vertically. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalFitToPages: js.UndefOr[Double] = js.native
}

object PageLayoutZoomOptions {
  @scala.inline
  def apply(): PageLayoutZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutZoomOptions]
  }
  @scala.inline
  implicit class PageLayoutZoomOptionsOps[Self <: PageLayoutZoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHorizontalFitToPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalFitToPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalFitToPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalFitToPages")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalFitToPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFitToPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalFitToPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalFitToPages")(js.undefined)
        ret
    }
  }
  
}

