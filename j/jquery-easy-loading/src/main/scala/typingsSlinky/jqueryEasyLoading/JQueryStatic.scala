package typingsSlinky.jqueryEasyLoading

import typingsSlinky.jqueryEasyLoading.JQueryEasyLoading.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var Loading: Static = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(Loading: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(Loading = Loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: Static): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
  }
}
