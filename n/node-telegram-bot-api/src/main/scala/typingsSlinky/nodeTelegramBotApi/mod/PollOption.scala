package typingsSlinky.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollOption extends StObject {
  
  var text: String = js.native
  
  var voter_count: Double = js.native
}
object PollOption {
  
  @scala.inline
  def apply(text: String, voter_count: Double): PollOption = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], voter_count = voter_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOption]
  }
  
  @scala.inline
  implicit class PollOptionMutableBuilder[Self <: PollOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoter_count(value: Double): Self = StObject.set(x, "voter_count", value.asInstanceOf[js.Any])
  }
}
