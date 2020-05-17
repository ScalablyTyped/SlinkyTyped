package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.STRING
  - typingsSlinky.awsSdk.awsSdkStrings.INTEGER
  - typingsSlinky.awsSdk.awsSdkStrings.FLOAT
  - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
  - java.lang.String
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def STRING: typingsSlinky.awsSdk.awsSdkStrings.STRING = "STRING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.STRING]
  @scala.inline
  def INTEGER: typingsSlinky.awsSdk.awsSdkStrings.INTEGER = "INTEGER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INTEGER]
  @scala.inline
  def FLOAT: typingsSlinky.awsSdk.awsSdkStrings.FLOAT = "FLOAT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FLOAT]
  @scala.inline
  def BOOLEAN: typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN = "BOOLEAN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN]
  @scala.inline
  implicit def apply(value: String): DataType = value.asInstanceOf[DataType]
}

