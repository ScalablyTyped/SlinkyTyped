package typingsSlinky.awsSdkClientS3Browser.typesRoutingRuleMod

import typingsSlinky.awsSdkClientS3Browser.typesConditionMod.Condition
import typingsSlinky.awsSdkClientS3Browser.typesRedirectMod.Redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingRule extends js.Object {
  /**
    * <p>A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.</p>
    */
  var Condition: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesConditionMod.Condition] = js.native
  /**
    * <p>Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can can specify a different error code to return.</p>
    */
  var Redirect: typingsSlinky.awsSdkClientS3Browser.typesRedirectMod.Redirect = js.native
}

object RoutingRule {
  @scala.inline
  def apply(Redirect: Redirect): RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingRule]
  }
  @scala.inline
  implicit class RoutingRuleOps[Self <: RoutingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirect(value: Redirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: Condition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(js.undefined)
        ret
    }
  }
  
}

