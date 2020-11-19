package typingsSlinky.graphqlUpload.mod

import typingsSlinky.fsCapacitor.mod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUpload extends js.Object {
  
  def createReadStream(): ReadStream = js.native
  
  var encoding: String = js.native
  
  var filename: String = js.native
  
  var mimetype: String = js.native
}
object FileUpload {
  
  @scala.inline
  def apply(createReadStream: () => ReadStream, encoding: String, filename: String, mimetype: String): FileUpload = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpload]
  }
  
  @scala.inline
  implicit class FileUploadOps[Self <: FileUpload] (val x: Self) extends AnyVal {
    
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
    def setCreateReadStream(value: () => ReadStream): Self = this.set("createReadStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
  }
}
