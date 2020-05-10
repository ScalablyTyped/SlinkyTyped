package typingsSlinky.reactBootstrapTable2Toolkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVProps extends js.Object {
  /**
    * default is text/plain;charset=utf-8
    */
  var blobType: js.UndefOr[String] = js.native
  var exportAll: js.UndefOr[Boolean] = js.native
  var fileName: js.UndefOr[String] = js.native
  var ignoreHeader: js.UndefOr[Boolean] = js.native
  var noAutoBOM: js.UndefOr[Boolean] = js.native
  var onlyExportFiltered: js.UndefOr[Boolean] = js.native
  var onlyExportSelection: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
}

object CSVProps {
  @scala.inline
  def apply(): CSVProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVProps]
  }
  @scala.inline
  implicit class CSVPropsOps[Self <: CSVProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlobType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobType")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAll")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAutoBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAutoBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAutoBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAutoBOM")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyExportFiltered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExportFiltered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyExportFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExportFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyExportSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExportSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyExportSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyExportSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

