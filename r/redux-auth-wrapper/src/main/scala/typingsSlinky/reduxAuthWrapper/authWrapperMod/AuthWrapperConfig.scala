package typingsSlinky.reduxAuthWrapper.authWrapperMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ReactType
import typingsSlinky.reduxAuthWrapper.mod.AuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthWrapperConfig extends AuthConfig {
  
  var FailureComponent: js.UndefOr[ReactType[_]] = js.native
}
object AuthWrapperConfig {
  
  @scala.inline
  def apply(): AuthWrapperConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthWrapperConfig]
  }
  
  @scala.inline
  implicit class AuthWrapperConfigOps[Self <: AuthWrapperConfig] (val x: Self) extends AnyVal {
    
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
    def setFailureComponentFunctionComponent(value: ReactComponentClass[_]): Self = this.set("FailureComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureComponentComponentClass(value: ReactComponentClass[_]): Self = this.set("FailureComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureComponent(value: ReactType[_]): Self = this.set("FailureComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureComponent: Self = this.set("FailureComponent", js.undefined)
  }
}
