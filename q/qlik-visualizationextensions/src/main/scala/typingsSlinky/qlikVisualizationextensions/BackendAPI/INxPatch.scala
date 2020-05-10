package typingsSlinky.qlikVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INxPatch extends js.Object {
  /**
    * Operation to perform.
    * One of:
    *       # Add
    *       # Remove
    *       # Replace
    */
  var qOp: PatchType = js.native
  /**
    * Path to the property to add, remove or replace.
    * String
    */
  var qPath: String = js.native
  /**
    * This parameter is not used in a remove operation. Corresponds to the value of the
    * property to add or to the new value of the property to update.
    * Examples: "false", "2", "\"New title\""
    * String
    */
  var qValue: String = js.native
}

object INxPatch {
  @scala.inline
  def apply(qOp: PatchType, qPath: String, qValue: String): INxPatch = {
    val __obj = js.Dynamic.literal(qOp = qOp.asInstanceOf[js.Any], qPath = qPath.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPatch]
  }
  @scala.inline
  implicit class INxPatchOps[Self <: INxPatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQOp(value: PatchType): Self = {
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

