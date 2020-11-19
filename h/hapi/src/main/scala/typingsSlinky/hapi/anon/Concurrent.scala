package typingsSlinky.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concurrent extends js.Object {
  
  /**
    * Max concurrent requests.
    */
  var concurrent: js.UndefOr[Double] = js.native
  
  /**
    * maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response.
    * Defaults to 0 (no limit).
    */
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  
  /** maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit). */
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  
  /**
    * maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var maxRssBytes: js.UndefOr[Double] = js.native
  
  /** the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling). */
  var sampleInterval: js.UndefOr[Double] = js.native
}
object Concurrent {
  
  @scala.inline
  def apply(): Concurrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Concurrent]
  }
  
  @scala.inline
  implicit class ConcurrentOps[Self <: Concurrent] (val x: Self) extends AnyVal {
    
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
    def setConcurrent(value: Double): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    
    @scala.inline
    def setMaxEventLoopDelay(value: Double): Self = this.set("maxEventLoopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEventLoopDelay: Self = this.set("maxEventLoopDelay", js.undefined)
    
    @scala.inline
    def setMaxHeapUsedBytes(value: Double): Self = this.set("maxHeapUsedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeapUsedBytes: Self = this.set("maxHeapUsedBytes", js.undefined)
    
    @scala.inline
    def setMaxRssBytes(value: Double): Self = this.set("maxRssBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRssBytes: Self = this.set("maxRssBytes", js.undefined)
    
    @scala.inline
    def setSampleInterval(value: Double): Self = this.set("sampleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleInterval: Self = this.set("sampleInterval", js.undefined)
  }
}
