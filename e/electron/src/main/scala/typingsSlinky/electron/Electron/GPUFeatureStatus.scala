package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUFeatureStatus extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/gpu-feature-status
  /**
    * Canvas.
    */
  var `2d_canvas`: String = js.native
  
  /**
    * Flash.
    */
  var flash_3d: String = js.native
  
  /**
    * Flash Stage3D.
    */
  var flash_stage3d: String = js.native
  
  /**
    * Flash Stage3D Baseline profile.
    */
  var flash_stage3d_baseline: String = js.native
  
  /**
    * Compositing.
    */
  var gpu_compositing: String = js.native
  
  /**
    * Multiple Raster Threads.
    */
  var multiple_raster_threads: String = js.native
  
  /**
    * Native GpuMemoryBuffers.
    */
  var native_gpu_memory_buffers: String = js.native
  
  /**
    * Rasterization.
    */
  var rasterization: String = js.native
  
  /**
    * Video Decode.
    */
  var video_decode: String = js.native
  
  /**
    * Video Encode.
    */
  var video_encode: String = js.native
  
  /**
    * VPx Video Decode.
    */
  var vpx_decode: String = js.native
  
  /**
    * WebGL.
    */
  var webgl: String = js.native
  
  /**
    * WebGL2.
    */
  var webgl2: String = js.native
}
object GPUFeatureStatus {
  
  @scala.inline
  def apply(
    `2d_canvas`: String,
    flash_3d: String,
    flash_stage3d: String,
    flash_stage3d_baseline: String,
    gpu_compositing: String,
    multiple_raster_threads: String,
    native_gpu_memory_buffers: String,
    rasterization: String,
    video_decode: String,
    video_encode: String,
    vpx_decode: String,
    webgl: String,
    webgl2: String
  ): GPUFeatureStatus = {
    val __obj = js.Dynamic.literal(flash_3d = flash_3d.asInstanceOf[js.Any], flash_stage3d = flash_stage3d.asInstanceOf[js.Any], flash_stage3d_baseline = flash_stage3d_baseline.asInstanceOf[js.Any], gpu_compositing = gpu_compositing.asInstanceOf[js.Any], multiple_raster_threads = multiple_raster_threads.asInstanceOf[js.Any], native_gpu_memory_buffers = native_gpu_memory_buffers.asInstanceOf[js.Any], rasterization = rasterization.asInstanceOf[js.Any], video_decode = video_decode.asInstanceOf[js.Any], video_encode = video_encode.asInstanceOf[js.Any], vpx_decode = vpx_decode.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any], webgl2 = webgl2.asInstanceOf[js.Any])
    __obj.updateDynamic("2d_canvas")(`2d_canvas`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUFeatureStatus]
  }
  
  @scala.inline
  implicit class GPUFeatureStatusMutableBuilder[Self <: GPUFeatureStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set2d_canvas(value: String): Self = StObject.set(x, "2d_canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash_3d(value: String): Self = StObject.set(x, "flash_3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash_stage3d(value: String): Self = StObject.set(x, "flash_stage3d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash_stage3d_baseline(value: String): Self = StObject.set(x, "flash_stage3d_baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpu_compositing(value: String): Self = StObject.set(x, "gpu_compositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple_raster_threads(value: String): Self = StObject.set(x, "multiple_raster_threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative_gpu_memory_buffers(value: String): Self = StObject.set(x, "native_gpu_memory_buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterization(value: String): Self = StObject.set(x, "rasterization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_decode(value: String): Self = StObject.set(x, "video_decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_encode(value: String): Self = StObject.set(x, "video_encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpx_decode(value: String): Self = StObject.set(x, "vpx_decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebgl(value: String): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebgl2(value: String): Self = StObject.set(x, "webgl2", value.asInstanceOf[js.Any])
  }
}
