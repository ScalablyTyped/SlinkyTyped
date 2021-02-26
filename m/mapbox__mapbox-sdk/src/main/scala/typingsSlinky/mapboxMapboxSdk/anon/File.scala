package typingsSlinky.mapboxMapboxSdk.anon

import org.scalajs.dom.raw.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends StObject {
  
  var file: Blob | js.typedarray.ArrayBuffer | String = js.native
  
  var iconId: String = js.native
  
  var ownerId: js.UndefOr[String] = js.native
  
  var styleId: String = js.native
}
object File {
  
  @scala.inline
  def apply(file: Blob | js.typedarray.ArrayBuffer | String, iconId: String, styleId: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: Blob | js.typedarray.ArrayBuffer | String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileBlob(value: Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconId(value: String): Self = StObject.set(x, "iconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
