package typingsSlinky.devextreme.mod.DevExpress.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayStoreOptions[T] extends StoreOptions[T] {
  /** Specifies the store's associated array. */
  var data: js.UndefOr[js.Array[_]] = js.native
}

object ArrayStoreOptions {
  @scala.inline
  def apply[T](): ArrayStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayStoreOptions[T]]
  }
  @scala.inline
  implicit class ArrayStoreOptionsOps[Self[t] <: ArrayStoreOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

