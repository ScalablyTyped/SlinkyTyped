package typingsSlinky.analyticsNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integrations extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var integrations: js.UndefOr[typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
  
  var timestamp: js.UndefOr[js.Date] = js.native
  
  var traits: js.UndefOr[js.Any] = js.native
}
object Integrations {
  
  @scala.inline
  def apply(): Integrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrations]
  }
  
  @scala.inline
  implicit class IntegrationsOps[Self <: Integrations] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIntegrations(value: typingsSlinky.analyticsNode.mod.AnalyticsNode.Integrations): Self = this.set("integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrations: Self = this.set("integrations", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTraits(value: js.Any): Self = this.set("traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
  }
}
