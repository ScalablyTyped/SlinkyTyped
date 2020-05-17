package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromExpr extends js.Object {
  var dataSource: js.UndefOr[
    js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var fromExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var fromLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var fromPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var lineTypeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var pointsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toLineEndExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var toPointIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
}

object FromExpr {
  @scala.inline
  def apply(): FromExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromExpr]
  }
  @scala.inline
  implicit class FromExprOps[Self <: FromExpr] (val x: Self) extends AnyVal {
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
    def withFromExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withFromLineEndExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLineEndExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromLineEndExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLineEndExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromLineEndExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromLineEndExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withFromPointIndexExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPointIndexExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromPointIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPointIndexExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPointIndexExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPointIndexExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
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
    def withLineTypeExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTypeExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLineTypeExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTypeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineTypeExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTypeExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLockedExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withPointsExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointsExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTextExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
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
    @scala.inline
    def withTextStyleExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyleExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withToExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withToLineEndExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLineEndExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToLineEndExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLineEndExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToLineEndExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLineEndExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withToPointIndexExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPointIndexExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToPointIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPointIndexExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPointIndexExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPointIndexExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexExpr")(js.undefined)
        ret
    }
  }
  
}

