package typingsSlinky.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertContent extends StObject {
  
  var insertContent: String = js.native
  
  var insertPattern: js.RegExp | String = js.native
}
object InsertContent {
  
  @scala.inline
  def apply(insertContent: String, insertPattern: js.RegExp | String): InsertContent = {
    val __obj = js.Dynamic.literal(insertContent = insertContent.asInstanceOf[js.Any], insertPattern = insertPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertContent]
  }
  
  @scala.inline
  implicit class InsertContentMutableBuilder[Self <: InsertContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertContent(value: String): Self = StObject.set(x, "insertContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPattern(value: js.RegExp | String): Self = StObject.set(x, "insertPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPatternRegExp(value: js.RegExp): Self = StObject.set(x, "insertPattern", value.asInstanceOf[js.Any])
  }
}
