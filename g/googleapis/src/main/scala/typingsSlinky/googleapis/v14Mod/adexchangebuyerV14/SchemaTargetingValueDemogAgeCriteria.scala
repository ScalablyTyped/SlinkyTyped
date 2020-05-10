package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueDemogAgeCriteria extends js.Object {
  var demogAgeCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetingValueDemogAgeCriteria {
  @scala.inline
  def apply(): SchemaTargetingValueDemogAgeCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingValueDemogAgeCriteria]
  }
  @scala.inline
  implicit class SchemaTargetingValueDemogAgeCriteriaOps[Self <: SchemaTargetingValueDemogAgeCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemogAgeCriteriaIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogAgeCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemogAgeCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demogAgeCriteriaIds")(js.undefined)
        ret
    }
  }
  
}

