package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scte35SpliceInsert extends StObject {
  
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.native
  
  /**
    * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var NoRegionalBlackoutFlag: js.UndefOr[Scte35SpliceInsertNoRegionalBlackoutBehavior] = js.native
  
  /**
    * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var WebDeliveryAllowedFlag: js.UndefOr[Scte35SpliceInsertWebDeliveryAllowedBehavior] = js.native
}
object Scte35SpliceInsert {
  
  @scala.inline
  def apply(): Scte35SpliceInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte35SpliceInsert]
  }
  
  @scala.inline
  implicit class Scte35SpliceInsertMutableBuilder[Self <: Scte35SpliceInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = StObject.set(x, "AdAvailOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdAvailOffsetUndefined: Self = StObject.set(x, "AdAvailOffset", js.undefined)
    
    @scala.inline
    def setNoRegionalBlackoutFlag(value: Scte35SpliceInsertNoRegionalBlackoutBehavior): Self = StObject.set(x, "NoRegionalBlackoutFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRegionalBlackoutFlagUndefined: Self = StObject.set(x, "NoRegionalBlackoutFlag", js.undefined)
    
    @scala.inline
    def setWebDeliveryAllowedFlag(value: Scte35SpliceInsertWebDeliveryAllowedBehavior): Self = StObject.set(x, "WebDeliveryAllowedFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDeliveryAllowedFlagUndefined: Self = StObject.set(x, "WebDeliveryAllowedFlag", js.undefined)
  }
}
