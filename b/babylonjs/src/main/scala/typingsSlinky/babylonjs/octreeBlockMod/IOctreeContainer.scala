package typingsSlinky.babylonjs.octreeBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOctreeContainer[T] extends js.Object {
  /**
    * Blocks within the octree
    */
  var blocks: js.Array[OctreeBlock[T]] = js.native
}

object IOctreeContainer {
  @scala.inline
  def apply[T](blocks: js.Array[OctreeBlock[T]]): IOctreeContainer[T] = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOctreeContainer[T]]
  }
  @scala.inline
  implicit class IOctreeContainerOps[Self[t] <: IOctreeContainer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBlocks(value: js.Array[OctreeBlock[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

