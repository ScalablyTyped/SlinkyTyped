package typingsSlinky.arcgisJsApi

import typingsSlinky.arcgisJsApi.esri.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItems[T /* <: Base */, Base] extends js.Object {
  var items: js.UndefOr[js.Array[T] | Collection[T]] = js.native
}

object AnonItems {
  @scala.inline
  def apply[T, Base](): AnonItems[T, Base] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonItems[T, Base]]
  }
  @scala.inline
  implicit class AnonItemsOps[Self[t, base] <: AnonItems[t, base], T, Base] (val x: Self[T, Base]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Base] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Base]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Base]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Base]) with Other]
    @scala.inline
    def withItems(value: js.Array[T] | Collection[T]): Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T, Base] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

