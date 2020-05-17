package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.WINDOWS
  - typingsSlinky.awsSdk.awsSdkStrings.LINUX
  - java.lang.String
*/
trait OperatingSystemType extends js.Object

object OperatingSystemType {
  @scala.inline
  def WINDOWS: typingsSlinky.awsSdk.awsSdkStrings.WINDOWS = "WINDOWS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.WINDOWS]
  @scala.inline
  def LINUX: typingsSlinky.awsSdk.awsSdkStrings.LINUX = "LINUX".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LINUX]
  @scala.inline
  implicit def apply(value: String): OperatingSystemType = value.asInstanceOf[OperatingSystemType]
}

