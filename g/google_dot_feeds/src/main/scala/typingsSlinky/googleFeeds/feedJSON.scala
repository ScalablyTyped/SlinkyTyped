package typingsSlinky.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait feedJSON extends StObject {
  
  var author: String = js.native
  
  var description: String = js.native
  
  var entries: js.Array[feedEntry] = js.native
  
  var feedURL: String = js.native
  
  var link: String = js.native
}
object feedJSON {
  
  @scala.inline
  def apply(author: String, description: String, entries: js.Array[feedEntry], feedURL: String, link: String): feedJSON = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], feedURL = feedURL.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedJSON]
  }
  
  @scala.inline
  implicit class feedJSONMutableBuilder[Self <: feedJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: js.Array[feedEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: feedEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setFeedURL(value: String): Self = StObject.set(x, "feedURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
