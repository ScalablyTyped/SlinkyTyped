package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object savingsplansMod {
  type Amount = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.savingsplansMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CNY
    - typingsSlinky.awsSdk.awsSdkStrings.USD
    - java.lang.String
  */
  type CurrencyCode = typingsSlinky.awsSdk.savingsplansMod._CurrencyCode | java.lang.String
  type CurrencyList = js.Array[typingsSlinky.awsSdk.savingsplansMod.CurrencyCode]
  type DurationsList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlansDuration]
  type EC2InstanceFamily = java.lang.String
  type FilterValuesList = js.Array[typingsSlinky.awsSdk.savingsplansMod.JsonSafeFilterValueString]
  type JsonSafeFilterValueString = java.lang.String
  type ListOfStrings = js.Array[typingsSlinky.awsSdk.savingsplansMod.String]
  type MaxResults = scala.Double
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Region = java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlanArnList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanArn]
  type SavingsPlanDescription = java.lang.String
  type SavingsPlanDescriptionsList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanDescription]
  type SavingsPlanFilterList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanFilter]
  type SavingsPlanId = java.lang.String
  type SavingsPlanIdList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanId]
  type SavingsPlanList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlan]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingFilterAttribute = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanOfferingFilterAttribute | java.lang.String
  type SavingsPlanOfferingFiltersList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingPropertyKey = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanOfferingPropertyKey | java.lang.String
  type SavingsPlanOfferingPropertyList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOffering]
  type SavingsPlanOperation = java.lang.String
  type SavingsPlanOperationList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanOperation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`All Upfront`
    - typingsSlinky.awsSdk.awsSdkStrings.`Partial Upfront`
    - typingsSlinky.awsSdk.awsSdkStrings.`No Upfront`
    - java.lang.String
  */
  type SavingsPlanPaymentOption = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanPaymentOption | java.lang.String
  type SavingsPlanPaymentOptionList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanPaymentOption]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EC2
    - typingsSlinky.awsSdk.awsSdkStrings.Fargate_
    - typingsSlinky.awsSdk.awsSdkStrings.Lambda_
    - java.lang.String
  */
  type SavingsPlanProductType = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanProductType | java.lang.String
  type SavingsPlanProductTypeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanProductType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.instanceFamily
    - typingsSlinky.awsSdk.awsSdkStrings.instanceType_
    - typingsSlinky.awsSdk.awsSdkStrings.productDescription
    - typingsSlinky.awsSdk.awsSdkStrings.tenancy_
    - typingsSlinky.awsSdk.awsSdkStrings.productId
    - java.lang.String
  */
  type SavingsPlanRateFilterAttribute = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanRateFilterAttribute | java.lang.String
  type SavingsPlanRateFilterList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRateFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.instanceType_
    - typingsSlinky.awsSdk.awsSdkStrings.productDescription
    - typingsSlinky.awsSdk.awsSdkStrings.tenancy_
    - typingsSlinky.awsSdk.awsSdkStrings.productType_
    - typingsSlinky.awsSdk.awsSdkStrings.serviceCode
    - typingsSlinky.awsSdk.awsSdkStrings.usageType
    - typingsSlinky.awsSdk.awsSdkStrings.operation_
    - java.lang.String
  */
  type SavingsPlanRateFilterName = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanRateFilterName | java.lang.String
  type SavingsPlanRateList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRate]
  type SavingsPlanRateOperation = java.lang.String
  type SavingsPlanRateOperationList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.instanceType_
    - typingsSlinky.awsSdk.awsSdkStrings.instanceFamily
    - typingsSlinky.awsSdk.awsSdkStrings.productDescription
    - typingsSlinky.awsSdk.awsSdkStrings.tenancy_
    - java.lang.String
  */
  type SavingsPlanRatePropertyKey = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanRatePropertyKey | java.lang.String
  type SavingsPlanRatePropertyList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRateProperty]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AmazonEC2
    - typingsSlinky.awsSdk.awsSdkStrings.AmazonECS
    - typingsSlinky.awsSdk.awsSdkStrings.AWSLambda
    - java.lang.String
  */
  type SavingsPlanRateServiceCode = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanRateServiceCode | java.lang.String
  type SavingsPlanRateServiceCodeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRateServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Hrs
    - typingsSlinky.awsSdk.awsSdkStrings.`Lambda-GB-Second`
    - typingsSlinky.awsSdk.awsSdkStrings.Request_
    - java.lang.String
  */
  type SavingsPlanRateUnit = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanRateUnit | java.lang.String
  type SavingsPlanRateUsageType = java.lang.String
  type SavingsPlanRateUsageTypeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanRateUsageType]
  type SavingsPlanServiceCode = java.lang.String
  type SavingsPlanServiceCodeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-pending`
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-failed`
    - typingsSlinky.awsSdk.awsSdkStrings.active__
    - typingsSlinky.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type SavingsPlanState = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanState | java.lang.String
  type SavingsPlanStateList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanState]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Compute
    - typingsSlinky.awsSdk.awsSdkStrings.EC2Instance
    - java.lang.String
  */
  type SavingsPlanType = typingsSlinky.awsSdk.savingsplansMod._SavingsPlanType | java.lang.String
  type SavingsPlanTypeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanType]
  type SavingsPlanUsageType = java.lang.String
  type SavingsPlanUsageTypeList = js.Array[typingsSlinky.awsSdk.savingsplansMod.SavingsPlanUsageType]
  type SavingsPlansDuration = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.region__
    - typingsSlinky.awsSdk.awsSdkStrings.`ec2-instance-family`
    - typingsSlinky.awsSdk.awsSdkStrings.commitment
    - typingsSlinky.awsSdk.awsSdkStrings.upfront
    - typingsSlinky.awsSdk.awsSdkStrings.term
    - typingsSlinky.awsSdk.awsSdkStrings.`savings-plan-type`
    - typingsSlinky.awsSdk.awsSdkStrings.`payment-option`
    - typingsSlinky.awsSdk.awsSdkStrings.start_
    - typingsSlinky.awsSdk.awsSdkStrings.end_
    - java.lang.String
  */
  type SavingsPlansFilterName = typingsSlinky.awsSdk.savingsplansMod._SavingsPlansFilterName | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.savingsplansMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.savingsplansMod.TagValue]
  type TagValue = java.lang.String
  type TermDurationInSeconds = scala.Double
  type UUID = java.lang.String
  type UUIDs = js.Array[typingsSlinky.awsSdk.savingsplansMod.UUID]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-06-28`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.savingsplansMod._apiVersion | java.lang.String
}
