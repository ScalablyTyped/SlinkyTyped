package typingsSlinky.pulumiKubernetes.outputMod.apiregistration.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceStatus contains derived information about an API server
  */
@js.native
trait APIServiceStatus extends js.Object {
  /**
    * Current service state of apiService.
    */
  val conditions: js.Array[APIServiceCondition] = js.native
}

object APIServiceStatus {
  @scala.inline
  def apply(conditions: js.Array[APIServiceCondition]): APIServiceStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceStatus]
  }
  @scala.inline
  implicit class APIServiceStatusOps[Self <: APIServiceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[APIServiceCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

