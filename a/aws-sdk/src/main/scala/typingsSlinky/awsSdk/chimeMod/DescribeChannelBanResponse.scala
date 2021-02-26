package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelBanResponse extends StObject {
  
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
  implicit class DescribeChannelBanResponseMutableBuilder[Self <: DescribeChannelBanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelBan(value: ChannelBan): Self = StObject.set(x, "ChannelBan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelBanUndefined: Self = StObject.set(x, "ChannelBan", js.undefined)
  }
}
