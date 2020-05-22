package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object networkmanagerMod {
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.networkmanagerMod.ClientApiVersions
  type CustomerGatewayAssociationList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.CustomerGatewayAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CustomerGatewayAssociationState = typingsSlinky.awsSdk.networkmanagerMod._CustomerGatewayAssociationState | java.lang.String
  type DateTime = js.Date
  type DeviceList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.Device]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type DeviceState = typingsSlinky.awsSdk.networkmanagerMod._DeviceState | java.lang.String
  type GlobalNetworkList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.GlobalNetwork]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalNetworkState = typingsSlinky.awsSdk.networkmanagerMod._GlobalNetworkState | java.lang.String
  type Integer = scala.Double
  type LinkAssociationList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.LinkAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type LinkAssociationState = typingsSlinky.awsSdk.networkmanagerMod._LinkAssociationState | java.lang.String
  type LinkList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.Link]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type LinkState = typingsSlinky.awsSdk.networkmanagerMod._LinkState | java.lang.String
  type MaxResults = scala.Double
  type ResourceARN = java.lang.String
  type SiteList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.Site]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SiteState = typingsSlinky.awsSdk.networkmanagerMod._SiteState | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.TagKey]
  type TagList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.Tag]
  type TagValue = java.lang.String
  type TransitGatewayRegistrationList = js.Array[typingsSlinky.awsSdk.networkmanagerMod.TransitGatewayRegistration]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type TransitGatewayRegistrationState = typingsSlinky.awsSdk.networkmanagerMod._TransitGatewayRegistrationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-07-05`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.networkmanagerMod._apiVersion | java.lang.String
}
