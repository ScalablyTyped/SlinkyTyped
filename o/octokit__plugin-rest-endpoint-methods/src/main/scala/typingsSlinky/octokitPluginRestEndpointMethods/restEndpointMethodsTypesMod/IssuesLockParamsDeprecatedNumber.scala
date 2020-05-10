package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`off-topic`
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`too heated`
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.resolved
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.spam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesLockParamsDeprecatedNumber extends js.Object {
  /**
    * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    */
  var lock_reason: js.UndefOr[`off-topic` | (`too heated`) | resolved | spam] = js.native
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object IssuesLockParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String): IssuesLockParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockParamsDeprecatedNumber]
  }
  @scala.inline
  implicit class IssuesLockParamsDeprecatedNumberOps[Self <: IssuesLockParamsDeprecatedNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock_reason(value: `off-topic` | (`too heated`) | resolved | spam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_reason")(js.undefined)
        ret
    }
  }
  
}

