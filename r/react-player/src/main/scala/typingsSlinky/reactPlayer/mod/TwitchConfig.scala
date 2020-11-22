package typingsSlinky.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwitchConfig extends js.Object {
  
  var options: js.UndefOr[js.Object] = js.native
  
  var playerId: js.UndefOr[String] = js.native
}
object TwitchConfig {
  
  @scala.inline
  def apply(): TwitchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwitchConfig]
  }
  
  @scala.inline
  implicit class TwitchConfigOps[Self <: TwitchConfig] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = this.set("playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerId: Self = this.set("playerId", js.undefined)
  }
}
