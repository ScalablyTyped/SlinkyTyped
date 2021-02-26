package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationMoveFailed extends Event {
  
  /**
    * Arguments to the application.
    */
  var args: String | js.Array[String] = js.native
  
  /**
    * Channel.
    */
  var channel: Channel = js.native
  
  /**
    * Destination.
    */
  var destination: String = js.native
}
object ApplicationMoveFailed {
  
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    destination: String,
    timestamp: js.Date,
    `type`: String
  ): ApplicationMoveFailed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMoveFailed]
  }
  
  @scala.inline
  implicit class ApplicationMoveFailedMutableBuilder[Self <: ApplicationMoveFailed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: String | js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
