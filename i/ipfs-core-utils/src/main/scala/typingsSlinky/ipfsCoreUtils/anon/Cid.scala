package typingsSlinky.ipfsCoreUtils.anon

import typingsSlinky.cids.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cid extends js.Object {
  
  var cid: ^ = js.native
  
  var path: js.UndefOr[String] = js.native
}
object Cid {
  
  @scala.inline
  def apply(cid: ^): Cid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  
  @scala.inline
  implicit class CidOps[Self <: Cid] (val x: Self) extends AnyVal {
    
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
    def setCid(value: ^): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
