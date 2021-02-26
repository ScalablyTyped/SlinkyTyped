package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeElasticsearchDomainRequest extends StObject {
  
  /**
    * The name of the Elasticsearch domain for which you want information.
    */
  var DomainName: typingsSlinky.awsSdk.esMod.DomainName = js.native
}
object DescribeElasticsearchDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchDomainRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchDomainRequestMutableBuilder[Self <: DescribeElasticsearchDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
