package typingsSlinky.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents extends StObject {
  
  var contents: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Contents {
  
  @scala.inline
  def apply(): Contents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
