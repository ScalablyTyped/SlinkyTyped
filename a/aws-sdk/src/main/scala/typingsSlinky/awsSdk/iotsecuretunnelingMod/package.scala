package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotsecuretunnelingMod {
  type AmazonResourceName = java.lang.String
  type ClientAccessToken = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotsecuretunnelingMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTED
    - typingsSlinky.awsSdk.awsSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type ConnectionStatus = typingsSlinky.awsSdk.iotsecuretunnelingMod._ConnectionStatus | java.lang.String
  type DateType = js.Date
  type DeleteFlag = scala.Boolean
  type Description = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Service = java.lang.String
  type ServiceList = js.Array[typingsSlinky.awsSdk.iotsecuretunnelingMod.Service]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.iotsecuretunnelingMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.iotsecuretunnelingMod.Tag]
  type TagValue = java.lang.String
  type ThingName = java.lang.String
  type TimeoutInMin = scala.Double
  type TunnelArn = java.lang.String
  type TunnelId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OPEN
    - typingsSlinky.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type TunnelStatus = typingsSlinky.awsSdk.iotsecuretunnelingMod._TunnelStatus | java.lang.String
  type TunnelSummaryList = js.Array[typingsSlinky.awsSdk.iotsecuretunnelingMod.TunnelSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-10-05`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotsecuretunnelingMod._apiVersion | java.lang.String
}
