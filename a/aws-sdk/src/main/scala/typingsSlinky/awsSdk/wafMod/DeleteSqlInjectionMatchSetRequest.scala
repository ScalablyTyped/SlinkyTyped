package typingsSlinky.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSqlInjectionMatchSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafMod.ChangeToken = js.native
  
  /**
    * The SqlInjectionMatchSetId of the SqlInjectionMatchSet that you want to delete. SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId = js.native
}
object DeleteSqlInjectionMatchSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, SqlInjectionMatchSetId: ResourceId): DeleteSqlInjectionMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSqlInjectionMatchSetRequest]
  }
  
  @scala.inline
  implicit class DeleteSqlInjectionMatchSetRequestMutableBuilder[Self <: DeleteSqlInjectionMatchSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlInjectionMatchSetId(value: ResourceId): Self = StObject.set(x, "SqlInjectionMatchSetId", value.asInstanceOf[js.Any])
  }
}
