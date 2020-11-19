package typingsSlinky.etag.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsLike extends js.Object {
  
  var ctime: js.Date = js.native
  
  var ino: Double = js.native
  
  var mtime: js.Date = js.native
  
  var size: Double = js.native
}
object StatsLike {
  
  @scala.inline
  def apply(ctime: js.Date, ino: Double, mtime: js.Date, size: Double): StatsLike = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsLike]
  }
  
  @scala.inline
  implicit class StatsLikeOps[Self <: StatsLike] (val x: Self) extends AnyVal {
    
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
    def setCtime(value: js.Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIno(value: Double): Self = this.set("ino", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: js.Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
