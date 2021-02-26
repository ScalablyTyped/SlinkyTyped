package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.anon.ComparisonValue
import typingsSlinky.googleapis.anon.EventConditions
import typingsSlinky.googleapis.anon.FirstStepRequired
import typingsSlinky.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics goal resource.
  */
@js.native
trait SchemaGoal extends StObject {
  
  /**
    * Account ID to which this goal belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Determines whether this goal is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Time this goal was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Details for the goal of the type EVENT.
    */
  var eventDetails: js.UndefOr[EventConditions] = js.native
  
  /**
    * Goal ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for the web property to which this goal belongs.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Resource type for an Analytics goal.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Goal name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for a goal. Points to the view (profile) to which this goal
    * belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * View (Profile) ID to which this goal belongs.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Link for this goal.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE,
    * VISIT_NUM_PAGES, AND EVENT.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Time this goal was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Details for the goal of the type URL_DESTINATION.
    */
  var urlDestinationDetails: js.UndefOr[FirstStepRequired] = js.native
  
  /**
    * Goal value.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Details for the goal of the type VISIT_NUM_PAGES.
    */
  var visitNumPagesDetails: js.UndefOr[ComparisonValue] = js.native
  
  /**
    * Details for the goal of the type VISIT_TIME_ON_SITE.
    */
  var visitTimeOnSiteDetails: js.UndefOr[ComparisonValue] = js.native
  
  /**
    * Web property ID to which this goal belongs. The web property ID is of the
    * form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaGoal {
  
  @scala.inline
  def apply(): SchemaGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoal]
  }
  
  @scala.inline
  implicit class SchemaGoalMutableBuilder[Self <: SchemaGoal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setEventDetails(value: EventConditions): Self = StObject.set(x, "eventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDetailsUndefined: Self = StObject.set(x, "eventDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = StObject.set(x, "internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalWebPropertyIdUndefined: Self = StObject.set(x, "internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUrlDestinationDetails(value: FirstStepRequired): Self = StObject.set(x, "urlDestinationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDestinationDetailsUndefined: Self = StObject.set(x, "urlDestinationDetails", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisitNumPagesDetails(value: ComparisonValue): Self = StObject.set(x, "visitNumPagesDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitNumPagesDetailsUndefined: Self = StObject.set(x, "visitNumPagesDetails", js.undefined)
    
    @scala.inline
    def setVisitTimeOnSiteDetails(value: ComparisonValue): Self = StObject.set(x, "visitTimeOnSiteDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitTimeOnSiteDetailsUndefined: Self = StObject.set(x, "visitTimeOnSiteDetails", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
