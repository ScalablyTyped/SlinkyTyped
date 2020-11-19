package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalProvider extends IServiceProvider {
  
  /**
    * Default options all modals will use.
    */
  var options: IModalSettings = js.native
}
object IModalProvider {
  
  @scala.inline
  def apply($get: js.Any, options: IModalSettings): IModalProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalProvider]
  }
  
  @scala.inline
  implicit class IModalProviderOps[Self <: IModalProvider] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: IModalSettings): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
