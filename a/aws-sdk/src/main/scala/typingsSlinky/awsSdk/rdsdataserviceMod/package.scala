package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rdsdataserviceMod {
  
  type Arn = java.lang.String
  
  type ArrayOfArray = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.ArrayValue]
  
  type ArrayValueList = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.Value]
  
  type Boolean = scala.Boolean
  
  type BooleanArray = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.BoxedBoolean]
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedDouble = scala.Double
  
  type BoxedFloat = scala.Double
  
  type BoxedInteger = scala.Double
  
  type BoxedLong = scala.Double
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.rdsdataserviceMod.ClientApiVersions
  
  type DbName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DOUBLE_OR_LONG
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - java.lang.String
  */
  type DecimalReturnType = typingsSlinky.awsSdk.rdsdataserviceMod._DecimalReturnType | java.lang.String
  
  type DoubleArray = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.BoxedDouble]
  
  type FieldList = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.Field]
  
  type Id = java.lang.String
  
  type Integer = scala.Double
  
  type Long = scala.Double
  
  type LongArray = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.BoxedLong]
  
  type Metadata = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.ColumnMetadata]
  
  type ParameterName = java.lang.String
  
  type Records = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.Record]
  
  type RecordsUpdated = scala.Double
  
  type Row = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.Value]
  
  type SqlParameterSets = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.SqlParametersList]
  
  type SqlParametersList = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.SqlParameter]
  
  type SqlRecords = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.FieldList]
  
  type SqlStatement = java.lang.String
  
  type SqlStatementResults = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.SqlStatementResult]
  
  type String = java.lang.String
  
  type StringArray = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.String]
  
  type TransactionStatus = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DATE
    - typingsSlinky.awsSdk.awsSdkStrings.DECIMAL
    - typingsSlinky.awsSdk.awsSdkStrings.TIME
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type TypeHint = typingsSlinky.awsSdk.rdsdataserviceMod._TypeHint | java.lang.String
  
  type UpdateResults = js.Array[typingsSlinky.awsSdk.rdsdataserviceMod.UpdateResult]
  
  type _Blob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.rdsdataserviceMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-08-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.rdsdataserviceMod._apiVersion | java.lang.String
}
