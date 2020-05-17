package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object healthMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.healthMod.ClientApiVersions
  type DescribeAffectedEntitiesForOrganizationFailedSet = js.Array[typingsSlinky.awsSdk.healthMod.OrganizationAffectedEntitiesErrorItem]
  type DescribeEventDetailsFailedSet = js.Array[typingsSlinky.awsSdk.healthMod.EventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationFailedSet = js.Array[typingsSlinky.awsSdk.healthMod.OrganizationEventDetailsErrorItem]
  type DescribeEventDetailsForOrganizationSuccessfulSet = js.Array[typingsSlinky.awsSdk.healthMod.OrganizationEventDetails]
  type DescribeEventDetailsSuccessfulSet = js.Array[typingsSlinky.awsSdk.healthMod.EventDetails]
  type EntityAggregateList = js.Array[typingsSlinky.awsSdk.healthMod.EntityAggregate]
  type EntityList = js.Array[typingsSlinky.awsSdk.healthMod.AffectedEntity]
  type EventAggregateList = js.Array[typingsSlinky.awsSdk.healthMod.EventAggregate]
  type EventArnsList = js.Array[typingsSlinky.awsSdk.healthMod.eventArn]
  type EventList = js.Array[typingsSlinky.awsSdk.healthMod.Event]
  type EventTypeCategoryList_ = js.Array[typingsSlinky.awsSdk.healthMod.eventTypeCategory]
  type EventTypeCodeList = js.Array[typingsSlinky.awsSdk.healthMod.eventTypeCode]
  type EventTypeList_ = js.Array[typingsSlinky.awsSdk.healthMod.EventType_]
  type OrganizationEntityFiltersList = js.Array[typingsSlinky.awsSdk.healthMod.EventAccountFilter]
  type OrganizationEventDetailFiltersList = js.Array[typingsSlinky.awsSdk.healthMod.EventAccountFilter]
  type OrganizationEventList = js.Array[typingsSlinky.awsSdk.healthMod.OrganizationEvent]
  type accountId = java.lang.String
  type affectedAccountsList = js.Array[typingsSlinky.awsSdk.healthMod.accountId]
  type aggregateValue = java.lang.String
  type availabilityZone = java.lang.String
  type availabilityZones = js.Array[typingsSlinky.awsSdk.healthMod.availabilityZone]
  type awsAccountIdsList = js.Array[typingsSlinky.awsSdk.healthMod.accountId]
  type count = scala.Double
  type dateTimeRangeList = js.Array[typingsSlinky.awsSdk.healthMod.DateTimeRange]
  type entityArn = java.lang.String
  type entityArnList = js.Array[typingsSlinky.awsSdk.healthMod.entityArn]
  type entityStatusCodeList = js.Array[typingsSlinky.awsSdk.healthMod.entityStatusCode]
  type entityUrl = java.lang.String
  type entityValue = java.lang.String
  type entityValueList = js.Array[typingsSlinky.awsSdk.healthMod.entityValue]
  type eventArn = java.lang.String
  type eventArnList = js.Array[typingsSlinky.awsSdk.healthMod.eventArn]
  type eventDescription = java.lang.String
  type eventMetadata = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.healthMod.metadataValue]
  type eventStatusCodeList = js.Array[typingsSlinky.awsSdk.healthMod.eventStatusCode]
  type eventType = java.lang.String
  type eventTypeCategoryList = js.Array[typingsSlinky.awsSdk.healthMod.eventTypeCategory]
  type eventTypeCode = java.lang.String
  type eventTypeList = js.Array[typingsSlinky.awsSdk.healthMod.eventType]
  type healthServiceAccessStatusForOrganization = java.lang.String
  type locale = java.lang.String
  type maxResults = scala.Double
  type metadataKey = java.lang.String
  type metadataValue = java.lang.String
  type nextToken = java.lang.String
  type region = java.lang.String
  type regionList = js.Array[typingsSlinky.awsSdk.healthMod.region]
  type service = java.lang.String
  type serviceList = js.Array[typingsSlinky.awsSdk.healthMod.service]
  type tagFilter = js.Array[typingsSlinky.awsSdk.healthMod.tagSet]
  type tagKey = java.lang.String
  type tagSet = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.healthMod.tagValue]
  type tagValue = java.lang.String
  type timestamp = js.Date
}
