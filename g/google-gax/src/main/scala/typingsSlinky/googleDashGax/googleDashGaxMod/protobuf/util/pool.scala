package typingsSlinky.googleDashGax.googleDashGaxMod.protobuf.util

import typingsSlinky.protobufjs.protobufjsMod.PoolAllocator
import typingsSlinky.protobufjs.protobufjsMod.PoolSlicer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "protobuf.util.pool")
@js.native
object pool extends js.Object {
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  def apply(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  def apply(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
}

