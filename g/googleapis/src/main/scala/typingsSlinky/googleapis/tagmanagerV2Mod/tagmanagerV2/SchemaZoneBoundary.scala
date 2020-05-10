package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Zone&#39;s boundaries.
  */
@js.native
trait SchemaZoneBoundary extends js.Object {
  /**
    * The conditions that, when conjoined, make up the boundary.
    */
  var condition: js.UndefOr[js.Array[SchemaCondition]] = js.native
  /**
    * Custom evaluation trigger IDs. A zone will evaluate its boundary
    * conditions when any of the listed triggers are true.
    */
  var customEvaluationTriggerId: js.UndefOr[js.Array[String]] = js.native
}

object SchemaZoneBoundary {
  @scala.inline
  def apply(): SchemaZoneBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaZoneBoundary]
  }
  @scala.inline
  implicit class SchemaZoneBoundaryOps[Self <: SchemaZoneBoundary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: js.Array[SchemaCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEvaluationTriggerId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEvaluationTriggerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEvaluationTriggerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEvaluationTriggerId")(js.undefined)
        ret
    }
  }
  
}

