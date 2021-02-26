package typingsSlinky.jqueryFinger

import typingsSlinky.jqueryFinger.JQueryFinger.JQueryFingerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var Finger: JQueryFingerOptions = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(Finger: JQueryFingerOptions): JQueryStatic = {
    val __obj = js.Dynamic.literal(Finger = Finger.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinger(value: JQueryFingerOptions): Self = StObject.set(x, "Finger", value.asInstanceOf[js.Any])
  }
}
