package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.layered
import typingsSlinky.devextreme.devextremeStrings.off
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoLayout extends js.Object {
  var autoLayout: js.UndefOr[off | tree | layered | Orientation] = js.native
  var childrenExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var containerKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var dataSource: js.UndefOr[
    js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  var heightExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var imageUrlExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var itemsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var leftExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var parentKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var topExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var typeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var widthExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
}

object AutoLayout {
  @scala.inline
  def apply(): AutoLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLayout]
  }
  @scala.inline
  implicit class AutoLayoutOps[Self <: AutoLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoLayout(value: off | tree | layered | Orientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildrenExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerKeyExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerKeyExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContainerKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerKeyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerKeyExpr")(js.undefined)
        ret
    }
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
    def withHeightExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeightExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrlExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImageUrlExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrlExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrlExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemsExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.undefined)
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
    def withLeftExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeftExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftExpr")(js.undefined)
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
    def withParentKeyExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKeyExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParentKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKeyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentKeyExpr")(js.undefined)
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
    def withTopExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTopExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTypeExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthExprFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidthExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthExpr")(js.undefined)
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

