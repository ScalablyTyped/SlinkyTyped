package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuOptions extends js.Object {
  
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}
object CpuOptions {
  
  @scala.inline
  def apply(): CpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CpuOptions]
  }
  
  @scala.inline
  implicit class CpuOptionsOps[Self <: CpuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoreCount(value: Integer): Self = this.set("CoreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreCount: Self = this.set("CoreCount", js.undefined)
    
    @scala.inline
    def setThreadsPerCore(value: Integer): Self = this.set("ThreadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadsPerCore: Self = this.set("ThreadsPerCore", js.undefined)
  }
}
