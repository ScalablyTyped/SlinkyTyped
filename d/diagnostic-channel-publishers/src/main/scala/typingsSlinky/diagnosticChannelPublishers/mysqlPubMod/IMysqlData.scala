package typingsSlinky.diagnosticChannelPublishers.mysqlPubMod

import typingsSlinky.diagnosticChannelPublishers.anon.Connection
import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMysqlData extends js.Object {
  
  var callbackArgs: IArguments = js.native
  
  var duration: Double = js.native
  
  var err: js.Error = js.native
  
  var query: Connection = js.native
  
  var time: js.Date = js.native
}
object IMysqlData {
  
  @scala.inline
  def apply(callbackArgs: IArguments, duration: Double, err: js.Error, query: Connection, time: js.Date): IMysqlData = {
    val __obj = js.Dynamic.literal(callbackArgs = callbackArgs.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMysqlData]
  }
  
  @scala.inline
  implicit class IMysqlDataOps[Self <: IMysqlData] (val x: Self) extends AnyVal {
    
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
    def setCallbackArgs(value: IArguments): Self = this.set("callbackArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: js.Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Connection): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: js.Date): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
