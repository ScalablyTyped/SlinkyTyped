package typingsSlinky.receptacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Export[T, X] extends js.Object {
  var id: Double | String = js.native
  var items: js.Array[Items[T] with InternalItemData[T]] = js.native
  var lastModified: js.Date = js.native
  var max: js.UndefOr[Double] = js.native
}

object Export {
  @scala.inline
  def apply[T, X](id: Double | String, items: js.Array[Items[T] with InternalItemData[T]], lastModified: js.Date): Export[T, X] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Export[T, X]]
  }
  @scala.inline
  implicit class ExportOps[Self[t, x] <: Export[t, x], T, X] (val x: Self[T, X]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, X] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, X]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, X]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, X]) with Other]
    @scala.inline
    def withId(value: Double | String): Self[T, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Items[T] with InternalItemData[T]]): Self[T, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self[T, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[T, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[T, X] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
  }
  
}

