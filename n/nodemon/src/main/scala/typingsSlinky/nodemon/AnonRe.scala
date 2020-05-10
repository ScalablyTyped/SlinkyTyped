package typingsSlinky.nodemon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRe extends js.Object {
  var re: String = js.native
}

object AnonRe {
  @scala.inline
  def apply(re: String): AnonRe = {
    val __obj = js.Dynamic.literal(re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRe]
  }
  @scala.inline
  implicit class AnonReOps[Self <: AnonRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("re")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

