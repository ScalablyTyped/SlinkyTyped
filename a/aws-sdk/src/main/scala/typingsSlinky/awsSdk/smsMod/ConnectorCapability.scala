package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.VSPHERE
  - typingsSlinky.awsSdk.awsSdkStrings.SCVMM
  - typingsSlinky.awsSdk.awsSdkStrings.`HYPERV-MANAGER`
  - typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING
  - java.lang.String
*/
trait ConnectorCapability extends js.Object

object ConnectorCapability {
  @scala.inline
  def VSPHERE: typingsSlinky.awsSdk.awsSdkStrings.VSPHERE = "VSPHERE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VSPHERE]
  @scala.inline
  def SCVMM: typingsSlinky.awsSdk.awsSdkStrings.SCVMM = "SCVMM".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SCVMM]
  @scala.inline
  def `HYPERV-MANAGER`: typingsSlinky.awsSdk.awsSdkStrings.`HYPERV-MANAGER` = "HYPERV-MANAGER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`HYPERV-MANAGER`]
  @scala.inline
  def SNAPSHOT_BATCHING: typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING = "SNAPSHOT_BATCHING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNAPSHOT_BATCHING]
  @scala.inline
  implicit def apply(value: String): ConnectorCapability = value.asInstanceOf[ConnectorCapability]
}

