package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VCpuInfo extends js.Object {
  /**
    * The default number of cores for the instance type.
    */
  var DefaultCores: js.UndefOr[CoreCount] = js.native
  /**
    * The default number of threads per core for the instance type.
    */
  var DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore] = js.native
  /**
    * The default number of vCPUs for the instance type.
    */
  var DefaultVCpus: js.UndefOr[VCpuCount] = js.native
  /**
    * List of the valid number of cores that can be configured for the instance type.
    */
  var ValidCores: js.UndefOr[CoreCountList] = js.native
  /**
    * List of the valid number of threads per core that can be configured for the instance type. 
    */
  var ValidThreadsPerCore: js.UndefOr[ThreadsPerCoreList] = js.native
}

object VCpuInfo {
  @scala.inline
  def apply(): VCpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCpuInfo]
  }
  @scala.inline
  implicit class VCpuInfoOps[Self <: VCpuInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCores(value: CoreCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultCores")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultThreadsPerCore(value: ThreadsPerCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultThreadsPerCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultThreadsPerCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultThreadsPerCore")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultVCpus(value: VCpuCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withValidCores(value: CoreCountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidCores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidCores: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidCores")(js.undefined)
        ret
    }
    @scala.inline
    def withValidThreadsPerCore(value: ThreadsPerCoreList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidThreadsPerCore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidThreadsPerCore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidThreadsPerCore")(js.undefined)
        ret
    }
  }
  
}

