package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentDeselectedRowKeys[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var currentDeselectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var currentSelectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  var selectedRowsData: js.UndefOr[js.Array[_]] = js.native
}

object AnonCurrentDeselectedRowKeys {
  @scala.inline
  def apply[T](): AnonCurrentDeselectedRowKeys[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCurrentDeselectedRowKeys[T]]
  }
  @scala.inline
  implicit class AnonCurrentDeselectedRowKeysOps[Self[t] <: AnonCurrentDeselectedRowKeys[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDeselectedRowKeys(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDeselectedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDeselectedRowKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDeselectedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentSelectedRowKeys(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentSelectedRowKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSelectedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowKeys(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowsData(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowsData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowsData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowsData")(js.undefined)
        ret
    }
  }
  
}

