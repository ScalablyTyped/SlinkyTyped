package typingsSlinky.instagramPrivateApi.tagRepositorySectionResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagRepositorySectionResponseRootObject extends js.Object {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var next_media_ids: js.Array[String] = js.native
  
  var next_page: Double = js.native
  
  var sections: js.Array[TagRepositorySectionResponsesectionsItem] = js.native
  
  var status: String = js.native
}
object TagRepositorySectionResponseRootObject {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    more_available: Boolean,
    next_max_id: String,
    next_media_ids: js.Array[String],
    next_page: Double,
    sections: js.Array[TagRepositorySectionResponsesectionsItem],
    status: String
  ): TagRepositorySectionResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], next_media_ids = next_media_ids.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySectionResponseRootObject]
  }
  
  @scala.inline
  implicit class TagRepositorySectionResponseRootObjectOps[Self <: TagRepositorySectionResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAuto_load_more_enabled(value: Boolean): Self = this.set("auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = this.set("more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_media_idsVarargs(value: String*): Self = this.set("next_media_ids", js.Array(value :_*))
    
    @scala.inline
    def setNext_media_ids(value: js.Array[String]): Self = this.set("next_media_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_page(value: Double): Self = this.set("next_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: TagRepositorySectionResponsesectionsItem*): Self = this.set("sections", js.Array(value :_*))
    
    @scala.inline
    def setSections(value: js.Array[TagRepositorySectionResponsesectionsItem]): Self = this.set("sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
