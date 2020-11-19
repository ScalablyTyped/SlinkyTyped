package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentVersionResponse extends js.Object {
  
  /**
    * The custom metadata on the document version.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  
  /**
    * The version metadata.
    */
  var Metadata: js.UndefOr[DocumentVersionMetadata] = js.native
}
object GetDocumentVersionResponse {
  
  @scala.inline
  def apply(): GetDocumentVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentVersionResponse]
  }
  
  @scala.inline
  implicit class GetDocumentVersionResponseOps[Self <: GetDocumentVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomMetadata(value: CustomMetadataMap): Self = this.set("CustomMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMetadata: Self = this.set("CustomMetadata", js.undefined)
    
    @scala.inline
    def setMetadata(value: DocumentVersionMetadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
  }
}
