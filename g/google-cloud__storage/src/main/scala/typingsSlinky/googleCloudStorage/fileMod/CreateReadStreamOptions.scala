package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`false`
import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`true`
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.crc32c
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.md5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReadStreamOptions extends js.Object {
  
  var decompress: js.UndefOr[Boolean] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var userProject: js.UndefOr[String] = js.native
  
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.native
}
object CreateReadStreamOptions {
  
  @scala.inline
  def apply(): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
  
  @scala.inline
  implicit class CreateReadStreamOptionsOps[Self <: CreateReadStreamOptions] (val x: Self) extends AnyVal {
    
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
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecompress: Self = this.set("decompress", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
    
    @scala.inline
    def setValidation(value: md5 | crc32c | `false` | `true`): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
}
