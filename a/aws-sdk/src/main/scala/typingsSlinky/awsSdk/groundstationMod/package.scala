package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groundstationMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEGREE_ANGLE
    - typingsSlinky.awsSdk.awsSdkStrings.RADIAN
    - java.lang.String
  */
  type AngleUnits = typingsSlinky.awsSdk.groundstationMod._AngleUnits | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GHz
    - typingsSlinky.awsSdk.awsSdkStrings.MHz
    - typingsSlinky.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type BandwidthUnits = typingsSlinky.awsSdk.groundstationMod._BandwidthUnits | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.groundstationMod.ClientApiVersions
  type ConfigArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`antenna-downlink`
    - typingsSlinky.awsSdk.awsSdkStrings.`antenna-downlink-demod-decode`
    - typingsSlinky.awsSdk.awsSdkStrings.`antenna-uplink`
    - typingsSlinky.awsSdk.awsSdkStrings.`dataflow-endpoint`
    - typingsSlinky.awsSdk.awsSdkStrings.tracking
    - typingsSlinky.awsSdk.awsSdkStrings.`uplink-echo`
    - java.lang.String
  */
  type ConfigCapabilityType = typingsSlinky.awsSdk.groundstationMod._ConfigCapabilityType | java.lang.String
  type ConfigList = js.Array[typingsSlinky.awsSdk.groundstationMod.ConfigListItem]
  type ContactList = js.Array[typingsSlinky.awsSdk.groundstationMod.ContactData]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLING
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED_TO_SCHEDULE
    - typingsSlinky.awsSdk.awsSdkStrings.PASS
    - typingsSlinky.awsSdk.awsSdkStrings.POSTPASS
    - typingsSlinky.awsSdk.awsSdkStrings.PREPASS
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULING
    - java.lang.String
  */
  type ContactStatus = typingsSlinky.awsSdk.groundstationMod._ContactStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PREFERRED
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVED
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type Criticality = typingsSlinky.awsSdk.groundstationMod._Criticality | java.lang.String
  type DataflowEdge = js.Array[typingsSlinky.awsSdk.groundstationMod.ConfigArn]
  type DataflowEdgeList = js.Array[typingsSlinky.awsSdk.groundstationMod.DataflowEdge]
  type DataflowEndpointGroupArn = java.lang.String
  type DataflowEndpointGroupList = js.Array[typingsSlinky.awsSdk.groundstationMod.DataflowEndpointListItem]
  type DataflowEndpointmtuInteger = scala.Double
  type DataflowList = js.Array[typingsSlinky.awsSdk.groundstationMod.DataflowDetail]
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EirpUnits = typingsSlinky.awsSdk.awsSdkStrings.dBW | java.lang.String
  type EndpointDetailsList = js.Array[typingsSlinky.awsSdk.groundstationMod.EndpointDetails]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.created__
    - typingsSlinky.awsSdk.awsSdkStrings.creating__
    - typingsSlinky.awsSdk.awsSdkStrings.deleted__
    - typingsSlinky.awsSdk.awsSdkStrings.deleting__
    - typingsSlinky.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type EndpointStatus = typingsSlinky.awsSdk.groundstationMod._EndpointStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GHz
    - typingsSlinky.awsSdk.awsSdkStrings.MHz
    - typingsSlinky.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type FrequencyUnits = typingsSlinky.awsSdk.groundstationMod._FrequencyUnits | java.lang.String
  type GroundStationIdList = js.Array[typingsSlinky.awsSdk.groundstationMod.String]
  type GroundStationList = js.Array[typingsSlinky.awsSdk.groundstationMod.GroundStationData]
  type Integer = scala.Double
  type JsonString = java.lang.String
  type MissionProfileArn = java.lang.String
  type MissionProfileList = js.Array[typingsSlinky.awsSdk.groundstationMod.MissionProfileListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LEFT_HAND
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.RIGHT_HAND
    - java.lang.String
  */
  type Polarization = typingsSlinky.awsSdk.groundstationMod._Polarization | java.lang.String
  type RoleArn = java.lang.String
  type SafeName = java.lang.String
  type SatelliteList = js.Array[typingsSlinky.awsSdk.groundstationMod.SatelliteListItem]
  type SecurityGroupIdList = js.Array[typingsSlinky.awsSdk.groundstationMod.String]
  type StatusList = js.Array[typingsSlinky.awsSdk.groundstationMod.ContactStatus]
  type String = java.lang.String
  type SubnetList = js.Array[typingsSlinky.awsSdk.groundstationMod.String]
  type TagKeys = js.Array[typingsSlinky.awsSdk.groundstationMod.String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.groundstationMod.String]
  type Timestamp = js.Date
  type Uuid = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-05-23`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.groundstationMod._apiVersion | java.lang.String
  type noradSatelliteID = scala.Double
  type satelliteArn = java.lang.String
}
