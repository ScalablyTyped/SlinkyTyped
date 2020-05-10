package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndExpr extends js.Object {
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions] = js.native
  var endExpr: js.UndefOr[String | js.Function] = js.native
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  var progressExpr: js.UndefOr[String | js.Function] = js.native
  var startExpr: js.UndefOr[String | js.Function] = js.native
  var titleExpr: js.UndefOr[String | js.Function] = js.native
}

object AnonEndExpr {
  @scala.inline
  def apply(): AnonEndExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEndExpr]
  }
  @scala.inline
  implicit class AnonEndExprOps[Self <: AnonEndExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEndExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withStartExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleExpr")(js.undefined)
        ret
    }
  }
  
}

