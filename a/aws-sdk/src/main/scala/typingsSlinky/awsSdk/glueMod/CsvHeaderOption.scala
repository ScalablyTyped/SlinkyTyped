package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
  - typingsSlinky.awsSdk.awsSdkStrings.PRESENT
  - typingsSlinky.awsSdk.awsSdkStrings.ABSENT
  - java.lang.String
*/
trait CsvHeaderOption extends js.Object

object CsvHeaderOption {
  @scala.inline
  def UNKNOWN: typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN]
  @scala.inline
  def PRESENT: typingsSlinky.awsSdk.awsSdkStrings.PRESENT = "PRESENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PRESENT]
  @scala.inline
  def ABSENT: typingsSlinky.awsSdk.awsSdkStrings.ABSENT = "ABSENT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ABSENT]
  @scala.inline
  implicit def apply(value: String): CsvHeaderOption = value.asInstanceOf[CsvHeaderOption]
}

