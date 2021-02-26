package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUtterancesViewRequest extends StObject {
  
  /**
    * The name of the bot for which utterance information should be returned.
    */
  var botName: BotName = js.native
  
  /**
    * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
    */
  var botVersions: BotVersions = js.native
  
  /**
    * To return utterances that were recognized and handled, use Detected. To return utterances that were not recognized, use Missed.
    */
  var statusType: StatusType = js.native
}
object GetUtterancesViewRequest {
  
  @scala.inline
  def apply(botName: BotName, botVersions: BotVersions, statusType: StatusType): GetUtterancesViewRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersions = botVersions.asInstanceOf[js.Any], statusType = statusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUtterancesViewRequest]
  }
  
  @scala.inline
  implicit class GetUtterancesViewRequestMutableBuilder[Self <: GetUtterancesViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersions(value: BotVersions): Self = StObject.set(x, "botVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersionsVarargs(value: Version*): Self = StObject.set(x, "botVersions", js.Array(value :_*))
    
    @scala.inline
    def setStatusType(value: StatusType): Self = StObject.set(x, "statusType", value.asInstanceOf[js.Any])
  }
}
