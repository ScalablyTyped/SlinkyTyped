package typingsSlinky.elliptic.mod.curve.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecomputedValues extends js.Object {
   // ?
  var beta: js.Any = js.native
  var doubles: js.Any = js.native
   // ?
  var naf: js.Any = js.native
}

object PrecomputedValues {
  @scala.inline
  def apply(beta: js.Any, doubles: js.Any, naf: js.Any): PrecomputedValues = {
    val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], doubles = doubles.asInstanceOf[js.Any], naf = naf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecomputedValues]
  }
  @scala.inline
  implicit class PrecomputedValuesOps[Self <: PrecomputedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoubles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNaf(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

