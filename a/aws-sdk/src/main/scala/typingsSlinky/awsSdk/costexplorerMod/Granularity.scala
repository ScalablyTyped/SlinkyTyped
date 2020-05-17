package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DAILY
  - typingsSlinky.awsSdk.awsSdkStrings.MONTHLY
  - typingsSlinky.awsSdk.awsSdkStrings.HOURLY
  - java.lang.String
*/
trait Granularity extends js.Object

object Granularity {
  @scala.inline
  def DAILY: typingsSlinky.awsSdk.awsSdkStrings.DAILY = "DAILY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DAILY]
  @scala.inline
  def MONTHLY: typingsSlinky.awsSdk.awsSdkStrings.MONTHLY = "MONTHLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MONTHLY]
  @scala.inline
  def HOURLY: typingsSlinky.awsSdk.awsSdkStrings.HOURLY = "HOURLY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HOURLY]
  @scala.inline
  implicit def apply(value: String): Granularity = value.asInstanceOf[Granularity]
}

