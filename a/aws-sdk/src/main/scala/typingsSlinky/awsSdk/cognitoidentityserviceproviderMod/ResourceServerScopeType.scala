package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceServerScopeType extends StObject {
  
  /**
    * A description of the scope.
    */
  var ScopeDescription: ResourceServerScopeDescriptionType = js.native
  
  /**
    * The name of the scope.
    */
  var ScopeName: ResourceServerScopeNameType = js.native
}
object ResourceServerScopeType {
  
  @scala.inline
  def apply(ScopeDescription: ResourceServerScopeDescriptionType, ScopeName: ResourceServerScopeNameType): ResourceServerScopeType = {
    val __obj = js.Dynamic.literal(ScopeDescription = ScopeDescription.asInstanceOf[js.Any], ScopeName = ScopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScopeType]
  }
  
  @scala.inline
  implicit class ResourceServerScopeTypeMutableBuilder[Self <: ResourceServerScopeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescription(value: ResourceServerScopeDescriptionType): Self = StObject.set(x, "ScopeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeName(value: ResourceServerScopeNameType): Self = StObject.set(x, "ScopeName", value.asInstanceOf[js.Any])
  }
}
