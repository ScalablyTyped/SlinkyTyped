package typingsSlinky.awsSdkTypes.eventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Int64 extends js.Object {
  
  val bytes: js.typedarray.Uint8Array = js.native
}
object Int64 {
  
  @scala.inline
  def apply(bytes: js.typedarray.Uint8Array): Int64 = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int64]
  }
  
  @scala.inline
  implicit class Int64Ops[Self <: Int64] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: js.typedarray.Uint8Array): Self = this.set("bytes", value.asInstanceOf[js.Any])
  }
}
