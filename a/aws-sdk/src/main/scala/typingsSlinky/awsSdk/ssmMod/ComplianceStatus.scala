package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT
  - typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT
  - java.lang.String
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  def COMPLIANT: typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT = "COMPLIANT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLIANT]
  @scala.inline
  def NON_COMPLIANT: typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT = "NON_COMPLIANT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NON_COMPLIANT]
  @scala.inline
  implicit def apply(value: java.lang.String): ComplianceStatus = value.asInstanceOf[ComplianceStatus]
}

