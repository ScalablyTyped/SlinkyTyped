package typingsSlinky.googleapis.anon

import typingsSlinky.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderUrls extends StObject {
  
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
  
  var urls: js.UndefOr[js.Array[`6`]] = js.native
}
object HeaderUrls {
  
  @scala.inline
  def apply(): HeaderUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderUrls]
  }
  
  @scala.inline
  implicit class HeaderUrlsMutableBuilder[Self <: HeaderUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaPagespeedApiFormatStringV4): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[`6`]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: `6`*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
