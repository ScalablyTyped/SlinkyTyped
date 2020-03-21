package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object marketplacemeteringMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.marketplacemeteringMod.ClientApiVersions
  type CustomerIdentifier = java.lang.String
  type NonEmptyString = java.lang.String
  type Nonce = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  type UsageDimension = java.lang.String
  type UsageQuantity = scala.Double
  type UsageRecordList = js.Array[typingsSlinky.awsSdk.marketplacemeteringMod.UsageRecord]
  type UsageRecordResultList = js.Array[typingsSlinky.awsSdk.marketplacemeteringMod.UsageRecordResult]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Success_
    - typingsSlinky.awsSdk.awsSdkStrings.CustomerNotSubscribed
    - typingsSlinky.awsSdk.awsSdkStrings.DuplicateRecord
    - java.lang.String
  */
  type UsageRecordResultStatus = typingsSlinky.awsSdk.marketplacemeteringMod._UsageRecordResultStatus | java.lang.String
  type VersionInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-01-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.marketplacemeteringMod._apiVersion | java.lang.String
}
