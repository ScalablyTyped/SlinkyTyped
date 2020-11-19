package typingsSlinky.languageTags.tagMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This class isn’t exposed. It’s an error instance that has additional properties.
@js.native
trait LanguageTagsError extends Error {
  
  var code: ErrorCode = js.native
  
  var subtag: typingsSlinky.languageTags.subtagMod.^ = js.native
  
  var tag: Tag = js.native
}
object LanguageTagsError {
  
  @scala.inline
  def apply(
    code: ErrorCode,
    message: String,
    name: String,
    subtag: typingsSlinky.languageTags.subtagMod.^,
    tag: Tag
  ): LanguageTagsError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtag = subtag.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageTagsError]
  }
  
  @scala.inline
  implicit class LanguageTagsErrorOps[Self <: LanguageTagsError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: ErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtag(value: typingsSlinky.languageTags.subtagMod.^): Self = this.set("subtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
}
