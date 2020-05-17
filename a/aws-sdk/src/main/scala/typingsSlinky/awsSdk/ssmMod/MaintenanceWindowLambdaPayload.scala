package typingsSlinky.awsSdk.ssmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.awsSdk.ssmMod.Blob
  - java.lang.String
*/
trait MaintenanceWindowLambdaPayload extends js.Object

object MaintenanceWindowLambdaPayload {
  @scala.inline
  implicit def apply(value: Blob): MaintenanceWindowLambdaPayload = value.asInstanceOf[MaintenanceWindowLambdaPayload]
  @scala.inline
  implicit def apply(value: Buffer): MaintenanceWindowLambdaPayload = value.asInstanceOf[MaintenanceWindowLambdaPayload]
  @scala.inline
  implicit def apply(value: java.lang.String): MaintenanceWindowLambdaPayload = value.asInstanceOf[MaintenanceWindowLambdaPayload]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): MaintenanceWindowLambdaPayload = value.asInstanceOf[MaintenanceWindowLambdaPayload]
}

