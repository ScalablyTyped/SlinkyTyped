package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelTitleElement[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var titleElement: js.UndefOr[dxElement] = js.native
}

object ModelTitleElement {
  @scala.inline
  def apply[T](): ModelTitleElement[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelTitleElement[T]]
  }
  @scala.inline
  implicit class ModelTitleElementOps[Self[t] <: ModelTitleElement[t], T] (val x: Self[T]) extends AnyVal {
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
    def withTitleElement(value: dxElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleElement")(js.undefined)
        ret
    }
  }
  
}

