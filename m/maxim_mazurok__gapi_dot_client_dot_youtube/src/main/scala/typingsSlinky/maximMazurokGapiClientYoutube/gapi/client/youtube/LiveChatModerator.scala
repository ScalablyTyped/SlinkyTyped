package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveChatModerator extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube assigns to uniquely identify the moderator. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatModerator". */
  var kind: js.UndefOr[String] = js.native
  
  /** The snippet object contains basic details about the moderator. */
  var snippet: js.UndefOr[LiveChatModeratorSnippet] = js.native
}
object LiveChatModerator {
  
  @scala.inline
  def apply(): LiveChatModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatModerator]
  }
  
  @scala.inline
  implicit class LiveChatModeratorMutableBuilder[Self <: LiveChatModerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: LiveChatModeratorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
