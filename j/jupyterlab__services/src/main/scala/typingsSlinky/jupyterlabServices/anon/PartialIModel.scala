package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.contentsMod.Contents.ContentType
import typingsSlinky.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel> */
@js.native
trait PartialIModel extends js.Object {
  
  var chunk: js.UndefOr[Double] = js.native
  
  var content: js.UndefOr[js.Any] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[FileFormat] = js.native
  
  var last_modified: js.UndefOr[String] = js.native
  
  var mimetype: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[ContentType] = js.native
  
  var writable: js.UndefOr[Boolean] = js.native
}
object PartialIModel {
  
  @scala.inline
  def apply(): PartialIModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIModel]
  }
  
  @scala.inline
  implicit class PartialIModelOps[Self <: PartialIModel] (val x: Self) extends AnyVal {
    
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
    def setChunk(value: Double): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setFormat(value: FileFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLast_modified(value: String): Self = this.set("last_modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_modified: Self = this.set("last_modified", js.undefined)
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimetype: Self = this.set("mimetype", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
}
