package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofaccRadius extends js.Object {
  def request(comment: String): Double = js.native
}

object TypeofaccRadius {
  @scala.inline
  def apply(request: String => Double): TypeofaccRadius = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[TypeofaccRadius]
  }
  @scala.inline
  implicit class TypeofaccRadiusOps[Self <: TypeofaccRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

