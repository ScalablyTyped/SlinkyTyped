package typingsSlinky.nunjucks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autoescape extends js.Object {
  var autoescape: Boolean = js.native
}

object Autoescape {
  @scala.inline
  def apply(autoescape: Boolean): Autoescape = {
    val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoescape]
  }
  @scala.inline
  implicit class AutoescapeOps[Self <: Autoescape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoescape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoescape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

