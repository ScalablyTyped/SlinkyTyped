package typingsSlinky.protobufjsPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/pool", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * A general purpose buffer pool.
    * @memberof util
    * @function
    * @param {PoolAllocator} alloc Allocator
    * @param {PoolSlicer} slice Slicer
    * @param {number} [size=8192] Slab size
    * @returns {PoolAllocator} Pooled allocator
    */
  def apply(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  def apply(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
  
  /**
    * An allocator as used by {@link util.pool}.
    * @typedef PoolAllocator
    * @type {function}
    * @param {number} size Buffer size
    * @returns {Uint8Array} Buffer
    */
  type PoolAllocator = js.Function1[/* size */ Double, js.typedarray.Uint8Array]
  
  /**
    * A slicer as used by {@link util.pool}.
    * @typedef PoolSlicer
    * @type {function}
    * @param {number} start Start offset
    * @param {number} end End offset
    * @returns {Uint8Array} Buffer slice
    * @this {Uint8Array}
    */
  type PoolSlicer = js.ThisFunction2[
    /* this */ js.typedarray.Uint8Array, 
    /* start */ Double, 
    /* end */ Double, 
    js.typedarray.Uint8Array
  ]
}
