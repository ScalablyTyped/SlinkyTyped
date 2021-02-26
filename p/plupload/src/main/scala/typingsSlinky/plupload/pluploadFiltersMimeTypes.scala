package typingsSlinky.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadFiltersMimeTypes extends StObject {
  
  var extensions: String = js.native
  
  var title: String = js.native
}
object pluploadFiltersMimeTypes {
  
  @scala.inline
  def apply(extensions: String, title: String): pluploadFiltersMimeTypes = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadFiltersMimeTypes]
  }
  
  @scala.inline
  implicit class pluploadFiltersMimeTypesMutableBuilder[Self <: pluploadFiltersMimeTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
