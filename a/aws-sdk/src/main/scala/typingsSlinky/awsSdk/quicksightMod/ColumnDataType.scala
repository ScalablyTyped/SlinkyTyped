package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STRING
  - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
  - typingsSlinky.awsSdk.awsSdkStrings.DECIMAL
  - typingsSlinky.awsSdk.awsSdkStrings.DATETIME
  - java.lang.String
*/
trait ColumnDataType extends js.Object

object ColumnDataType {
  @scala.inline
  def STRING: typingsSlinky.awsSdk.awsSdkStrings.STRING = "STRING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STRING]
  @scala.inline
  def INTEGER: typingsSlinky.awsSdk.awsSdkStrings.INTEGER = "INTEGER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTEGER]
  @scala.inline
  def DECIMAL: typingsSlinky.awsSdk.awsSdkStrings.DECIMAL = "DECIMAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DECIMAL]
  @scala.inline
  def DATETIME: typingsSlinky.awsSdk.awsSdkStrings.DATETIME = "DATETIME".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DATETIME]
  @scala.inline
  implicit def apply(value: java.lang.String): ColumnDataType = value.asInstanceOf[ColumnDataType]
}

