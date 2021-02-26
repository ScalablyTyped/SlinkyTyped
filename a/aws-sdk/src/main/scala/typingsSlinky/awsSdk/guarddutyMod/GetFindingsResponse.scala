package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsResponse extends StObject {
  
  /**
    * A list of findings.
    */
  var Findings: typingsSlinky.awsSdk.guarddutyMod.Findings = js.native
}
object GetFindingsResponse {
  
  @scala.inline
  def apply(Findings: Findings): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  @scala.inline
  implicit class GetFindingsResponseMutableBuilder[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: Findings): Self = StObject.set(x, "Findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "Findings", js.Array(value :_*))
  }
}
