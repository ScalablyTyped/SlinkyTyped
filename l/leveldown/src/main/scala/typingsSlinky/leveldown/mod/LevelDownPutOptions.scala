package typingsSlinky.leveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDownPutOptions extends js.Object {
  
  var sync: js.UndefOr[Boolean] = js.native
}
object LevelDownPutOptions {
  
  @scala.inline
  def apply(): LevelDownPutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownPutOptions]
  }
  
  @scala.inline
  implicit class LevelDownPutOptionsOps[Self <: LevelDownPutOptions] (val x: Self) extends AnyVal {
    
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
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
