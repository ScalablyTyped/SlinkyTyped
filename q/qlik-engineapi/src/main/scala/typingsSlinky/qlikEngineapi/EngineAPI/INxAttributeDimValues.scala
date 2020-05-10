package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAttributeDimValues...
  */
@js.native
trait INxAttributeDimValues extends js.Object {
  /**
    * List of values.
    */
  var qValues: js.Array[INxSimpleDimValue] = js.native
}

object INxAttributeDimValues {
  @scala.inline
  def apply(qValues: js.Array[INxSimpleDimValue]): INxAttributeDimValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttributeDimValues]
  }
  @scala.inline
  implicit class INxAttributeDimValuesOps[Self <: INxAttributeDimValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQValues(value: js.Array[INxSimpleDimValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

