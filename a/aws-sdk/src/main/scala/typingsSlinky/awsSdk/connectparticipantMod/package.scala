package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectparticipantMod {
  type ChatContent = java.lang.String
  type ChatContentType = java.lang.String
  type ChatItemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.MESSAGE
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_ACK
    - java.lang.String
  */
  type ChatItemType = typingsSlinky.awsSdk.connectparticipantMod._ChatItemType | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.connectparticipantMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.WEBSOCKET
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECTION_CREDENTIALS
    - java.lang.String
  */
  type ConnectionType = typingsSlinky.awsSdk.connectparticipantMod._ConnectionType | java.lang.String
  type ConnectionTypeList = js.Array[typingsSlinky.awsSdk.connectparticipantMod.ConnectionType]
  type ContactId = java.lang.String
  type DisplayName = java.lang.String
  type ISO8601Datetime = java.lang.String
  type Instant = java.lang.String
  type MaxResults = scala.Double
  type MostRecent = scala.Double
  type NextToken = java.lang.String
  type ParticipantId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM
    - java.lang.String
  */
  type ParticipantRole = typingsSlinky.awsSdk.connectparticipantMod._ParticipantRole | java.lang.String
  type ParticipantToken = java.lang.String
  type PreSignedConnectionUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FORWARD
    - typingsSlinky.awsSdk.awsSdkStrings.BACKWARD
    - java.lang.String
  */
  type ScanDirection = typingsSlinky.awsSdk.connectparticipantMod._ScanDirection | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortKey = typingsSlinky.awsSdk.connectparticipantMod._SortKey | java.lang.String
  type Transcript = js.Array[typingsSlinky.awsSdk.connectparticipantMod.Item]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-07`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.connectparticipantMod._apiVersion | java.lang.String
}
