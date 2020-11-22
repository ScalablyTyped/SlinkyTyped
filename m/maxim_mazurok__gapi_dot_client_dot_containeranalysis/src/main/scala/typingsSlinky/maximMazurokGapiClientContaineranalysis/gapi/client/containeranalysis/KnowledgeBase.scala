package typingsSlinky.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnowledgeBase extends js.Object {
  
  /** The KB name (generally of the form KB[0-9]+ i.e. KB123456). */
  var name: js.UndefOr[String] = js.native
  
  /** A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/ */
  var url: js.UndefOr[String] = js.native
}
object KnowledgeBase {
  
  @scala.inline
  def apply(): KnowledgeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeBase]
  }
  
  @scala.inline
  implicit class KnowledgeBaseOps[Self <: KnowledgeBase] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
