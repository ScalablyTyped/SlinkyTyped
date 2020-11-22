package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteResource extends OnenoteEntityBaseModel {
  
  // The content stream
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  // The URL for downloading the content
  var contentUrl: js.UndefOr[NullableOption[String]] = js.native
}
object OnenoteResource {
  
  @scala.inline
  def apply(): OnenoteResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteResource]
  }
  
  @scala.inline
  implicit class OnenoteResourceOps[Self <: OnenoteResource] (val x: Self) extends AnyVal {
    
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
    def setContent(value: NullableOption[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setContentUrl(value: NullableOption[String]): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setContentUrlNull: Self = this.set("contentUrl", null)
  }
}
