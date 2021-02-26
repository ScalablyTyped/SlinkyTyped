package typingsSlinky.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics Remarketing Include Conditions.
  */
@js.native
trait SchemaIncludeConditions extends StObject {
  
  /**
    * The look-back window lets you specify a time frame for evaluating the
    * behavior that qualifies users for your audience. For example, if your
    * filters include users from Central Asia, and Transactions Greater than 2,
    * and you set the look-back window to 14 days, then any user from Central
    * Asia whose cumulative transactions exceed 2 during the last 14 days is
    * added to the audience.
    */
  var daysToLookBack: js.UndefOr[Double] = js.native
  
  /**
    * Boolean indicating whether this segment is a smart list.
    * https://support.google.com/analytics/answer/4628577
    */
  var isSmartList: js.UndefOr[Boolean] = js.native
  
  /**
    * Resource type for include conditions.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Number of days (in the range 1 to 540) a user remains in the audience.
    */
  var membershipDurationDays: js.UndefOr[Double] = js.native
  
  /**
    * The segment condition that will cause a user to be added to an audience.
    */
  var segment: js.UndefOr[String] = js.native
}
object SchemaIncludeConditions {
  
  @scala.inline
  def apply(): SchemaIncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIncludeConditions]
  }
  
  @scala.inline
  implicit class SchemaIncludeConditionsMutableBuilder[Self <: SchemaIncludeConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysToLookBack(value: Double): Self = StObject.set(x, "daysToLookBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToLookBackUndefined: Self = StObject.set(x, "daysToLookBack", js.undefined)
    
    @scala.inline
    def setIsSmartList(value: Boolean): Self = StObject.set(x, "isSmartList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSmartListUndefined: Self = StObject.set(x, "isSmartList", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMembershipDurationDays(value: Double): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
