package typingsSlinky.expoConfigureSplashScreen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceContent extends StObject {
  
  var replaceContent: String = js.native
  
  var replacePattern: String | js.RegExp = js.native
}
object ReplaceContent {
  
  @scala.inline
  def apply(replaceContent: String, replacePattern: String | js.RegExp): ReplaceContent = {
    val __obj = js.Dynamic.literal(replaceContent = replaceContent.asInstanceOf[js.Any], replacePattern = replacePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContent]
  }
  
  @scala.inline
  implicit class ReplaceContentMutableBuilder[Self <: ReplaceContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceContent(value: String): Self = StObject.set(x, "replaceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacePattern(value: String | js.RegExp): Self = StObject.set(x, "replacePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacePatternRegExp(value: js.RegExp): Self = StObject.set(x, "replacePattern", value.asInstanceOf[js.Any])
  }
}
