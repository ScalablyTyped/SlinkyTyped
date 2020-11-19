package typingsSlinky.hostValidation.mod

import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.hostValidation.hostValidationStrings.both
import typingsSlinky.hostValidation.hostValidationStrings.either
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait config extends js.Object {
  
  var fail: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response_[_], 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.native
  
  var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  
  var mode: js.UndefOr[both | either] = js.native
  
  var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.native
}
object config {
  
  @scala.inline
  def apply(): config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config]
  }
  
  @scala.inline
  implicit class configOps[Self <: config] (val x: Self) extends AnyVal {
    
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
    def setFail(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], /* next */ NextFunction) => Unit
    ): Self = this.set("fail", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: (String | js.RegExp)*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[String | js.RegExp]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosts: Self = this.set("hosts", js.undefined)
    
    @scala.inline
    def setMode(value: both | either): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setReferersVarargs(value: (String | js.RegExp)*): Self = this.set("referers", js.Array(value :_*))
    
    @scala.inline
    def setReferers(value: js.Array[String | js.RegExp]): Self = this.set("referers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferers: Self = this.set("referers", js.undefined)
  }
}
