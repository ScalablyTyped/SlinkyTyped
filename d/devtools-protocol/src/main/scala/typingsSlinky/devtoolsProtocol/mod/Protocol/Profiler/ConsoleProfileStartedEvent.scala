package typingsSlinky.devtoolsProtocol.mod.Protocol.Profiler

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleProfileStartedEvent extends StObject {
  
  var id: String = js.native
  
  /**
    * Location of console.profile().
    */
  var location: Location = js.native
  
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.native
}
object ConsoleProfileStartedEvent {
  
  @scala.inline
  def apply(id: String, location: Location): ConsoleProfileStartedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileStartedEvent]
  }
  
  @scala.inline
  implicit class ConsoleProfileStartedEventMutableBuilder[Self <: ConsoleProfileStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
