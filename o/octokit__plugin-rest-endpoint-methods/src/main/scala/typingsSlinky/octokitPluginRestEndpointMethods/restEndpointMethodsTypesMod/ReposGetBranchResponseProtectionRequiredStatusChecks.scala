package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchResponseProtectionRequiredStatusChecks extends js.Object {
  var contexts: js.Array[String] = js.native
  var enforcement_level: String = js.native
}

object ReposGetBranchResponseProtectionRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], enforcement_level: String): ReposGetBranchResponseProtectionRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], enforcement_level = enforcement_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseProtectionRequiredStatusChecks]
  }
  @scala.inline
  implicit class ReposGetBranchResponseProtectionRequiredStatusChecksOps[Self <: ReposGetBranchResponseProtectionRequiredStatusChecks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforcement_level(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcement_level")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

