package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSetSummary extends StObject {
  
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
  implicit class XssMatchSetSummaryMutableBuilder[Self <: XssMatchSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
  }
}
