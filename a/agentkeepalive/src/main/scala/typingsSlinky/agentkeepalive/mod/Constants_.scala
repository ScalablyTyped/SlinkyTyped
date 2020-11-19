package typingsSlinky.agentkeepalive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constants_ extends js.Object {
  
  var CREATE_HTTPS_CONNECTION: js.Symbol = js.native
  
  var CREATE_ID: js.Symbol = js.native
  
  var CURRENT_ID: js.Symbol = js.native
  
  var INIT_SOCKET: js.Symbol = js.native
  
  var SOCKET_CREATED_TIME: js.Symbol = js.native
  
  var SOCKET_NAME: js.Symbol = js.native
  
  var SOCKET_REQUEST_COUNT: js.Symbol = js.native
  
  var SOCKET_REQUEST_FINISHED_COUNT: js.Symbol = js.native
}
object Constants_ {
  
  @scala.inline
  def apply(
    CREATE_HTTPS_CONNECTION: js.Symbol,
    CREATE_ID: js.Symbol,
    CURRENT_ID: js.Symbol,
    INIT_SOCKET: js.Symbol,
    SOCKET_CREATED_TIME: js.Symbol,
    SOCKET_NAME: js.Symbol,
    SOCKET_REQUEST_COUNT: js.Symbol,
    SOCKET_REQUEST_FINISHED_COUNT: js.Symbol
  ): Constants_ = {
    val __obj = js.Dynamic.literal(CREATE_HTTPS_CONNECTION = CREATE_HTTPS_CONNECTION.asInstanceOf[js.Any], CREATE_ID = CREATE_ID.asInstanceOf[js.Any], CURRENT_ID = CURRENT_ID.asInstanceOf[js.Any], INIT_SOCKET = INIT_SOCKET.asInstanceOf[js.Any], SOCKET_CREATED_TIME = SOCKET_CREATED_TIME.asInstanceOf[js.Any], SOCKET_NAME = SOCKET_NAME.asInstanceOf[js.Any], SOCKET_REQUEST_COUNT = SOCKET_REQUEST_COUNT.asInstanceOf[js.Any], SOCKET_REQUEST_FINISHED_COUNT = SOCKET_REQUEST_FINISHED_COUNT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants_]
  }
  
  @scala.inline
  implicit class Constants_Ops[Self <: Constants_] (val x: Self) extends AnyVal {
    
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
    def setCREATE_HTTPS_CONNECTION(value: js.Symbol): Self = this.set("CREATE_HTTPS_CONNECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCREATE_ID(value: js.Symbol): Self = this.set("CREATE_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCURRENT_ID(value: js.Symbol): Self = this.set("CURRENT_ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINIT_SOCKET(value: js.Symbol): Self = this.set("INIT_SOCKET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_CREATED_TIME(value: js.Symbol): Self = this.set("SOCKET_CREATED_TIME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_NAME(value: js.Symbol): Self = this.set("SOCKET_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_REQUEST_COUNT(value: js.Symbol): Self = this.set("SOCKET_REQUEST_COUNT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOCKET_REQUEST_FINISHED_COUNT(value: js.Symbol): Self = this.set("SOCKET_REQUEST_FINISHED_COUNT", value.asInstanceOf[js.Any])
  }
}
