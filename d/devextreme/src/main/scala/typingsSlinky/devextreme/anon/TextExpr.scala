package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  var textExpr: js.UndefOr[String | js.Function] = js.native
}

object TextExpr {
  @scala.inline
  def apply(): TextExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextExpr]
  }
  @scala.inline
  implicit class TextExprOps[Self <: TextExpr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = {
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
    def withTextExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExpr")(js.undefined)
        ret
    }
  }
  
}

