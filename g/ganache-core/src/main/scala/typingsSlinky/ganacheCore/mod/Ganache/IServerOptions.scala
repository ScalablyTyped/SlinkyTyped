package typingsSlinky.ganacheCore.mod.Ganache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerOptions extends IProviderOptions {
  
  var keepAliveTimeout: js.UndefOr[Double] = js.native
}
object IServerOptions {
  
  @scala.inline
  def apply(): IServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerOptions]
  }
  
  @scala.inline
  implicit class IServerOptionsOps[Self <: IServerOptions] (val x: Self) extends AnyVal {
    
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
    def setKeepAliveTimeout(value: Double): Self = this.set("keepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveTimeout: Self = this.set("keepAliveTimeout", js.undefined)
  }
}
