package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object migrationhubconfigMod {
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.migrationhubconfigMod.ClientApiVersions
  
  type ControlId = java.lang.String
  
  type DescribeHomeRegionControlsMaxResults = scala.Double
  
  type DryRun = scala.Boolean
  
  type HomeRegion = java.lang.String
  
  type HomeRegionControls = js.Array[typingsSlinky.awsSdk.migrationhubconfigMod.HomeRegionControl]
  
  type RequestedTime = js.Date
  
  type TargetId = java.lang.String
  
  type TargetType = typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  
  type Token = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-06-30`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.migrationhubconfigMod._apiVersion | java.lang.String
}
