package typingsSlinky.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SrcString extends StObject {
  
  var src: String = js.native
}
object SrcString {
  
  @scala.inline
  def apply(src: String): SrcString = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcString]
  }
  
  @scala.inline
  implicit class SrcStringMutableBuilder[Self <: SrcString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
