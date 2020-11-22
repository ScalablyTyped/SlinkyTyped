package typingsSlinky.playable.bottomBlockMod

import typingsSlinky.playable.playableStrings.left
import typingsSlinky.playable.playableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddControllOptions extends js.Object {
  
  var position: js.UndefOr[left | right] = js.native
}
object IAddControllOptions {
  
  @scala.inline
  def apply(): IAddControllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddControllOptions]
  }
  
  @scala.inline
  implicit class IAddControllOptionsOps[Self <: IAddControllOptions] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
