package typingsSlinky.ipfsCore.rmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmFailure extends RmResult {
  
  var cid: typingsSlinky.cids.mod.^ = js.native
  
  var error: js.Error = js.native
}
object RmFailure {
  
  @scala.inline
  def apply(cid: typingsSlinky.cids.mod.^, error: js.Error): RmFailure = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmFailure]
  }
  
  @scala.inline
  implicit class RmFailureOps[Self <: RmFailure] (val x: Self) extends AnyVal {
    
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
    def setCid(value: typingsSlinky.cids.mod.^): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
