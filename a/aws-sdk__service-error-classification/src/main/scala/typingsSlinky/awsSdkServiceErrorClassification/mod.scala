package typingsSlinky.awsSdkServiceErrorClassification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/service-error-classification", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isClockSkewError(error: js.Error): Boolean = js.native
  def isStillProcessingError(error: js.Error): Boolean = js.native
  def isThrottlingError(error: js.Error): Boolean = js.native
}

