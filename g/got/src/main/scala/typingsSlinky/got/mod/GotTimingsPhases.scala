package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotTimingsPhases extends js.Object {
  
  var dns: Double = js.native
  
  var download: Double = js.native
  
  var firstByte: Double = js.native
  
  var request: Double = js.native
  
  var tcp: Double = js.native
  
  var total: Double = js.native
  
  @JSName("wait")
  var wait_FGotTimingsPhases: Double = js.native
}
object GotTimingsPhases {
  
  @scala.inline
  def apply(
    dns: Double,
    download: Double,
    firstByte: Double,
    request: Double,
    tcp: Double,
    total: Double,
    wait: Double
  ): GotTimingsPhases = {
    val __obj = js.Dynamic.literal(dns = dns.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], firstByte = firstByte.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tcp = tcp.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotTimingsPhases]
  }
  
  @scala.inline
  implicit class GotTimingsPhasesOps[Self <: GotTimingsPhases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDns(value: Double): Self = this.set("dns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: Double): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstByte(value: Double): Self = this.set("firstByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Double): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcp(value: Double): Self = this.set("tcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
  }
}
