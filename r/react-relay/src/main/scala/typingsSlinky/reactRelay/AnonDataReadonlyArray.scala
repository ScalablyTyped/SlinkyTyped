package typingsSlinky.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataReadonlyArray extends js.Object {
  @JSName(" $data")
  val Space$data: js.UndefOr[js.Array[_]] = js.native
}

object AnonDataReadonlyArray {
  @scala.inline
  def apply(): AnonDataReadonlyArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDataReadonlyArray]
  }
  @scala.inline
  implicit class AnonDataReadonlyArrayOps[Self <: AnonDataReadonlyArray] (val x: Self) extends AnyVal {
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

