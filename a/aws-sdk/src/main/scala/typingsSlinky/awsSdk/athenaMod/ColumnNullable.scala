package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_NULL
  - typingsSlinky.awsSdk.awsSdkStrings.NULLABLE
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
trait ColumnNullable extends js.Object

object ColumnNullable {
  @scala.inline
  def NOT_NULL: typingsSlinky.awsSdk.awsSdkStrings.NOT_NULL = "NOT_NULL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_NULL]
  @scala.inline
  def NULLABLE: typingsSlinky.awsSdk.awsSdkStrings.NULLABLE = "NULLABLE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NULLABLE]
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  implicit def apply(value: java.lang.String): ColumnNullable = value.asInstanceOf[ColumnNullable]
}

