package typingsSlinky.angularLoadingBar.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestShortcutConfig extends js.Object {
  
  /**
    * Indicates that the loading bar should be hidden.
    */
  var ignoreLoadingBar: js.UndefOr[Boolean] = js.native
}
object IRequestShortcutConfig {
  
  @scala.inline
  def apply(): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
  
  @scala.inline
  implicit class IRequestShortcutConfigOps[Self <: IRequestShortcutConfig] (val x: Self) extends AnyVal {
    
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
    def setIgnoreLoadingBar(value: Boolean): Self = this.set("ignoreLoadingBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreLoadingBar: Self = this.set("ignoreLoadingBar", js.undefined)
  }
}
