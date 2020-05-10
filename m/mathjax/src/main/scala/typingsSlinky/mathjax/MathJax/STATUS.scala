package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STATUS extends js.Object {
  /*The value used to indicate that a file load has caused an error or a timeout to occur.*/
  var ERROR: String = js.native
  /*The value used to indicate that a file load has occurred successfully.*/
  var OK: String = js.native
}

object STATUS {
  @scala.inline
  def apply(ERROR: String, OK: String): STATUS = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATUS]
  }
  @scala.inline
  implicit class STATUSOps[Self <: STATUS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

