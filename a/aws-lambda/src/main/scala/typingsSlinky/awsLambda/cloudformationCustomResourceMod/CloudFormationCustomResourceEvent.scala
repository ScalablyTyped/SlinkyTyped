package typingsSlinky.awsLambda.cloudformationCustomResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceCreateEvent
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceUpdateEvent
  - typingsSlinky.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceDeleteEvent
*/
trait CloudFormationCustomResourceEvent extends js.Object

object CloudFormationCustomResourceEvent {
  @scala.inline
  implicit def apply(value: CloudFormationCustomResourceCreateEvent): CloudFormationCustomResourceEvent = value.asInstanceOf[CloudFormationCustomResourceEvent]
  @scala.inline
  implicit def apply(value: CloudFormationCustomResourceDeleteEvent): CloudFormationCustomResourceEvent = value.asInstanceOf[CloudFormationCustomResourceEvent]
  @scala.inline
  implicit def apply(value: CloudFormationCustomResourceUpdateEvent): CloudFormationCustomResourceEvent = value.asInstanceOf[CloudFormationCustomResourceEvent]
}

