package typingsSlinky.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCapability extends js.Object {
  var operators: js.Array[String] = js.native
}

object FilterCapability {
  @scala.inline
  def apply(operators: js.Array[String]): FilterCapability = {
    val __obj = js.Dynamic.literal(operators = operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCapability]
  }
  @scala.inline
  implicit class FilterCapabilityOps[Self <: FilterCapability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperators(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

