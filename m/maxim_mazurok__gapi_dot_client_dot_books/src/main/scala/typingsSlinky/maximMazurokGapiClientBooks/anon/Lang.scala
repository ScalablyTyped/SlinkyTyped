package typingsSlinky.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lang extends js.Object {
  
  /** The language of the information url and description. */
  var lang: js.UndefOr[String] = js.native
  
  /** The URL for the preview image information. */
  var previewImageUrl: js.UndefOr[String] = js.native
  
  /** The description for this location. */
  var snippet: js.UndefOr[String] = js.native
  
  /** The URL for information for this location. Ex: wikipedia link. */
  var snippetUrl: js.UndefOr[String] = js.native
  
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[String] = js.native
}
object Lang {
  
  @scala.inline
  def apply(): Lang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lang]
  }
  
  @scala.inline
  implicit class LangOps[Self <: Lang] (val x: Self) extends AnyVal {
    
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setPreviewImageUrl(value: String): Self = this.set("previewImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewImageUrl: Self = this.set("previewImageUrl", js.undefined)
    
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setSnippetUrl(value: String): Self = this.set("snippetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippetUrl: Self = this.set("snippetUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
