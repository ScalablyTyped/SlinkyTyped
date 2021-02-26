package typingsSlinky.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ArchiverZipOptions> */
@js.native
trait PartialArchiverZipOptions extends StObject {
  
  var comment: js.UndefOr[String] = js.native
  
  var forceLocalTime: js.UndefOr[Boolean] = js.native
  
  var forceZip64: js.UndefOr[Boolean] = js.native
  
  var store: js.UndefOr[Boolean] = js.native
  
  var zlib: js.UndefOr[PartialZlibOptions] = js.native
}
object PartialArchiverZipOptions {
  
  @scala.inline
  def apply(): PartialArchiverZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArchiverZipOptions]
  }
  
  @scala.inline
  implicit class PartialArchiverZipOptionsMutableBuilder[Self <: PartialArchiverZipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceLocalTimeUndefined: Self = StObject.set(x, "forceLocalTime", js.undefined)
    
    @scala.inline
    def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceZip64Undefined: Self = StObject.set(x, "forceZip64", js.undefined)
    
    @scala.inline
    def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setZlib(value: PartialZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
  }
}
