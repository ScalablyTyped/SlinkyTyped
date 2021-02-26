package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSet extends StObject {
  
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
  implicit class XssMatchSetMutableBuilder[Self <: XssMatchSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setXssMatchSetId(value: ResourceId): Self = StObject.set(x, "XssMatchSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchTuples(value: XssMatchTuples): Self = StObject.set(x, "XssMatchTuples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchTuplesVarargs(value: XssMatchTuple*): Self = StObject.set(x, "XssMatchTuples", js.Array(value :_*))
  }
}
