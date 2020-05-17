package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ok__
  - typingsSlinky.awsSdk.awsSdkStrings.impaired__
  - typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`
  - java.lang.String
*/
trait VolumeStatusInfoStatus extends js.Object

object VolumeStatusInfoStatus {
  @scala.inline
  def ok__ : typingsSlinky.awsSdk.awsSdkStrings.ok__ = "ok".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ok__]
  @scala.inline
  def impaired__ : typingsSlinky.awsSdk.awsSdkStrings.impaired__ = "impaired".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.impaired__]
  @scala.inline
  def `insufficient-data`: typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data` = "insufficient-data".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`insufficient-data`]
  @scala.inline
  implicit def apply(value: java.lang.String): VolumeStatusInfoStatus = value.asInstanceOf[VolumeStatusInfoStatus]
}

