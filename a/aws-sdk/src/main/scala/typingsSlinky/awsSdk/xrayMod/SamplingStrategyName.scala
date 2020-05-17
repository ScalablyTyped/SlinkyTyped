package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PartialScan
  - typingsSlinky.awsSdk.awsSdkStrings.FixedRate
  - java.lang.String
*/
trait SamplingStrategyName extends js.Object

object SamplingStrategyName {
  @scala.inline
  def PartialScan: typingsSlinky.awsSdk.awsSdkStrings.PartialScan = "PartialScan".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PartialScan]
  @scala.inline
  def FixedRate: typingsSlinky.awsSdk.awsSdkStrings.FixedRate = "FixedRate".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FixedRate]
  @scala.inline
  implicit def apply(value: java.lang.String): SamplingStrategyName = value.asInstanceOf[SamplingStrategyName]
}

