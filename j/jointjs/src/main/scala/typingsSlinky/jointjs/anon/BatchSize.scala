package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.mod.dia.Paper
import typingsSlinky.jointjs.mod.dia.Paper.ProgressCallback
import typingsSlinky.jointjs.mod.dia.Paper.UpdateStats
import typingsSlinky.jointjs.mod.dia.Paper.ViewportCallback
import typingsSlinky.jointjs.mod.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSize extends StObject {
  
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
  implicit class BatchSizeMutableBuilder[Self <: BatchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setMountBatchSize(value: Double): Self = StObject.set(x, "mountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountBatchSizeUndefined: Self = StObject.set(x, "mountBatchSize", js.undefined)
    
    @scala.inline
    def setProgress(
      value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => scala.Unit
    ): Self = StObject.set(x, "progress", js.Any.fromFunction5(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setUnmountBatchSize(value: Double): Self = StObject.set(x, "unmountBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmountBatchSizeUndefined: Self = StObject.set(x, "unmountBatchSize", js.undefined)
    
    @scala.inline
    def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
