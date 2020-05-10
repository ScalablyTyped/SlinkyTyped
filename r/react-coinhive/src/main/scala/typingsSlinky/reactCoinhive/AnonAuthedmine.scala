package typingsSlinky.reactCoinhive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthedmine extends js.Object {
  var authedmine: String = js.native
  var coinhive: String = js.native
}

object AnonAuthedmine {
  @scala.inline
  def apply(authedmine: String, coinhive: String): AnonAuthedmine = {
    val __obj = js.Dynamic.literal(authedmine = authedmine.asInstanceOf[js.Any], coinhive = coinhive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthedmine]
  }
  @scala.inline
  implicit class AnonAuthedmineOps[Self <: AnonAuthedmine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthedmine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authedmine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoinhive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinhive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

