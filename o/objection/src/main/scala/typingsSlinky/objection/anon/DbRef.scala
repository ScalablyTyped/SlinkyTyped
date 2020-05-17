package typingsSlinky.objection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbRef extends js.Object {
  @JSName("#dbRef")
  var NumbersigndbRef: Double = js.native
}

object DbRef {
  @scala.inline
  def apply(NumbersigndbRef: Double): DbRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#dbRef")(NumbersigndbRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbRef]
  }
  @scala.inline
  implicit class DbRefOps[Self <: DbRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumbersigndbRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("#dbRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

