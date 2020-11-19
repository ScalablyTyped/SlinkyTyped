package typingsSlinky.expoConfigureSplashScreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertContent extends js.Object {
  
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
  implicit class InsertContentOps[Self <: InsertContent] (val x: Self) extends AnyVal {
    
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
    def setInsertContent(value: String): Self = this.set("insertContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPatternRegExp(value: js.RegExp): Self = this.set("insertPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPattern(value: js.RegExp | String): Self = this.set("insertPattern", value.asInstanceOf[js.Any])
  }
}
