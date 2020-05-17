package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC
  - typingsSlinky.awsSdk.awsSdkStrings.MANUAL
  - java.lang.String
*/
trait BackfillMode extends js.Object

object BackfillMode {
  @scala.inline
  def AUTOMATIC: typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC = "AUTOMATIC".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AUTOMATIC]
  @scala.inline
  def MANUAL: typingsSlinky.awsSdk.awsSdkStrings.MANUAL = "MANUAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MANUAL]
  @scala.inline
  implicit def apply(value: String): BackfillMode = value.asInstanceOf[BackfillMode]
}

