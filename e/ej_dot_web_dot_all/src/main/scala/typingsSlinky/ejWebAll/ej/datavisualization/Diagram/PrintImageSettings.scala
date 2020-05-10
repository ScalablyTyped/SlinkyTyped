package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintImageSettings extends js.Object {
  /** to print any custom region of diagram.
    */
  var bounds: js.UndefOr[js.Any] = js.native
  /** to export the diagram into multiple pages
    */
  var multiplePage: js.UndefOr[Boolean] = js.native
  /** to set the page height of the diagram while printing the diagram into multiple pages.
    */
  var pageHeight: js.UndefOr[Double] = js.native
  /** to sets the orientation of the page.
    */
  var pageOrientation: js.UndefOr[PageOrientations] = js.native
  /** to set the page width of the diagram while printing the diagram into multiple pages.
    */
  var pageWidth: js.UndefOr[Double] = js.native
  /** to set the region of the diagram to be printed.
    */
  var region: js.UndefOr[Region] = js.native
}

object PrintImageSettings {
  @scala.inline
  def apply(): PrintImageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintImageSettings]
  }
  @scala.inline
  implicit class PrintImageSettingsOps[Self <: PrintImageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiplePage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplePage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplePage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplePage")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: PageOrientations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

