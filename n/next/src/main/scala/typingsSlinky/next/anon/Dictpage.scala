package typingsSlinky.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictpage
  extends /* page */ StringDictionary[js.Array[String]] {
  
  @JSName("/_app")
  var Slash_app: js.Array[String] = js.native
}
object Dictpage {
  
  @scala.inline
  def apply(Slash_app: js.Array[String]): Dictpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/_app")(Slash_app.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictpage]
  }
  
  @scala.inline
  implicit class DictpageMutableBuilder[Self <: Dictpage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlash_app(value: js.Array[String]): Self = StObject.set(x, "/_app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlash_appVarargs(value: String*): Self = StObject.set(x, "/_app", js.Array(value :_*))
  }
}
