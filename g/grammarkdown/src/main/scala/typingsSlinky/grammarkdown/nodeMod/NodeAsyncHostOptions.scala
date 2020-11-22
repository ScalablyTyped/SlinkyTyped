package typingsSlinky.grammarkdown.nodeMod

import typingsSlinky.grammarkdown.grammarkdownBooleans.`false`
import typingsSlinky.grammarkdown.hostMod.HostBaseOptions
import typingsSlinky.grammarkdown.hostMod.LegacyReadFileCallback
import typingsSlinky.grammarkdown.hostMod.LegacyWriteFileCallback
import typingsSlinky.grammarkdown.hostMod.ReadFileCallback
import typingsSlinky.grammarkdown.hostMod.WriteFileCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAsyncHostOptions extends HostBaseOptions {
  
  var allowUris: js.UndefOr[`false`] = js.native
  
  var readFile: js.UndefOr[ReadFileCallback | LegacyReadFileCallback | `false`] = js.native
  
  var writeFile: js.UndefOr[WriteFileCallback | LegacyWriteFileCallback | `false`] = js.native
}
object NodeAsyncHostOptions {
  
  @scala.inline
  def apply(): NodeAsyncHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeAsyncHostOptions]
  }
  
  @scala.inline
  implicit class NodeAsyncHostOptionsOps[Self <: NodeAsyncHostOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUris(value: `false`): Self = this.set("allowUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUris: Self = this.set("allowUris", js.undefined)
    
    @scala.inline
    def setReadFile(value: ReadFileCallback | LegacyReadFileCallback | `false`): Self = this.set("readFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setWriteFile(value: WriteFileCallback | LegacyWriteFileCallback | `false`): Self = this.set("writeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
  }
}
