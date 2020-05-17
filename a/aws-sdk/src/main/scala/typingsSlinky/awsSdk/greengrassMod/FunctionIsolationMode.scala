package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GreengrassContainer
  - typingsSlinky.awsSdk.awsSdkStrings.NoContainer
  - java.lang.String
*/
trait FunctionIsolationMode extends js.Object

object FunctionIsolationMode {
  @scala.inline
  def GreengrassContainer: typingsSlinky.awsSdk.awsSdkStrings.GreengrassContainer = "GreengrassContainer".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GreengrassContainer]
  @scala.inline
  def NoContainer: typingsSlinky.awsSdk.awsSdkStrings.NoContainer = "NoContainer".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NoContainer]
  @scala.inline
  implicit def apply(value: String): FunctionIsolationMode = value.asInstanceOf[FunctionIsolationMode]
}

