package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.add
import typingsSlinky.qlik.qlikStrings.remove
import typingsSlinky.qlik.qlikStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Patch extends js.Object {
  var qOp: add | remove | replace = js.native
  var qPath: String = js.native
  var qValue: String = js.native
}

object Patch {
  @scala.inline
  def apply(qOp: add | remove | replace, qPath: String, qValue: String): Patch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQOp(value: add | remove | replace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

