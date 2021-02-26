package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConcurrency extends StObject {
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var Channel: typingsSlinky.awsSdk.connectMod.Channel = js.native
  
  /**
    * The number of contacts an agent can have on a channel simultaneously.
    */
  var Concurrency: typingsSlinky.awsSdk.connectMod.Concurrency = js.native
}
object MediaConcurrency {
  
  @scala.inline
  def apply(Channel: Channel, Concurrency: Concurrency): MediaConcurrency = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], Concurrency = Concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConcurrency]
  }
  
  @scala.inline
  implicit class MediaConcurrencyMutableBuilder[Self <: MediaConcurrency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrency(value: Concurrency): Self = StObject.set(x, "Concurrency", value.asInstanceOf[js.Any])
  }
}
