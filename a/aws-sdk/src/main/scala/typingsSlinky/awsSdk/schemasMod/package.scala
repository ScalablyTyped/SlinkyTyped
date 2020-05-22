package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemasMod {
  type Body = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.schemasMod.Blob | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.schemasMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_COMPLETE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - java.lang.String
  */
  type CodeGenerationStatus = typingsSlinky.awsSdk.schemasMod._CodeGenerationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DiscovererState = typingsSlinky.awsSdk.schemasMod._DiscovererState | java.lang.String
  type GetDiscoveredSchemaVersionItemInput = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.schemasMod.string]
  type Type = typingsSlinky.awsSdk.awsSdkStrings.OpenApi3 | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.schemasMod._apiVersion | java.lang.String
  type integer = scala.Double
  type listOfDiscovererSummary = js.Array[typingsSlinky.awsSdk.schemasMod.DiscovererSummary]
  type listOfGetDiscoveredSchemaVersionItemInput = js.Array[typingsSlinky.awsSdk.schemasMod.GetDiscoveredSchemaVersionItemInput]
  type listOfRegistrySummary = js.Array[typingsSlinky.awsSdk.schemasMod.RegistrySummary]
  type listOfSchemaSummary = js.Array[typingsSlinky.awsSdk.schemasMod.SchemaSummary]
  type listOfSchemaVersionSummary = js.Array[typingsSlinky.awsSdk.schemasMod.SchemaVersionSummary]
  type listOfSearchSchemaSummary = js.Array[typingsSlinky.awsSdk.schemasMod.SearchSchemaSummary]
  type listOfSearchSchemaVersionSummary = js.Array[typingsSlinky.awsSdk.schemasMod.SearchSchemaVersionSummary]
  type listOfString = js.Array[typingsSlinky.awsSdk.schemasMod.string]
  type long = scala.Double
  type string = java.lang.String
  type stringMin0Max256 = java.lang.String
  type stringMin0Max36 = java.lang.String
  type stringMin1Max100000 = java.lang.String
  type stringMin20Max1600 = java.lang.String
  type timestampIso8601 = js.Date
}
