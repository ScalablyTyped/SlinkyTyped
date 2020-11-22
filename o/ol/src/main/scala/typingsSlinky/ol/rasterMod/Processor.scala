package typingsSlinky.ol.rasterMod

import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Raster", "Processor")
@js.native
class Processor protected ()
  extends typingsSlinky.ol.disposableMod.default {
  def this(config: ProcessorOptions) = this()
  
  /**
    * Dispatch a job.
    */
  def _dispatch(): Unit = js.native
  
  /**
    * Add a job to the queue.
    */
  def _enqueue(job: js.Any): Unit = js.native
  
  /**
    * Handle messages from the worker.
    */
  def _onWorkerMessage(index: Double, event: MessageEvent): Unit = js.native
  
  /**
    * Resolve a job.  If there are no more worker threads, the processor callback
    * will be called.
    */
  def _resolveJob(): Unit = js.native
  
  /**
    * Run operation on input data.
    */
  def process(
    inputs: js.Array[js.Array[_] | ImageData],
    meta: js.Any,
    callback: js.Function3[/* p0 */ js.Error, /* p1 */ ImageData, /* p2 */ js.Object, Unit]
  ): Unit = js.native
}
