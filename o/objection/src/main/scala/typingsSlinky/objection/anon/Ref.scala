package typingsSlinky.objection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref extends js.Object {
  @JSName("#ref")
  var Numbersignref: String = js.native
}

object Ref {
  @scala.inline
  def apply(Numbersignref: String): Ref = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("#ref")(Numbersignref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  @scala.inline
  implicit class RefOps[Self <: Ref] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumbersignref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("#ref")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

