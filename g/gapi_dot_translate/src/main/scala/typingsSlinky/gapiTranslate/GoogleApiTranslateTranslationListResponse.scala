package typingsSlinky.gapiTranslate

import typingsSlinky.gapiTranslate.anon.Translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiTranslateTranslationListResponse extends StObject {
  
  var data: Translations = js.native
}
object GoogleApiTranslateTranslationListResponse {
  
  @scala.inline
  def apply(data: Translations): GoogleApiTranslateTranslationListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiTranslateTranslationListResponse]
  }
  
  @scala.inline
  implicit class GoogleApiTranslateTranslationListResponseMutableBuilder[Self <: GoogleApiTranslateTranslationListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Translations): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
