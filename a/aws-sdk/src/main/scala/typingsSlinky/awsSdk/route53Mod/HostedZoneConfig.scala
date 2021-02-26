package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedZoneConfig extends StObject {
  
  /**
    * Any comments that you want to include about the hosted zone.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * A value that indicates whether this is a private hosted zone.
    */
  var PrivateZone: js.UndefOr[IsPrivateZone] = js.native
}
object HostedZoneConfig {
  
  @scala.inline
  def apply(): HostedZoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedZoneConfig]
  }
  
  @scala.inline
  implicit class HostedZoneConfigMutableBuilder[Self <: HostedZoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: ResourceDescription): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setPrivateZone(value: IsPrivateZone): Self = StObject.set(x, "PrivateZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateZoneUndefined: Self = StObject.set(x, "PrivateZone", js.undefined)
  }
}
