package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotChannelAssociationRequest extends StObject {
  
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName = js.native
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  
  /**
    * The name of the association between the bot and the channel. The name is case sensitive. 
    */
  var name: BotChannelName = js.native
}
object GetBotChannelAssociationRequest {
  
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): GetBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotChannelAssociationRequest]
  }
  
  @scala.inline
  implicit class GetBotChannelAssociationRequestMutableBuilder[Self <: GetBotChannelAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotAlias(value: AliasName): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: BotChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
