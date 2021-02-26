package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Required. The keyword, for example `car insurance`. Positive keyword cannot be offensive word. Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters
    * is 80. Maximum number of words is 10.
    */
  var keyword: js.UndefOr[String] = js.native
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.native
}
object KeywordAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): KeywordAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class KeywordAssignedTargetingOptionDetailsMutableBuilder[Self <: KeywordAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
  }
}
