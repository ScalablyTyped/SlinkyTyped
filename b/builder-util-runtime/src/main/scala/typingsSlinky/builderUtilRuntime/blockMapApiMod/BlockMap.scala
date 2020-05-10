package typingsSlinky.builderUtilRuntime.blockMapApiMod

import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.`1`
import typingsSlinky.builderUtilRuntime.builderUtilRuntimeStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockMap extends js.Object {
  var files: js.Array[BlockMapFile] = js.native
  var version: `1` | `2` = js.native
}

object BlockMap {
  @scala.inline
  def apply(files: js.Array[BlockMapFile], version: `1` | `2`): BlockMap = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockMap]
  }
  @scala.inline
  implicit class BlockMapOps[Self <: BlockMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[BlockMapFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

