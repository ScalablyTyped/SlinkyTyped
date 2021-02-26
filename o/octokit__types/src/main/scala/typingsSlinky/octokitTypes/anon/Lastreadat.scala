package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lastreadat extends StObject {
  
  var id: String = js.native
  
  var last_read_at: String = js.native
  
  var reason: String = js.native
  
  var repository: Archiveurl = js.native
  
  var subject: Latestcommenturl = js.native
  
  var unread: Boolean = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object Lastreadat {
  
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: Archiveurl,
    subject: Latestcommenturl,
    unread: Boolean,
    updated_at: String,
    url: String
  ): Lastreadat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_read_at = last_read_at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastreadat]
  }
  
  @scala.inline
  implicit class LastreadatMutableBuilder[Self <: Lastreadat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Latestcommenturl): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnread(value: Boolean): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
