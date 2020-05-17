package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity
  - typingsSlinky.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount
  - typingsSlinky.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`
  - typingsSlinky.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount
  - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits
  - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits
  - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits
  - typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits
  - java.lang.String
*/
trait ScalableDimension extends js.Object

object ScalableDimension {
  @scala.inline
  def autoscalingColonautoScalingGroupColonDesiredCapacity: typingsSlinky.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity = "autoscaling:autoScalingGroup:DesiredCapacity".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.autoscalingColonautoScalingGroupColonDesiredCapacity]
  @scala.inline
  def ecsColonserviceColonDesiredCount: typingsSlinky.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount = "ecs:service:DesiredCount".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ecsColonserviceColonDesiredCount]
  @scala.inline
  def `ec2Colonspot-fleet-requestColonTargetCapacity`: typingsSlinky.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity` = "ec2:spot-fleet-request:TargetCapacity".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`ec2Colonspot-fleet-requestColonTargetCapacity`]
  @scala.inline
  def rdsColonclusterColonReadReplicaCount: typingsSlinky.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount = "rds:cluster:ReadReplicaCount".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.rdsColonclusterColonReadReplicaCount]
  @scala.inline
  def dynamodbColontableColonReadCapacityUnits: typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits = "dynamodb:table:ReadCapacityUnits".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonReadCapacityUnits]
  @scala.inline
  def dynamodbColontableColonWriteCapacityUnits: typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits = "dynamodb:table:WriteCapacityUnits".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.dynamodbColontableColonWriteCapacityUnits]
  @scala.inline
  def dynamodbColonindexColonReadCapacityUnits: typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits = "dynamodb:index:ReadCapacityUnits".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonReadCapacityUnits]
  @scala.inline
  def dynamodbColonindexColonWriteCapacityUnits: typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits = "dynamodb:index:WriteCapacityUnits".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.dynamodbColonindexColonWriteCapacityUnits]
  @scala.inline
  implicit def apply(value: String): ScalableDimension = value.asInstanceOf[ScalableDimension]
}

