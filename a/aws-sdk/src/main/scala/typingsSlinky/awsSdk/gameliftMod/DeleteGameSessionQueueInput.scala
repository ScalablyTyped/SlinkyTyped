package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGameSessionQueueInput extends StObject {
  
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region. You can use either the queue ID or ARN value. 
    */
  var Name: GameSessionQueueNameOrArn = js.native
}
object DeleteGameSessionQueueInput {
  
  @scala.inline
  def apply(Name: GameSessionQueueNameOrArn): DeleteGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameSessionQueueInput]
  }
  
  @scala.inline
  implicit class DeleteGameSessionQueueInputMutableBuilder[Self <: DeleteGameSessionQueueInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: GameSessionQueueNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
