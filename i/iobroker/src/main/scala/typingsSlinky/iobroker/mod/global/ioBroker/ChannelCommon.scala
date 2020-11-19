package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelCommon extends ObjectCommon {
  
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  /** description of this channel */
  var desc: js.UndefOr[String] = js.native
}
object ChannelCommon {
  
  @scala.inline
  def apply(name: String): ChannelCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCommon]
  }
  
  @scala.inline
  implicit class ChannelCommonOps[Self <: ChannelCommon] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
  }
}
