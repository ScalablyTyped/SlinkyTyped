package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateBranchProtectionParamsRequiredStatusChecks extends js.Object {
  /**
    * The list of status checks to require in order to merge into this branch
    */
  var contexts: js.Array[String] = js.native
  /**
    * Require branches to be up to date before merging.
    */
  var strict: Boolean = js.native
}

object ReposUpdateBranchProtectionParamsRequiredStatusChecks {
  @scala.inline
  def apply(contexts: js.Array[String], strict: Boolean): ReposUpdateBranchProtectionParamsRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredStatusChecks]
  }
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredStatusChecksOps[Self <: ReposUpdateBranchProtectionParamsRequiredStatusChecks] (val x: Self) extends AnyVal {
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
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

