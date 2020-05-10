package typingsSlinky.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockIndice extends ArgType {
  var blockIndices: Double = js.native
}

object BlockIndice {
  @scala.inline
  def apply(blockIndices: Double): BlockIndice = {
    val __obj = js.Dynamic.literal(blockIndices = blockIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIndice]
  }
  @scala.inline
  implicit class BlockIndiceOps[Self <: BlockIndice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIndices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIndices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

