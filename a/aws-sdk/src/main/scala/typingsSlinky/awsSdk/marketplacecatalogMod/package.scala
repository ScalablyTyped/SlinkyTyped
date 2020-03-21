package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object marketplacecatalogMod {
  type ARN = java.lang.String
  type Catalog = java.lang.String
  type ChangeSetDescription = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSummary]
  type ChangeSetName = java.lang.String
  type ChangeSetSummaryList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeSetSummaryListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PREPARING
    - typingsSlinky.awsSdk.awsSdkStrings.APPLYING
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeStatus = typingsSlinky.awsSdk.marketplacecatalogMod._ChangeStatus | java.lang.String
  type ChangeType = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.marketplacecatalogMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type DateTimeISO8601 = java.lang.String
  type EntitySummaryList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.EntitySummary]
  type EntityType = java.lang.String
  type ErrorDetailList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.ErrorDetail]
  type FilterList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.Filter]
  type FilterName = java.lang.String
  type Identifier = java.lang.String
  type Json = java.lang.String
  type MaxResultInteger = scala.Double
  type NextToken = java.lang.String
  type RequestedChangeList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.Change]
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.ResourceId]
  type SortBy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.marketplacecatalogMod._SortOrder | java.lang.String
  type StringValue = java.lang.String
  type ValueList = js.Array[typingsSlinky.awsSdk.marketplacecatalogMod.StringValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-17`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.marketplacecatalogMod._apiVersion | java.lang.String
}
