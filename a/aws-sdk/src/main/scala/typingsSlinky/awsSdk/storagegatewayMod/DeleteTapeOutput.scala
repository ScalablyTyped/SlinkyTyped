package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapeOutput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted virtual tape.
    */
  var TapeARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object DeleteTapeOutput {
  
  @scala.inline
  def apply(): DeleteTapeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapeOutput]
  }
  
  @scala.inline
  implicit class DeleteTapeOutputOps[Self <: DeleteTapeOutput] (val x: Self) extends AnyVal {
    
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
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapeARN: Self = this.set("TapeARN", js.undefined)
  }
}
