package typingsSlinky.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents extends StObject {
  
  var contents: String = js.native
  
  var element: org.scalajs.dom.raw.Element = js.native
}
object Contents {
  
  @scala.inline
  def apply(contents: String, element: org.scalajs.dom.raw.Element): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
