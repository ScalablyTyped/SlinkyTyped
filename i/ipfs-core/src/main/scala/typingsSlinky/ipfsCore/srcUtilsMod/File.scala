package typingsSlinky.ipfsCore.srcUtilsMod

import typingsSlinky.ipfsCore.componentsLsMod.LSEntry
import typingsSlinky.ipfsCore.ipfsCoreStrings.file
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File
  extends typingsSlinky.ipfsCore.componentsGetMod.IPFSEntry
     with IPFSEntry
     with LSEntry {
  
  var cid: typingsSlinky.cids.mod.^ = js.native
  
  /**
    * - File content
    */
  var content: js.UndefOr[AsyncIterable[js.typedarray.Uint8Array]] = js.native
  
  var depth: Double = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var mtime: js.UndefOr[MTime_] = js.native
  
  var name: String = js.native
  
  /**
    * - File path
    */
  var path: String = js.native
  
  var size: Double = js.native
  
  var `type`: file = js.native
}
object File {
  
  @scala.inline
  def apply(
    cid: typingsSlinky.cids.mod.^,
    depth: Double,
    name: String,
    path: String,
    size: Double,
    `type`: file
  ): File = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: file): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
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
