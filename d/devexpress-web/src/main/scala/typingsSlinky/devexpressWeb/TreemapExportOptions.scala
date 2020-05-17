package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Treemap dashboard item is Printing and Exporting.
  */
@js.native
trait TreemapExportOptions extends js.Object {
  /** @deprecated The TreemapExportOptions.AutomaticPageLayout property is obsolete now. Use the DashboardPdfExportOptions.TreemapAutomaticPageLayout property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether the page orientation used to export a Treemap dashboard item is selected automatically.
    */
  var AutomaticPageLayout: Boolean = js.native
  /** @deprecated The TreemapExportOptions.SizeMode property is obsolete now. Use the DashboardPdfExportOptions.TreemapSizeMode property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the export size mode for the Treemap dashboard item.
    */
  var SizeMode: String = js.native
}

object TreemapExportOptions {
  @scala.inline
  def apply(AutomaticPageLayout: Boolean, SizeMode: String): TreemapExportOptions = {
    val __obj = js.Dynamic.literal(AutomaticPageLayout = AutomaticPageLayout.asInstanceOf[js.Any], SizeMode = SizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapExportOptions]
  }
  @scala.inline
  implicit class TreemapExportOptionsOps[Self <: TreemapExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticPageLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomaticPageLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

