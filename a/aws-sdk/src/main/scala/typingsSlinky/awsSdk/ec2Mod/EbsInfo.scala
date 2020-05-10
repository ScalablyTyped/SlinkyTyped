package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInfo extends js.Object {
  /**
    * Indicates that the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-Optimized Instances in Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimizedSupport: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EbsOptimizedSupport] = js.native
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  var EncryptionSupport: js.UndefOr[EbsEncryptionSupport] = js.native
}

object EbsInfo {
  @scala.inline
  def apply(): EbsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInfo]
  }
  @scala.inline
  implicit class EbsInfoOps[Self <: EbsInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEbsOptimizedSupport(value: EbsOptimizedSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimizedSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsOptimizedSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsOptimizedSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionSupport(value: EbsEncryptionSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionSupport")(js.undefined)
        ret
    }
  }
  
}

