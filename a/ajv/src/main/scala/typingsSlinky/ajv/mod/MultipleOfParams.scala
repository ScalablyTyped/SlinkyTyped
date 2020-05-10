package typingsSlinky.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleOfParams extends ErrorParameters {
  var multipleOf: Double = js.native
}

object MultipleOfParams {
  @scala.inline
  def apply(multipleOf: Double): MultipleOfParams = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOfParams]
  }
  @scala.inline
  implicit class MultipleOfParamsOps[Self <: MultipleOfParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipleOf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOf")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

