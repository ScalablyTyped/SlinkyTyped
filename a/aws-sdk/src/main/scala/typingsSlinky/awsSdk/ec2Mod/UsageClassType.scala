package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.spot_
  - typingsSlinky.awsSdk.awsSdkStrings.`on-demand`
  - java.lang.String
*/
trait UsageClassType extends js.Object

object UsageClassType {
  @scala.inline
  def spot_ : typingsSlinky.awsSdk.awsSdkStrings.spot_ = "spot".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.spot_]
  @scala.inline
  def `on-demand`: typingsSlinky.awsSdk.awsSdkStrings.`on-demand` = "on-demand".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`on-demand`]
  @scala.inline
  implicit def apply(value: java.lang.String): UsageClassType = value.asInstanceOf[UsageClassType]
}

