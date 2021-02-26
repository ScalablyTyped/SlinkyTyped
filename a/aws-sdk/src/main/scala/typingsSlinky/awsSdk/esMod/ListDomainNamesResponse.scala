package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainNamesResponse extends StObject {
  
  /**
    * List of Elasticsearch domain names.
    */
  var DomainNames: js.UndefOr[DomainInfoList] = js.native
}
object ListDomainNamesResponse {
  
  @scala.inline
  def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  
  @scala.inline
  implicit class ListDomainNamesResponseMutableBuilder[Self <: ListDomainNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainNames(value: DomainInfoList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
    
    @scala.inline
    def setDomainNamesVarargs(value: DomainInfo*): Self = StObject.set(x, "DomainNames", js.Array(value :_*))
  }
}
