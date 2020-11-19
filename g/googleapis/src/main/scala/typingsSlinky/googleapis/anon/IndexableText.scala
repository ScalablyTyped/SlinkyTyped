package typingsSlinky.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexableText extends js.Object {
  
  var indexableText: js.UndefOr[String] = js.native
  
  var thumbnail: js.UndefOr[MimeType] = js.native
}
object IndexableText {
  
  @scala.inline
  def apply(): IndexableText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexableText]
  }
  
  @scala.inline
  implicit class IndexableTextOps[Self <: IndexableText] (val x: Self) extends AnyVal {
    
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
    def setIndexableText(value: String): Self = this.set("indexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexableText: Self = this.set("indexableText", js.undefined)
    
    @scala.inline
    def setThumbnail(value: MimeType): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
}
