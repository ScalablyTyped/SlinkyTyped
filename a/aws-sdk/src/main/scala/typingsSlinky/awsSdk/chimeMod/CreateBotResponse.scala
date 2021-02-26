package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBotResponse extends StObject {
  
  /**
    * The bot details.
    */
  var Bot: js.UndefOr[typingsSlinky.awsSdk.chimeMod.Bot] = js.native
}
object CreateBotResponse {
  
  @scala.inline
  def apply(): CreateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotResponse]
  }
  
  @scala.inline
  implicit class CreateBotResponseMutableBuilder[Self <: CreateBotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
