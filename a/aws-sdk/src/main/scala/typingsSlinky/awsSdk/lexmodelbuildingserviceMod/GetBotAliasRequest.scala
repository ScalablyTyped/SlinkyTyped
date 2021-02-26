package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotAliasRequest extends StObject {
  
  /**
    * The name of the bot.
    */
  var botName: BotName = js.native
  
  /**
    * The name of the bot alias. The name is case sensitive.
    */
  var name: AliasName = js.native
}
object GetBotAliasRequest {
  
  @scala.inline
  def apply(botName: BotName, name: AliasName): GetBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotAliasRequest]
  }
  
  @scala.inline
  implicit class GetBotAliasRequestMutableBuilder[Self <: GetBotAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
