package typingsSlinky.kurentoClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseDataChannels extends js.Object {
  
  var useDataChannels: js.UndefOr[Boolean] = js.native
}
object UseDataChannels {
  
  @scala.inline
  def apply(): UseDataChannels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDataChannels]
  }
  
  @scala.inline
  implicit class UseDataChannelsOps[Self <: UseDataChannels] (val x: Self) extends AnyVal {
    
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
    def setUseDataChannels(value: Boolean): Self = this.set("useDataChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDataChannels: Self = this.set("useDataChannels", js.undefined)
  }
}
