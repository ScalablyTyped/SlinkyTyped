package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object honeycodeMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.honeycodeMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type DataItems = js.Array[typingsSlinky.awsSdk.honeycodeMod.DataItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.CURRENCY
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.TIME
    - typingsSlinky.awsSdk.awsSdkStrings.DATE_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.PERCENTAGE
    - typingsSlinky.awsSdk.awsSdkStrings.TEXT
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNTING
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT
    - typingsSlinky.awsSdk.awsSdkStrings.ROWLINK
    - java.lang.String
  */
  type Format = typingsSlinky.awsSdk.honeycodeMod._Format | java.lang.String
  type FormattedValue = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type PaginationToken = java.lang.String
  type RawValue = java.lang.String
  type ResourceId = java.lang.String
  type ResultHeader = js.Array[typingsSlinky.awsSdk.honeycodeMod.ColumnMetadata]
  type ResultRows = js.Array[typingsSlinky.awsSdk.honeycodeMod.ResultRow]
  type ResultSetMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.honeycodeMod.ResultSet]
  type RowId = java.lang.String
  type VariableName = java.lang.String
  type VariableValueMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.honeycodeMod.VariableValue]
  type WorkbookCursor = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-03-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.honeycodeMod._apiVersion | java.lang.String
}
