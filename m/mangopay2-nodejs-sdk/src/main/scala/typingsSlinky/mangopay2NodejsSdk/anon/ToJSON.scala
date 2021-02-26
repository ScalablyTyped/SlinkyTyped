package typingsSlinky.mangopay2NodejsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToJSON extends StObject {
  
  def toJSON(): js.Any = js.native
}
object ToJSON {
  
  @scala.inline
  def apply(toJSON: () => js.Any): ToJSON = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ToJSON]
  }
  
  @scala.inline
  implicit class ToJSONMutableBuilder[Self <: ToJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
