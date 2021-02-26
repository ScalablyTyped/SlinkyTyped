package typingsSlinky.gapiTranslate

import typingsSlinky.gapiTranslate.anon.Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiTranslateLanguageListResponse extends StObject {
  
  var data: Languages = js.native
}
object GoogleApiTranslateLanguageListResponse {
  
  @scala.inline
  def apply(data: Languages): GoogleApiTranslateLanguageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateLanguageListResponse]
  }
  
  @scala.inline
  implicit class GoogleApiTranslateLanguageListResponseMutableBuilder[Self <: GoogleApiTranslateLanguageListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Languages): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
