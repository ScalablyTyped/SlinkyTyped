package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkData extends js.Object {
  /**
    * the last byte of the current chunk
    */
  var endByte: Double = js.native
  /**
    * the 0-based index of the associated partition
    */
  var partIndex: Double = js.native
  /**
    * the byte offset of the current chunk
    */
  var startByte: Double = js.native
  /**
    * the total number of partitions associated with the `File` or `Blob`
    */
  var totalParts: Double = js.native
}

object ChunkData {
  @scala.inline
  def apply(endByte: Double, partIndex: Double, startByte: Double, totalParts: Double): ChunkData = {
    val __obj = js.Dynamic.literal(endByte = endByte.asInstanceOf[js.Any], partIndex = partIndex.asInstanceOf[js.Any], startByte = startByte.asInstanceOf[js.Any], totalParts = totalParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkData]
  }
  @scala.inline
  implicit class ChunkDataOps[Self <: ChunkData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartByte(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalParts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalParts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

