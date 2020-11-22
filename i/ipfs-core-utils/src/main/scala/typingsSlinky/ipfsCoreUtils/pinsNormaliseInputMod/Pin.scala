package typingsSlinky.ipfsCoreUtils.pinsNormaliseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pin extends js.Object {
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var path: String | typingsSlinky.cids.mod.^  = js.native
  
  var recursive: Boolean = js.native
}
object Pin {
  
  @scala.inline
  def apply(path: String | typingsSlinky.cids.mod.^ , recursive: Boolean): Pin = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pin]
  }
  
  @scala.inline
  implicit class PinOps[Self <: Pin] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String | typingsSlinky.cids.mod.^ ): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
