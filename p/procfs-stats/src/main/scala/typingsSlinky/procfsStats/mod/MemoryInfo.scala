package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.procfsStatsStrings.`136524`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  var Active: String = js.native
  @JSName("Active(anon)")
  var ActiveLeftparenthesisanonRightparenthesis: String = js.native
  @JSName("Active(file)")
  var ActiveLeftparenthesisfileRightparenthesis: String = js.native
  var AnonHugePages: String = js.native
  var AnonPages: String = js.native
  var Bounce: String = js.native
  var Buffers: String = js.native
  var Cached: String = js.native
  var CommitLimit: String = js.native
  var Committed_AS: String = js.native
  var DirectMap2M: String = js.native
  var DirectMap4k: String = js.native
  var Dirty: String = js.native
  var HugePages_Free: String = js.native
  var HugePages_Rsvd: String = js.native
  var HugePages_Surp: String = js.native
  var HugePages_Total: String = js.native
  var Hugepagesize: String = js.native
  var Inactive: `136524` = js.native
  @JSName("Inactive(anon)")
  var InactiveLeftparenthesisanonRightparenthesis: String = js.native
  @JSName("Inactive(file)")
  var InactiveLeftparenthesisfileRightparenthesis: String = js.native
  var KernelStack: String = js.native
  var Mapped: String = js.native
  var MemAvailable: String = js.native
  var MemFree: String = js.native
  var MemTotal: String = js.native
  var Mlocked: String = js.native
  var NFS_Unstable: String = js.native
  var PageTables: String = js.native
  var SReclaimable: String = js.native
  var SUnreclaim: String = js.native
  var Shmem: String = js.native
  var Slab: String = js.native
  var SwapCached: String = js.native
  var SwapFree: String = js.native
  var SwapTotal: String = js.native
  var Unevictable: String = js.native
  var VmallocChunk: String = js.native
  var VmallocTotal: String = js.native
  var VmallocUsed: String = js.native
  var Writeback: String = js.native
  var WritebackTmp: String = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(
    Active: String,
    ActiveLeftparenthesisanonRightparenthesis: String,
    ActiveLeftparenthesisfileRightparenthesis: String,
    AnonHugePages: String,
    AnonPages: String,
    Bounce: String,
    Buffers: String,
    Cached: String,
    CommitLimit: String,
    Committed_AS: String,
    DirectMap2M: String,
    DirectMap4k: String,
    Dirty: String,
    HugePages_Free: String,
    HugePages_Rsvd: String,
    HugePages_Surp: String,
    HugePages_Total: String,
    Hugepagesize: String,
    Inactive: `136524`,
    InactiveLeftparenthesisanonRightparenthesis: String,
    InactiveLeftparenthesisfileRightparenthesis: String,
    KernelStack: String,
    Mapped: String,
    MemAvailable: String,
    MemFree: String,
    MemTotal: String,
    Mlocked: String,
    NFS_Unstable: String,
    PageTables: String,
    SReclaimable: String,
    SUnreclaim: String,
    Shmem: String,
    Slab: String,
    SwapCached: String,
    SwapFree: String,
    SwapTotal: String,
    Unevictable: String,
    VmallocChunk: String,
    VmallocTotal: String,
    VmallocUsed: String,
    Writeback: String,
    WritebackTmp: String
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AnonHugePages = AnonHugePages.asInstanceOf[js.Any], AnonPages = AnonPages.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Buffers = Buffers.asInstanceOf[js.Any], Cached = Cached.asInstanceOf[js.Any], CommitLimit = CommitLimit.asInstanceOf[js.Any], Committed_AS = Committed_AS.asInstanceOf[js.Any], DirectMap2M = DirectMap2M.asInstanceOf[js.Any], DirectMap4k = DirectMap4k.asInstanceOf[js.Any], Dirty = Dirty.asInstanceOf[js.Any], HugePages_Free = HugePages_Free.asInstanceOf[js.Any], HugePages_Rsvd = HugePages_Rsvd.asInstanceOf[js.Any], HugePages_Surp = HugePages_Surp.asInstanceOf[js.Any], HugePages_Total = HugePages_Total.asInstanceOf[js.Any], Hugepagesize = Hugepagesize.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], KernelStack = KernelStack.asInstanceOf[js.Any], Mapped = Mapped.asInstanceOf[js.Any], MemAvailable = MemAvailable.asInstanceOf[js.Any], MemFree = MemFree.asInstanceOf[js.Any], MemTotal = MemTotal.asInstanceOf[js.Any], Mlocked = Mlocked.asInstanceOf[js.Any], NFS_Unstable = NFS_Unstable.asInstanceOf[js.Any], PageTables = PageTables.asInstanceOf[js.Any], SReclaimable = SReclaimable.asInstanceOf[js.Any], SUnreclaim = SUnreclaim.asInstanceOf[js.Any], Shmem = Shmem.asInstanceOf[js.Any], Slab = Slab.asInstanceOf[js.Any], SwapCached = SwapCached.asInstanceOf[js.Any], SwapFree = SwapFree.asInstanceOf[js.Any], SwapTotal = SwapTotal.asInstanceOf[js.Any], Unevictable = Unevictable.asInstanceOf[js.Any], VmallocChunk = VmallocChunk.asInstanceOf[js.Any], VmallocTotal = VmallocTotal.asInstanceOf[js.Any], VmallocUsed = VmallocUsed.asInstanceOf[js.Any], Writeback = Writeback.asInstanceOf[js.Any], WritebackTmp = WritebackTmp.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(anon)")(ActiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(file)")(ActiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(anon)")(InactiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(file)")(InactiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveLeftparenthesisanonRightparenthesis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active(anon)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveLeftparenthesisfileRightparenthesis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active(file)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnonHugePages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnonHugePages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnonPages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnonPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCached(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommitLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitted_AS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Committed_AS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectMap2M(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectMap2M")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectMap4k(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectMap4k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHugePages_Free(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HugePages_Free")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHugePages_Rsvd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HugePages_Rsvd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHugePages_Surp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HugePages_Surp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHugePages_Total(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HugePages_Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHugepagesize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hugepagesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive(value: `136524`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveLeftparenthesisanonRightparenthesis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inactive(anon)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveLeftparenthesisfileRightparenthesis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inactive(file)")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelStack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KernelStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapped(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemAvailable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemFree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemFree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMlocked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNFS_Unstable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NFS_Unstable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTables(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSReclaimable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SReclaimable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUnreclaim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUnreclaim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShmem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shmem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlab(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapCached(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwapCached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapFree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwapFree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwapTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnevictable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unevictable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmallocChunk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmallocChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmallocTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmallocTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmallocUsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VmallocUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Writeback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritebackTmp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WritebackTmp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

