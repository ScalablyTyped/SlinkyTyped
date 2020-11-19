package typingsSlinky.flowdoc.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileAsset extends js.Object {
  
  var dirPath: String = js.native
  
  var fileName: String = js.native
}
object FileAsset {
  
  @scala.inline
  def apply(dirPath: String, fileName: String): FileAsset = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAsset]
  }
  
  @scala.inline
  implicit class FileAssetOps[Self <: FileAsset] (val x: Self) extends AnyVal {
    
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
    def setDirPath(value: String): Self = this.set("dirPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
  }
}
