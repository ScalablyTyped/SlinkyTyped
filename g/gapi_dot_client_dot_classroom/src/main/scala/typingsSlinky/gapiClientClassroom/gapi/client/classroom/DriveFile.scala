package typingsSlinky.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveFile extends js.Object {
  
  /**
    * URL that can be used to access the Drive item.
    *
    * Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  
  /** Drive API resource ID. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * URL of a thumbnail image of the Drive item.
    *
    * Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  
  /**
    * Title of the Drive item.
    *
    * Read-only.
    */
  var title: js.UndefOr[String] = js.native
}
object DriveFile {
  
  @scala.inline
  def apply(): DriveFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveFile]
  }
  
  @scala.inline
  implicit class DriveFileOps[Self <: DriveFile] (val x: Self) extends AnyVal {
    
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
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
