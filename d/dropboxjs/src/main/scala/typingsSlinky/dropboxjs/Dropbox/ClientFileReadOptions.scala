package typingsSlinky.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientFileReadOptions extends StObject {
  
  var arrayBuffer: js.UndefOr[Boolean] = js.native
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var blob: js.UndefOr[Boolean] = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var httpCache: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var rev: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var versionTag: js.UndefOr[String] = js.native
}
object ClientFileReadOptions {
  
  @scala.inline
  def apply(): ClientFileReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileReadOptions]
  }
  
  @scala.inline
  implicit class ClientFileReadOptionsMutableBuilder[Self <: ClientFileReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: Boolean): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setBlob(value: Boolean): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
    
    @scala.inline
    def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCacheUndefined: Self = StObject.set(x, "httpCache", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTagUndefined: Self = StObject.set(x, "versionTag", js.undefined)
  }
}
