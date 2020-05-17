package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.JAR
  - typingsSlinky.awsSdk.awsSdkStrings.FILE
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE
  - java.lang.String
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def JAR: typingsSlinky.awsSdk.awsSdkStrings.JAR = "JAR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JAR]
  @scala.inline
  def FILE: typingsSlinky.awsSdk.awsSdkStrings.FILE = "FILE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FILE]
  @scala.inline
  def ARCHIVE: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE = "ARCHIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVE]
  @scala.inline
  implicit def apply(value: String): ResourceType = value.asInstanceOf[ResourceType]
}

