package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetSummary extends js.Object {
  /**
    * The name of the XssMatchSet, if any, specified by Id.
    */
  var Name: ResourceName = js.native
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about a XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
}

object XssMatchSetSummary {
  @scala.inline
  def apply(Name: ResourceName, XssMatchSetId: ResourceId): XssMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetSummary]
  }
  @scala.inline
  implicit class XssMatchSetSummaryOps[Self <: XssMatchSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXssMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XssMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

