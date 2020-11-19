package typingsSlinky.pulumiAws.inputMod.gamelift

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasRoutingStrategy extends js.Object {
  
  /**
    * ID of the Gamelift Fleet to point the alias to.
    */
  var fleetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Message text to be used with the `TERMINAL` routing strategy.
    */
  var message: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type of routing strategy. e.g. `SIMPLE` or `TERMINAL`
    */
  var `type`: Input[String] = js.native
}
object AliasRoutingStrategy {
  
  @scala.inline
  def apply(`type`: Input[String]): AliasRoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasRoutingStrategy]
  }
  
  @scala.inline
  implicit class AliasRoutingStrategyOps[Self <: AliasRoutingStrategy] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetId(value: Input[String]): Self = this.set("fleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("fleetId", js.undefined)
    
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
