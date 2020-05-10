package typingsSlinky.monk

import typingsSlinky.monk.monkNumbers.`0`
import typingsSlinky.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNModified extends js.Object {
  var n: Double = js.native
  var nModified: Double = js.native
  var ok: `1` | `0` = js.native
}

object AnonNModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: `1` | `0`): AnonNModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNModified]
  }
  @scala.inline
  implicit class AnonNModifiedOps[Self <: AnonNModified] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

