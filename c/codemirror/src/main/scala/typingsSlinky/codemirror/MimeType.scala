package typingsSlinky.codemirror

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MimeType extends StObject {
  
  var alias: js.UndefOr[js.Array[String]] = js.native
  
  var ext: js.UndefOr[js.Array[String]] = js.native
  
  var file: js.UndefOr[js.RegExp] = js.native
  
  var mime: js.UndefOr[String] = js.native
  
  var mimes: js.UndefOr[String] = js.native
  
  var mode: String = js.native
  
  var name: String = js.native
}
object MimeType {
  
  @scala.inline
  def apply(mode: String, name: String): MimeType = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
  
  @scala.inline
  implicit class MimeTypeMutableBuilder[Self <: MimeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    @scala.inline
    def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    @scala.inline
    def setFile(value: js.RegExp): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setMimes(value: String): Self = StObject.set(x, "mimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimesUndefined: Self = StObject.set(x, "mimes", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
