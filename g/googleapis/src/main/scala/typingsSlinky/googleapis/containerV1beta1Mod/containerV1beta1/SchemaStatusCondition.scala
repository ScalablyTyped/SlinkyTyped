package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCondition describes why a cluster or a node pool has a certain status
  * (e.g., ERROR or DEGRADED).
  */
@js.native
trait SchemaStatusCondition extends js.Object {
  /**
    * Machine-friendly representation of the condition
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaStatusCondition {
  @scala.inline
  def apply(): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCondition]
  }
  @scala.inline
  implicit class SchemaStatusConditionOps[Self <: SchemaStatusCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

