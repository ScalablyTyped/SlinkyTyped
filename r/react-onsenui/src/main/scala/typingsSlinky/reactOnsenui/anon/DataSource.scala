package typingsSlinky.reactOnsenui.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource[T] extends js.Object {
  var dataSource: js.UndefOr[js.Array[T]] = js.native
  var modifier: js.UndefOr[String] = js.native
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.native
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.native
  var renderRow: js.UndefOr[
    js.Function2[/* row */ T, /* index */ js.UndefOr[Double], js.UndefOr[ReactElement]]
  ] = js.native
}

object DataSource {
  @scala.inline
  def apply[T](): DataSource[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource[T]]
  }
  @scala.inline
  implicit class DataSourceOps[Self[t] <: DataSource[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDataSource(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooter(value: () => js.UndefOr[ReactElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeader(value: () => js.UndefOr[ReactElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderRow(value: (/* row */ T, /* index */ js.UndefOr[Double]) => js.UndefOr[ReactElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRow")(js.undefined)
        ret
    }
  }
  
}

