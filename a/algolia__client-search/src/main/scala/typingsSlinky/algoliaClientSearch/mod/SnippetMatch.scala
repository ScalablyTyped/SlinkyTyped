package typingsSlinky.algoliaClientSearch.mod

import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.full
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.none
import typingsSlinky.algoliaClientSearch.algoliaClientSearchStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnippetMatch extends StObject {
  
  val matchLevel: none | partial | full = js.native
  
  val value: String = js.native
}
object SnippetMatch {
  
  @scala.inline
  def apply(matchLevel: none | partial | full, value: String): SnippetMatch = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetMatch]
  }
  
  @scala.inline
  implicit class SnippetMatchMutableBuilder[Self <: SnippetMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchLevel(value: none | partial | full): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
