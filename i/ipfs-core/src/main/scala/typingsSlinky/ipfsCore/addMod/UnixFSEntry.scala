package typingsSlinky.ipfsCore.addMod

import typingsSlinky.ipfsCore.srcUtilsMod.MTime_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixFSEntry extends js.Object {
  
  var cid: typingsSlinky.cids.mod.^ = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var mtime: js.UndefOr[MTime_] = js.native
  
  var path: String = js.native
  
  var size: Double = js.native
}
object UnixFSEntry {
  
  @scala.inline
  def apply(cid: typingsSlinky.cids.mod.^, path: String, size: Double): UnixFSEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixFSEntry]
  }
  
  @scala.inline
  implicit class UnixFSEntryOps[Self <: UnixFSEntry] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setMtime(value: MTime_): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtime: Self = this.set("mtime", js.undefined)
  }
}
