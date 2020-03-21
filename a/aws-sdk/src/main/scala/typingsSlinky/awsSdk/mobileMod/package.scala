package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobileMod {
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mobileMod.AttributeValue]
  type Boolean = scala.Boolean
  type BundleDescription = java.lang.String
  type BundleId = java.lang.String
  type BundleList = js.Array[typingsSlinky.awsSdk.mobileMod.BundleDetails]
  type BundleTitle = java.lang.String
  type BundleVersion = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mobileMod.ClientApiVersions
  type ConsoleUrl = java.lang.String
  type Contents = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.mobileMod.Blob | java.lang.String
  type Date = js.Date
  type DownloadUrl = java.lang.String
  type Feature = java.lang.String
  type IconUrl = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OSX
    - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
    - typingsSlinky.awsSdk.awsSdkStrings.LINUX
    - typingsSlinky.awsSdk.awsSdkStrings.OBJC
    - typingsSlinky.awsSdk.awsSdkStrings.SWIFT
    - typingsSlinky.awsSdk.awsSdkStrings.ANDROID
    - typingsSlinky.awsSdk.awsSdkStrings.JAVASCRIPT
    - java.lang.String
  */
  type Platform = typingsSlinky.awsSdk.mobileMod._Platform | java.lang.String
  type Platforms = js.Array[typingsSlinky.awsSdk.mobileMod.Platform]
  type ProjectId = java.lang.String
  type ProjectName = java.lang.String
  type ProjectRegion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NORMAL
    - typingsSlinky.awsSdk.awsSdkStrings.SYNCING
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORTING
    - java.lang.String
  */
  type ProjectState = typingsSlinky.awsSdk.mobileMod._ProjectState | java.lang.String
  type ProjectSummaries = js.Array[typingsSlinky.awsSdk.mobileMod.ProjectSummary]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceType = java.lang.String
  type Resources = js.Array[typingsSlinky.awsSdk.mobileMod.Resource]
  type ShareUrl = java.lang.String
  type SnapshotId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-07-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mobileMod._apiVersion | java.lang.String
}
