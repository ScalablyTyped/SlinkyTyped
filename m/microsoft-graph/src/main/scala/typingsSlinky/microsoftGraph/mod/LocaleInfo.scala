package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleInfo extends js.Object {
  
  // A name representing the user's locale in natural language, for example, 'English (United States)'.
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * A locale representation for the user, which includes the user's preferred language and country/region. For example,
    * 'en-us'. The language component follows 2-letter codes as defined in ISO 639-1, and the country component follows
    * 2-letter codes as defined in ISO 3166-1 alpha-2.
    */
  var locale: js.UndefOr[String] = js.native
}
object LocaleInfo {
  
  @scala.inline
  def apply(): LocaleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleInfo]
  }
  
  @scala.inline
  implicit class LocaleInfoOps[Self <: LocaleInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
