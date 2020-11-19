package typingsSlinky.diagnosticChannelPublishers.tediousPubMod

import typingsSlinky.diagnosticChannelPublishers.anon.Plan
import typingsSlinky.diagnosticChannelPublishers.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITediousData extends js.Object {
  
  var database: Port = js.native
  
  var duration: Double = js.native
  
  var error: js.UndefOr[js.Error] = js.native
  
  var query: Plan = js.native
  
  var result: js.UndefOr[ITediousResult] = js.native
}
object ITediousData {
  
  @scala.inline
  def apply(database: Port, duration: Double, query: Plan): ITediousData = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITediousData]
  }
  
  @scala.inline
  implicit class ITediousDataOps[Self <: ITediousData] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: Port): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Plan): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setResult(value: ITediousResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
