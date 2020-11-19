package typingsSlinky.node.anon

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.fsMod.OpenMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  flag :node.fs.OpenMode | undefined} */
@js.native
trait BaseEncodingOptionsflagOp extends js.Object {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  
  var flag: js.UndefOr[OpenMode] = js.native
}
object BaseEncodingOptionsflagOp {
  
  @scala.inline
  def apply(): BaseEncodingOptionsflagOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionsflagOp]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionsflagOpOps[Self <: BaseEncodingOptionsflagOp] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    
    @scala.inline
    def setFlag(value: OpenMode): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
  }
}
