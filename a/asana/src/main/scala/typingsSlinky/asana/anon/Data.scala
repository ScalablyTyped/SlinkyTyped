package typingsSlinky.asana.anon

import typingsSlinky.asana.mod.resources.NextPage
import typingsSlinky.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[T /* <: Resource */] extends js.Object {
  var data: js.Array[T] = js.native
  var next_page: js.UndefOr[NextPage] = js.native
}

object Data {
  @scala.inline
  def apply[T](data: js.Array[T]): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  @scala.inline
  implicit class DataOps[Self[t] <: Data[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext_page(value: NextPage): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext_page: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_page")(js.undefined)
        ret
    }
  }
  
}

