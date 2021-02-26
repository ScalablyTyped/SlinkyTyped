package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Searchterm
  extends /* key */ StringDictionary[js.Any] {
  
  var search_term: js.UndefOr[String] = js.native
}
object Searchterm {
  
  @scala.inline
  def apply(): Searchterm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchterm]
  }
  
  @scala.inline
  implicit class SearchtermMutableBuilder[Self <: Searchterm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
  }
}
