package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HOURLY
  - typingsSlinky.awsSdk.awsSdkStrings.DAILY
  - java.lang.String
*/
trait TimeUnit extends js.Object

object TimeUnit {
  @scala.inline
  def HOURLY: typingsSlinky.awsSdk.awsSdkStrings.HOURLY = "HOURLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HOURLY]
  @scala.inline
  def DAILY: typingsSlinky.awsSdk.awsSdkStrings.DAILY = "DAILY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DAILY]
  @scala.inline
  implicit def apply(value: String): TimeUnit = value.asInstanceOf[TimeUnit]
}

