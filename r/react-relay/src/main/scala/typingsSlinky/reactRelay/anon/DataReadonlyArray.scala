package typingsSlinky.reactRelay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataReadonlyArray extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Array[_]] = js.native
}

object DataReadonlyArray {
  @scala.inline
  def apply(): DataReadonlyArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReadonlyArray]
  }
  @scala.inline
  implicit class DataReadonlyArrayOps[Self <: DataReadonlyArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpace$data(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(" $data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace$data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(" $data")(js.undefined)
        ret
    }
  }
  
}

