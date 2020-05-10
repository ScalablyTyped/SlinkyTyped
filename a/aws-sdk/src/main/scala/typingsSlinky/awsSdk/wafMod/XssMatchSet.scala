package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSet extends js.Object {
  /**
    * The name, if any, of the XssMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about an XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  var XssMatchTuples: typingsSlinky.awsSdk.wafMod.XssMatchTuples = js.native
}

object XssMatchSet {
  @scala.inline
  def apply(XssMatchSetId: ResourceId, XssMatchTuples: XssMatchTuples): XssMatchSet = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any], XssMatchTuples = XssMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSet]
  }
  @scala.inline
  implicit class XssMatchSetOps[Self <: XssMatchSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXssMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XssMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXssMatchTuples(value: XssMatchTuples): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XssMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

