package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorCommentOptions extends StObject {
  
  var hint: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[scala.Double] = js.native
  
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var skip: js.UndefOr[scala.Double] = js.native
}
object CursorCommentOptions {
  
  @scala.inline
  def apply(): CursorCommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorCommentOptions]
  }
  
  @scala.inline
  implicit class CursorCommentOptionsMutableBuilder[Self <: CursorCommentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
