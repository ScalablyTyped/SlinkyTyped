package typingsSlinky.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/Pagination/Pagination.PaginationClassKey>> */
@js.native
trait PartialClassNameMapPagina extends js.Object {
  var root: js.UndefOr[String] = js.native
  var ul: js.UndefOr[String] = js.native
}

object PartialClassNameMapPagina {
  @scala.inline
  def apply(): PartialClassNameMapPagina = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapPagina]
  }
  @scala.inline
  implicit class PartialClassNameMapPaginaOps[Self <: PartialClassNameMapPagina] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withUl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(js.undefined)
        ret
    }
  }
  
}

