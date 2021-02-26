package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotVersionsResponse extends StObject {
  
  /**
    * An array of BotMetadata objects, one for each numbered version of the bot plus one for the $LATEST version.
    */
  var bots: js.UndefOr[BotMetadataList] = js.native
  
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetBotVersionsResponse {
  
  @scala.inline
  def apply(): GetBotVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotVersionsResponse]
  }
  
  @scala.inline
  implicit class GetBotVersionsResponseMutableBuilder[Self <: GetBotVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBots(value: BotMetadataList): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotsUndefined: Self = StObject.set(x, "bots", js.undefined)
    
    @scala.inline
    def setBotsVarargs(value: BotMetadata*): Self = StObject.set(x, "bots", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
