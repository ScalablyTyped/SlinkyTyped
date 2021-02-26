package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateLexBotRequest extends StObject {
  
  /**
    * The name of the Amazon Lex bot. Maximum character limit of 50.
    */
  var BotName: typingsSlinky.awsSdk.connectMod.BotName = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The Region in which the Amazon Lex bot has been created.
    */
  var LexRegion: typingsSlinky.awsSdk.connectMod.LexRegion = js.native
}
object DisassociateLexBotRequest {
  
  @scala.inline
  def apply(BotName: BotName, InstanceId: InstanceId, LexRegion: LexRegion): DisassociateLexBotRequest = {
    val __obj = js.Dynamic.literal(BotName = BotName.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LexRegion = LexRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLexBotRequest]
  }
  
  @scala.inline
  implicit class DisassociateLexBotRequestMutableBuilder[Self <: DisassociateLexBotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "BotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexRegion(value: LexRegion): Self = StObject.set(x, "LexRegion", value.asInstanceOf[js.Any])
  }
}
