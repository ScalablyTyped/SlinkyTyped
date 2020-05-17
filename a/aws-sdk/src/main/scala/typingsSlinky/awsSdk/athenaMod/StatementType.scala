package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DDL
  - typingsSlinky.awsSdk.awsSdkStrings.DML
  - typingsSlinky.awsSdk.awsSdkStrings.UTILITY
  - java.lang.String
*/
trait StatementType extends js.Object

object StatementType {
  @scala.inline
  def DDL: typingsSlinky.awsSdk.awsSdkStrings.DDL = "DDL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DDL]
  @scala.inline
  def DML: typingsSlinky.awsSdk.awsSdkStrings.DML = "DML".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DML]
  @scala.inline
  def UTILITY: typingsSlinky.awsSdk.awsSdkStrings.UTILITY = "UTILITY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UTILITY]
  @scala.inline
  implicit def apply(value: java.lang.String): StatementType = value.asInstanceOf[StatementType]
}

