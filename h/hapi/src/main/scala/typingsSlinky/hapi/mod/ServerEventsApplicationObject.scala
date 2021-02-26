package typingsSlinky.hapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEventsApplicationObject extends StObject {
  
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * if true, the data object passed to server.events.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is).
    */
  @JSName("clone")
  var clone_FServerEventsApplicationObject: js.UndefOr[Boolean] = js.native
  
  /** the event name string (required). */
  var name: String = js.native
  
  /**
    * if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first
    * configuration is used. Defaults to false (a duplicate registration will throw an error).
    */
  var shared: js.UndefOr[Boolean] = js.native
  
  /**
    * if true, the data object passed to server.event.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified
    * by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type).
    */
  var spread: js.UndefOr[Boolean] = js.native
  
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to
    * the arguments list at the end. A configuration override can be set by each listener. Defaults to false.
    */
  var tags: js.UndefOr[Boolean] = js.native
}
object ServerEventsApplicationObject {
  
  @scala.inline
  def apply(name: String): ServerEventsApplicationObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventsApplicationObject]
  }
  
  @scala.inline
  implicit class ServerEventsApplicationObjectMutableBuilder[Self <: ServerEventsApplicationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    @scala.inline
    def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    @scala.inline
    def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
