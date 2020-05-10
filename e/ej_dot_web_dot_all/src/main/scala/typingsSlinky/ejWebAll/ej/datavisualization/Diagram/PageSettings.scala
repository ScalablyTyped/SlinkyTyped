package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSettings extends js.Object {
  /** Defines the maximum distance to be left between the object and the scroll bar to trigger auto scrolling
    * @Default {{ left: 15, top: 15, right: 15, bottom: 15 }}
    */
  var autoScrollBorder: js.UndefOr[js.Any] = js.native
  /** Defines the draggable region of diagram elements.
    * @Default {ej.datavisualization.Diagram.BoundaryConstraints.Infinite}
    */
  var boundaryConstraints: js.UndefOr[BoundaryConstraints | String] = js.native
  /** Sets whether multiple pages can be created to fit all nodes and connectors
    * @Default {false}
    */
  var multiplePage: js.UndefOr[Boolean] = js.native
  /** Defines the background color of diagram pages
    * @Default {#ffffff}
    */
  var pageBackgroundColor: js.UndefOr[String] = js.native
  /** Defines the page border color
    * @Default {#565656}
    */
  var pageBorderColor: js.UndefOr[String] = js.native
  /** Sets the border width of diagram pages
    * @Default {0}
    */
  var pageBorderWidth: js.UndefOr[Double] = js.native
  /** Defines the height of a page
    * @Default {null}
    */
  var pageHeight: js.UndefOr[Double] = js.native
  /** Defines the page margin
    * @Default {24}
    */
  var pageMargin: js.UndefOr[Double] = js.native
  /** Sets the orientation of the page.
    * @Default {ej.datavisualization.Diagram.PageOrientations.Portrait}
    */
  var pageOrientation: js.UndefOr[PageOrientations | String] = js.native
  /** Defines the height of a diagram page
    * @Default {null}
    */
  var pageWidth: js.UndefOr[Double] = js.native
  /** Defines the scrollable region of diagram.
    * @Default {ej.datavisualization.Diagram.ScrollLimit.Infinite}
    */
  var scrollLimit: js.UndefOr[ScrollLimit | String] = js.native
  /** Defines the scrollable area of diagram. Applicable, if the scroll limit is &quot;limited&quot;.
    * @Default {null}
    */
  var scrollableArea: js.UndefOr[js.Any] = js.native
  /** Enables or disables the page breaks
    * @Default {false}
    */
  var showPageBreak: js.UndefOr[Boolean] = js.native
}

object PageSettings {
  @scala.inline
  def apply(): PageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSettings]
  }
  @scala.inline
  implicit class PageSettingsOps[Self <: PageSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoScrollBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryConstraints(value: BoundaryConstraints | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryConstraints")(js.undefined)
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
    def withPageBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageBorderWidth")(js.undefined)
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
    def withPageMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: PageOrientations | String): Self = {
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
    def withScrollLimit(value: ScrollLimit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableArea(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableArea")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPageBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPageBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPageBreak")(js.undefined)
        ret
    }
  }
  
}

