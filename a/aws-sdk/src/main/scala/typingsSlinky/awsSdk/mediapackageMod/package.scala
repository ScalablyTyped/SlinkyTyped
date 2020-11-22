package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediapackageMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.SCTE35_ENHANCED
    - typingsSlinky.awsSdk.awsSdkStrings.PASSTHROUGH
    - typingsSlinky.awsSdk.awsSdkStrings.DATERANGE
    - java.lang.String
  */
  type AdMarkers = typingsSlinky.awsSdk.mediapackageMod._AdMarkers | java.lang.String
  
  type AdTriggers = js.Array[typingsSlinky.awsSdk.mediapackageMod.AdTriggersElement]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SPLICE_INSERT
    - typingsSlinky.awsSdk.awsSdkStrings.BREAK
    - typingsSlinky.awsSdk.awsSdkStrings.PROVIDER_ADVERTISEMENT
    - typingsSlinky.awsSdk.awsSdkStrings.DISTRIBUTOR_ADVERTISEMENT
    - typingsSlinky.awsSdk.awsSdkStrings.PROVIDER_PLACEMENT_OPPORTUNITY
    - typingsSlinky.awsSdk.awsSdkStrings.DISTRIBUTOR_PLACEMENT_OPPORTUNITY
    - typingsSlinky.awsSdk.awsSdkStrings.PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY
    - typingsSlinky.awsSdk.awsSdkStrings.DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
    - java.lang.String
  */
  type AdTriggersElement = typingsSlinky.awsSdk.mediapackageMod._AdTriggersElement | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.RESTRICTED
    - typingsSlinky.awsSdk.awsSdkStrings.UNRESTRICTED
    - typingsSlinky.awsSdk.awsSdkStrings.BOTH
    - java.lang.String
  */
  type AdsOnDeliveryRestrictions = typingsSlinky.awsSdk.mediapackageMod._AdsOnDeliveryRestrictions | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediapackageMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AES_128
    - typingsSlinky.awsSdk.awsSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = typingsSlinky.awsSdk.mediapackageMod._EncryptionMethod | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FULL
    - typingsSlinky.awsSdk.awsSdkStrings.COMPACT
    - java.lang.String
  */
  type ManifestLayout = typingsSlinky.awsSdk.mediapackageMod._ManifestLayout | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
    - typingsSlinky.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type Origination = typingsSlinky.awsSdk.mediapackageMod._Origination | java.lang.String
  
  type PeriodTriggersElement = typingsSlinky.awsSdk.awsSdkStrings.ADS | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.VOD
    - java.lang.String
  */
  type PlaylistType = typingsSlinky.awsSdk.mediapackageMod._PlaylistType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = typingsSlinky.awsSdk.mediapackageMod._Profile | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER_WITH_TIMELINE
    - typingsSlinky.awsSdk.awsSdkStrings.TIME_WITH_TIMELINE
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER_WITH_DURATION
    - java.lang.String
  */
  type SegmentTemplateFormat = typingsSlinky.awsSdk.mediapackageMod._SegmentTemplateFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.mediapackageMod._Status | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ORIGINAL
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO_BITRATE_ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = typingsSlinky.awsSdk.mediapackageMod._StreamOrder | java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mediapackageMod.string]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.`HTTP-HEAD`
    - typingsSlinky.awsSdk.awsSdkStrings.`HTTP-ISO`
    - java.lang.String
  */
  type UtcTiming = typingsSlinky.awsSdk.mediapackageMod._UtcTiming | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-10-12`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mediapackageMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type integer = scala.Double
  
  type listOfChannel = js.Array[typingsSlinky.awsSdk.mediapackageMod.Channel]
  
  type listOfHarvestJob = js.Array[typingsSlinky.awsSdk.mediapackageMod.HarvestJob]
  
  type listOfHlsManifest = js.Array[typingsSlinky.awsSdk.mediapackageMod.HlsManifest]
  
  type listOfHlsManifestCreateOrUpdateParameters = js.Array[typingsSlinky.awsSdk.mediapackageMod.HlsManifestCreateOrUpdateParameters]
  
  type listOfIngestEndpoint = js.Array[typingsSlinky.awsSdk.mediapackageMod.IngestEndpoint]
  
  type listOfOriginEndpoint = js.Array[typingsSlinky.awsSdk.mediapackageMod.OriginEndpoint]
  
  type listOfPeriodTriggersElement = js.Array[typingsSlinky.awsSdk.mediapackageMod.PeriodTriggersElement]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.mediapackageMod.string]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mediapackageMod.string]
  
  type string = java.lang.String
}
