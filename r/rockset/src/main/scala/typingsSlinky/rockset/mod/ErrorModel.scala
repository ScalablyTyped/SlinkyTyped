package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.ALREADYEXISTS
import typingsSlinky.rockset.rocksetStrings.AUTHEXCEPTION
import typingsSlinky.rockset.rocksetStrings.CONNECTION_ERROR
import typingsSlinky.rockset.rocksetStrings.DEPENDENTRESOURCES
import typingsSlinky.rockset.rocksetStrings.FORBIDDEN
import typingsSlinky.rockset.rocksetStrings.INTEGRATION_NOT_FOUND
import typingsSlinky.rockset.rocksetStrings.INTERNALERROR
import typingsSlinky.rockset.rocksetStrings.INVALIDINPUT
import typingsSlinky.rockset.rocksetStrings.NOTFOUND
import typingsSlinky.rockset.rocksetStrings.NOTIMPLEMENTEDYET
import typingsSlinky.rockset.rocksetStrings.NOT_READY
import typingsSlinky.rockset.rocksetStrings.QUERY_ERROR
import typingsSlinky.rockset.rocksetStrings.QUERY_TIMEOUT
import typingsSlinky.rockset.rocksetStrings.RESOURCEEXCEEDED
import typingsSlinky.rockset.rocksetStrings.ROLE_NOT_FOUND
import typingsSlinky.rockset.rocksetStrings.VERSIONEXCEPTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorModel extends js.Object {
  
  // Column where the error happened (if applicable)
  var column: js.UndefOr[Double] = js.native
  
  // Line where the error happened (if applicable)
  var line: js.UndefOr[Double] = js.native
  
  // descriptive message about the error
  var message: js.UndefOr[String] = js.native
  
  // Internal trace ID to help with debugging
  var trace_id: js.UndefOr[String] = js.native
  
  // category of the error
  var `type`: js.UndefOr[
    AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
  ] = js.native
}
object ErrorModel {
  
  @scala.inline
  def apply(): ErrorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorModel]
  }
  
  @scala.inline
  implicit class ErrorModelOps[Self <: ErrorModel] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setTrace_id(value: String): Self = this.set("trace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace_id: Self = this.set("trace_id", js.undefined)
    
    @scala.inline
    def setType(
      value: AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
