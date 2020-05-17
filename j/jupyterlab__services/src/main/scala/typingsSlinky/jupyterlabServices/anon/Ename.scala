package typingsSlinky.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ename extends js.Object {
  var ename: String = js.native
  var evalue: String = js.native
  var traceback: js.Array[String] = js.native
}

object Ename {
  @scala.inline
  def apply(ename: String, evalue: String, traceback: js.Array[String]): Ename = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ename]
  }
  @scala.inline
  implicit class EnameOps[Self <: Ename] (val x: Self) extends AnyVal {
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

