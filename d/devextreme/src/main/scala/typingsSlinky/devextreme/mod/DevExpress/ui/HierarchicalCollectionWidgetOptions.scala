package typingsSlinky.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalCollectionWidgetOptions[T] extends CollectionWidgetOptions[T] {
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding widget item is disabled. */
  var disabledExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the data field whose values should be displayed. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** Specifies which data field contains nested items. */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding widget items is selected. */
  var selectedExpr: js.UndefOr[String | js.Function] = js.native
}

object HierarchicalCollectionWidgetOptions {
  @scala.inline
  def apply[T](): HierarchicalCollectionWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalCollectionWidgetOptions[T]]
  }
  @scala.inline
  implicit class HierarchicalCollectionWidgetOptionsOps[Self[t] <: HierarchicalCollectionWidgetOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisabledExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayExprFunction1(value: /* item */ js.Any => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedExpr")(js.undefined)
        ret
    }
  }
  
}

