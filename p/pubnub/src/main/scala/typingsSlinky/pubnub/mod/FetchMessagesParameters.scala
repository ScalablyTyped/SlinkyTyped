package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchMessagesParameters extends StObject {
  
  var channels: js.Array[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  // timetoken
  var end: js.UndefOr[String | Double] = js.native
  
  var includeMessageActions: js.UndefOr[Boolean] = js.native
  
  var includeMeta: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[String | Double] = js.native
  
  var stringifiedTimeToken: js.UndefOr[Boolean] = js.native
  
  // timetoken
  var withMessageActions: js.UndefOr[Boolean] = js.native
}
object FetchMessagesParameters {
  
  @scala.inline
  def apply(channels: js.Array[String]): FetchMessagesParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMessagesParameters]
  }
  
  @scala.inline
  implicit class FetchMessagesParametersMutableBuilder[Self <: FetchMessagesParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEnd(value: String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setIncludeMessageActions(value: Boolean): Self = StObject.set(x, "includeMessageActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMessageActionsUndefined: Self = StObject.set(x, "includeMessageActions", js.undefined)
    
    @scala.inline
    def setIncludeMeta(value: Boolean): Self = StObject.set(x, "includeMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMetaUndefined: Self = StObject.set(x, "includeMeta", js.undefined)
    
    @scala.inline
    def setStart(value: String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStringifiedTimeToken(value: Boolean): Self = StObject.set(x, "stringifiedTimeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringifiedTimeTokenUndefined: Self = StObject.set(x, "stringifiedTimeToken", js.undefined)
    
    @scala.inline
    def setWithMessageActions(value: Boolean): Self = StObject.set(x, "withMessageActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithMessageActionsUndefined: Self = StObject.set(x, "withMessageActions", js.undefined)
  }
}
