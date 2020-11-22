package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestItem extends js.Object {
  
  var gaia: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var snippet: js.UndefOr[js.Any] = js.native
}
object TestItem {
  
  @scala.inline
  def apply(): TestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestItem]
  }
  
  @scala.inline
  implicit class TestItemOps[Self <: TestItem] (val x: Self) extends AnyVal {
    
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
    def setGaia(value: String): Self = this.set("gaia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaia: Self = this.set("gaia", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSnippet(value: js.Any): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
}
