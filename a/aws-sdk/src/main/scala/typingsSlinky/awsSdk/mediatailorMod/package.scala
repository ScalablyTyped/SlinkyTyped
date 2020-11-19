package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediatailorMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediatailorMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OFF
    - typingsSlinky.awsSdk.awsSdkStrings.BEHIND_LIVE_EDGE
    - java.lang.String
  */
  type Mode = typingsSlinky.awsSdk.mediatailorMod._Mode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SINGLE_PERIOD
    - typingsSlinky.awsSdk.awsSdkStrings.MULTI_PERIOD
    - java.lang.String
  */
  type OriginManifestType = typingsSlinky.awsSdk.mediatailorMod._OriginManifestType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-04-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mediatailorMod._apiVersion | java.lang.String
  
  type integer = scala.Double
  
  type integerMin1 = scala.Double
  
  type integerMin1Max100 = scala.Double
  
  type listOfPlaybackConfigurations = js.Array[typingsSlinky.awsSdk.mediatailorMod.PlaybackConfiguration]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.mediatailorMod.string]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mediatailorMod.string]
  
  type string = java.lang.String
}
