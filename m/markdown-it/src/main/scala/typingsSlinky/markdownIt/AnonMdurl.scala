package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMdurl extends js.Object {
  var mdurl: Typeofmdurl = js.native
}

object AnonMdurl {
  @scala.inline
  def apply(mdurl: Typeofmdurl): AnonMdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMdurl]
  }
  @scala.inline
  implicit class AnonMdurlOps[Self <: AnonMdurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdurl(value: Typeofmdurl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdurl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

