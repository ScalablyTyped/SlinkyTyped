package typingsSlinky.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEname extends js.Object {
  var ename: String = js.native
  var evalue: String = js.native
  var traceback: js.Array[String] = js.native
}

object AnonEname {
  @scala.inline
  def apply(ename: String, evalue: String, traceback: js.Array[String]): AnonEname = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEname]
  }
  @scala.inline
  implicit class AnonEnameOps[Self <: AnonEname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraceback(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

