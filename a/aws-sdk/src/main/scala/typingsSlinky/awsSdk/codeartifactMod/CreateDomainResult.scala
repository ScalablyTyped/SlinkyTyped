package typingsSlinky.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainResult extends StObject {
  
  /**
    *  Contains information about the created domain after processing the request. 
    */
  var domain: js.UndefOr[DomainDescription] = js.native
}
object CreateDomainResult {
  
  @scala.inline
  def apply(): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResult]
  }
  
  @scala.inline
  implicit class CreateDomainResultMutableBuilder[Self <: CreateDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainDescription): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
