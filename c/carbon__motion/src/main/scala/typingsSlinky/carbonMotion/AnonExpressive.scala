package typingsSlinky.carbonMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExpressive extends js.Object {
  var expressive: String = js.native
  var productive: String = js.native
}

object AnonExpressive {
  @scala.inline
  def apply(expressive: String, productive: String): AnonExpressive = {
    val __obj = js.Dynamic.literal(expressive = expressive.asInstanceOf[js.Any], productive = productive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpressive]
  }
  @scala.inline
  implicit class AnonExpressiveOps[Self <: AnonExpressive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

