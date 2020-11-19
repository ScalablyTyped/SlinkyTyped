package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Paper
import typingsSlinky.jointjs.mod.dia.Paper.ProgressCallback
import typingsSlinky.jointjs.mod.dia.Paper.UpdateStats
import typingsSlinky.jointjs.mod.dia.Paper.ViewportCallback
import typingsSlinky.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSize extends js.Object {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var mountBatchSize: js.UndefOr[Double] = js.native
  
  var progress: js.UndefOr[ProgressCallback] = js.native
  
  var unmountBatchSize: js.UndefOr[Double] = js.native
  
  var viewport: js.UndefOr[ViewportCallback] = js.native
}
object BatchSize {
  
  @scala.inline
  def apply(): BatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSize]
  }
  
  @scala.inline
  implicit class BatchSizeOps[Self <: BatchSize] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setMountBatchSize(value: Double): Self = this.set("mountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountBatchSize: Self = this.set("mountBatchSize", js.undefined)
    
    @scala.inline
    def setProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = this.set("progress", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setUnmountBatchSize(value: Double): Self = this.set("unmountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountBatchSize: Self = this.set("unmountBatchSize", js.undefined)
    
    @scala.inline
    def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = this.set("viewport", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
