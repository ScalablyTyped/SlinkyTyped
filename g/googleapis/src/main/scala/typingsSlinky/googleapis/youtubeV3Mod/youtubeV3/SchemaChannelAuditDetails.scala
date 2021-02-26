package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The auditDetails object encapsulates channel data that is relevant for
  * YouTube Partners during the audit process.
  */
@js.native
trait SchemaChannelAuditDetails extends StObject {
  
  /**
    * Whether or not the channel respects the community guidelines.
    */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the channel has any unresolved claims.
    */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the channel has any copyright strikes.
    */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
}
object SchemaChannelAuditDetails {
  
  @scala.inline
  def apply(): SchemaChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelAuditDetails]
  }
  
  @scala.inline
  implicit class SchemaChannelAuditDetailsMutableBuilder[Self <: SchemaChannelAuditDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommunityGuidelinesGoodStanding(value: Boolean): Self = StObject.set(x, "communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunityGuidelinesGoodStandingUndefined: Self = StObject.set(x, "communityGuidelinesGoodStanding", js.undefined)
    
    @scala.inline
    def setContentIdClaimsGoodStanding(value: Boolean): Self = StObject.set(x, "contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdClaimsGoodStandingUndefined: Self = StObject.set(x, "contentIdClaimsGoodStanding", js.undefined)
    
    @scala.inline
    def setCopyrightStrikesGoodStanding(value: Boolean): Self = StObject.set(x, "copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightStrikesGoodStandingUndefined: Self = StObject.set(x, "copyrightStrikesGoodStanding", js.undefined)
  }
}
