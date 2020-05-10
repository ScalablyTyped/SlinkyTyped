package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortConfig extends js.Object {
  /**
    * The list of abort criteria to define rules to abort the job.
    */
  var criteriaList: AbortCriteriaList = js.native
}

object AbortConfig {
  @scala.inline
  def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortConfig]
  }
  @scala.inline
  implicit class AbortConfigOps[Self <: AbortConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCriteriaList(value: AbortCriteriaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteriaList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

