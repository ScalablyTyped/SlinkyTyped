package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowMultiple extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.native
  var colorExpr: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[
    String | js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var displayExpr: js.UndefOr[String | (js.Function1[/* resource */ js.Any, String])] = js.native
  var fieldExpr: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var useColorAsDefault: js.UndefOr[Boolean] = js.native
  var valueExpr: js.UndefOr[String | js.Function] = js.native
}

object AllowMultiple {
  @scala.inline
  def apply(): AllowMultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMultiple]
  }
  @scala.inline
  implicit class AllowMultipleOps[Self <: AllowMultiple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withColorExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(
      value: String | js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
    ): Self = {
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
    def withDisplayExprFunction1(value: /* resource */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* resource */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withUseColorAsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColorAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseColorAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColorAsDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withValueExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(js.undefined)
        ret
    }
  }
  
}

