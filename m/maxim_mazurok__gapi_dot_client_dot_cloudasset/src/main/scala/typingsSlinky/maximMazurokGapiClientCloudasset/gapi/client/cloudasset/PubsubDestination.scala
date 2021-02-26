package typingsSlinky.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubDestination extends StObject {
  
  /** The name of the Pub/Sub topic to publish to. Example: `projects/PROJECT_ID/topics/TOPIC_ID`. */
  var topic: js.UndefOr[String] = js.native
}
object PubsubDestination {
  
  @scala.inline
  def apply(): PubsubDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubDestination]
  }
  
  @scala.inline
  implicit class PubsubDestinationMutableBuilder[Self <: PubsubDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
