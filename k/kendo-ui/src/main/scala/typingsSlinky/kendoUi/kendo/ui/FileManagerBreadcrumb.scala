package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerBreadcrumb extends js.Object {
  var delimiterIcon: js.UndefOr[String] = js.native
  var rootIcon: js.UndefOr[String] = js.native
}

object FileManagerBreadcrumb {
  @scala.inline
  def apply(): FileManagerBreadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerBreadcrumb]
  }
  @scala.inline
  implicit class FileManagerBreadcrumbOps[Self <: FileManagerBreadcrumb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiterIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRootIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIcon")(js.undefined)
        ret
    }
  }
  
}

