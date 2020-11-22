package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentResponsiveHtmlPreview extends js.Object {
  
  /**
    * Holds the properties that define how to generate the responsive-formatted HTML for the document.
    */
  var htmlDefinitions: js.UndefOr[js.Array[String]] = js.native
}
object DocumentResponsiveHtmlPreview {
  
  @scala.inline
  def apply(): DocumentResponsiveHtmlPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentResponsiveHtmlPreview]
  }
  
  @scala.inline
  implicit class DocumentResponsiveHtmlPreviewOps[Self <: DocumentResponsiveHtmlPreview] (val x: Self) extends AnyVal {
    
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
    def setHtmlDefinitionsVarargs(value: String*): Self = this.set("htmlDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setHtmlDefinitions(value: js.Array[String]): Self = this.set("htmlDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlDefinitions: Self = this.set("htmlDefinitions", js.undefined)
  }
}
