package typingsSlinky.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  filename  :string,   separator  :string,   filterOptions  :std.Partial<{  useDisplayedColumnsOnly  :boolean,   useDisplayedRowsOnly  :boolean}>}> */
@js.native
trait Partialfilenamestringsepa extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var filterOptions: js.UndefOr[PartialuseDisplayedColumn] = js.native
  var separator: js.UndefOr[String] = js.native
}

object Partialfilenamestringsepa {
  @scala.inline
  def apply(): Partialfilenamestringsepa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfilenamestringsepa]
  }
  @scala.inline
  implicit class PartialfilenamestringsepaOps[Self <: Partialfilenamestringsepa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOptions(value: PartialuseDisplayedColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOptions")(js.undefined)
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

