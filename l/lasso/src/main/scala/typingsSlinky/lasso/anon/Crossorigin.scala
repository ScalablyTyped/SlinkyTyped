package typingsSlinky.lasso.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crossorigin extends js.Object {
  var crossorigin: String = js.native
  var integrity: String = js.native
}

object Crossorigin {
  @scala.inline
  def apply(crossorigin: String, integrity: String): Crossorigin = {
    val __obj = js.Dynamic.literal(crossorigin = crossorigin.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crossorigin]
  }
  @scala.inline
  implicit class CrossoriginOps[Self <: Crossorigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossorigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegrity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

