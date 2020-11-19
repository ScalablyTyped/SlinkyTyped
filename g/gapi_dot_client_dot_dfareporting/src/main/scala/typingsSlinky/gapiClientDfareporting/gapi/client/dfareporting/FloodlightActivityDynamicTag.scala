package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityDynamicTag extends js.Object {
  
  /** ID of this dynamic tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Name of this tag. */
  var name: js.UndefOr[String] = js.native
  
  /** Tag code. */
  var tag: js.UndefOr[String] = js.native
}
object FloodlightActivityDynamicTag {
  
  @scala.inline
  def apply(): FloodlightActivityDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityDynamicTag]
  }
  
  @scala.inline
  implicit class FloodlightActivityDynamicTagOps[Self <: FloodlightActivityDynamicTag] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
