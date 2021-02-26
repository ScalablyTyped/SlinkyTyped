package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListKafkaVersionsResponse extends StObject {
  
  var KafkaVersions: js.UndefOr[listOfKafkaVersion] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object ListKafkaVersionsResponse {
  
  @scala.inline
  def apply(): ListKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKafkaVersionsResponse]
  }
  
  @scala.inline
  implicit class ListKafkaVersionsResponseMutableBuilder[Self <: ListKafkaVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKafkaVersions(value: listOfKafkaVersion): Self = StObject.set(x, "KafkaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaVersionsUndefined: Self = StObject.set(x, "KafkaVersions", js.undefined)
    
    @scala.inline
    def setKafkaVersionsVarargs(value: KafkaVersion*): Self = StObject.set(x, "KafkaVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
