package typingsSlinky.fastGlob.patternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternTypeOptions extends js.Object {
  
  var braceExpansion: js.UndefOr[Boolean] = js.native
  
  var caseSensitiveMatch: js.UndefOr[Boolean] = js.native
  
  var extglob: js.UndefOr[Boolean] = js.native
}
object PatternTypeOptions {
  
  @scala.inline
  def apply(): PatternTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternTypeOptions]
  }
  
  @scala.inline
  implicit class PatternTypeOptionsOps[Self <: PatternTypeOptions] (val x: Self) extends AnyVal {
    
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
    def setBraceExpansion(value: Boolean): Self = this.set("braceExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBraceExpansion: Self = this.set("braceExpansion", js.undefined)
    
    @scala.inline
    def setCaseSensitiveMatch(value: Boolean): Self = this.set("caseSensitiveMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitiveMatch: Self = this.set("caseSensitiveMatch", js.undefined)
    
    @scala.inline
    def setExtglob(value: Boolean): Self = this.set("extglob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtglob: Self = this.set("extglob", js.undefined)
  }
}
