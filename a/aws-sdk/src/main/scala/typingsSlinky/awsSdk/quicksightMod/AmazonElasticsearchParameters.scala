package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmazonElasticsearchParameters extends StObject {
  
  /**
    * The Amazon Elasticsearch Service domain.
    */
  var Domain: typingsSlinky.awsSdk.quicksightMod.Domain = js.native
}
object AmazonElasticsearchParameters {
  
  @scala.inline
  def apply(Domain: Domain): AmazonElasticsearchParameters = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonElasticsearchParameters]
  }
  
  @scala.inline
  implicit class AmazonElasticsearchParametersMutableBuilder[Self <: AmazonElasticsearchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
  }
}
