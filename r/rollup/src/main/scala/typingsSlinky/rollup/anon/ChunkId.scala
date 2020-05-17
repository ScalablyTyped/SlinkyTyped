package typingsSlinky.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkId extends js.Object {
  var chunkId: String = js.native
  var format: String = js.native
  var moduleId: String = js.native
}

object ChunkId {
  @scala.inline
  def apply(chunkId: String, format: String, moduleId: String): ChunkId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkId]
  }
  @scala.inline
  implicit class ChunkIdOps[Self <: ChunkId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

