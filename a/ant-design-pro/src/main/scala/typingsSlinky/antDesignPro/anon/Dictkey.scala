package typingsSlinky.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey extends /* key */ StringDictionary[String] {
  
  var clear: String = js.native
  
  var emptyText: String = js.native
  
  var viewMore: String = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(clear: String, emptyText: String, viewMore: String): Dictkey = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], viewMore = viewMore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMore(value: String): Self = StObject.set(x, "viewMore", value.asInstanceOf[js.Any])
  }
}
