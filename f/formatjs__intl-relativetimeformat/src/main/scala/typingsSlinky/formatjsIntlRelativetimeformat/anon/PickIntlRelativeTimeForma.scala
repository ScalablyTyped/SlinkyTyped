package typingsSlinky.formatjsIntlRelativetimeformat.anon

import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.`best fit`
import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.IntlRelativeTimeFormatOptions, 'localeMatcher'> */
@js.native
trait PickIntlRelativeTimeForma extends js.Object {
  
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}
object PickIntlRelativeTimeForma {
  
  @scala.inline
  def apply(): PickIntlRelativeTimeForma = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIntlRelativeTimeForma]
  }
  
  @scala.inline
  implicit class PickIntlRelativeTimeFormaOps[Self <: PickIntlRelativeTimeForma] (val x: Self) extends AnyVal {
    
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
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMatcher: Self = this.set("localeMatcher", js.undefined)
  }
}
