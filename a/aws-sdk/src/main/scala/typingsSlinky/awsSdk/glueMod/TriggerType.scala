package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED
  - typingsSlinky.awsSdk.awsSdkStrings.CONDITIONAL
  - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
trait TriggerType extends js.Object

object TriggerType {
  @scala.inline
  def SCHEDULED: typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED = "SCHEDULED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED]
  @scala.inline
  def CONDITIONAL: typingsSlinky.awsSdk.awsSdkStrings.CONDITIONAL = "CONDITIONAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CONDITIONAL]
  @scala.inline
  def ON_DEMAND: typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND = "ON_DEMAND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND]
  @scala.inline
  implicit def apply(value: String): TriggerType = value.asInstanceOf[TriggerType]
}

