package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelBanResponse extends js.Object {
  
  /**
    * The the details of the ban.
    */
  var ChannelBan: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ChannelBan] = js.native
}
object DescribeChannelBanResponse {
  
  @scala.inline
  def apply(): DescribeChannelBanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelBanResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelBanResponseOps[Self <: DescribeChannelBanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelBan(value: ChannelBan): Self = this.set("ChannelBan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelBan: Self = this.set("ChannelBan", js.undefined)
  }
}
