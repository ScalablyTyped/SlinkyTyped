package typingsSlinky.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceContent extends js.Object {
  
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
  implicit class ReplaceContentOps[Self <: ReplaceContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplaceContent(value: String): Self = this.set("replaceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacePatternRegExp(value: js.RegExp): Self = this.set("replacePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacePattern(value: String | js.RegExp): Self = this.set("replacePattern", value.asInstanceOf[js.Any])
  }
}
