package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.DevExpress.data.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowClearing extends js.Object {
  var allowClearing: js.UndefOr[Boolean] = js.native
  var dataSource: js.UndefOr[
    js.Array[_] | DataSourceOptions | Store | (js.Function1[/* options */ DataKey, js.Array[_] | DataSourceOptions | Store])
  ] = js.native
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.native
  var valueExpr: js.UndefOr[String] = js.native
}

object AllowClearing {
  @scala.inline
  def apply(): AllowClearing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowClearing]
  }
  @scala.inline
  implicit class AllowClearingOps[Self <: AllowClearing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClearing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClearing")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceFunction1(value: /* options */ DataKey => js.Array[_] | DataSourceOptions | Store): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataSource(
      value: js.Array[_] | DataSourceOptions | Store | (js.Function1[/* options */ DataKey, js.Array[_] | DataSourceOptions | Store])
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
    def withDisplayExprFunction1(value: /* data */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* data */ js.Any, String])): Self = {
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
    def withValueExpr(value: String): Self = {
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

