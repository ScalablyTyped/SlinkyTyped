package typingsSlinky.rollup.mod

import typingsSlinky.node.Buffer
import typingsSlinky.rollup.rollupBooleans.`true`
import typingsSlinky.rollup.rollupStrings.asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputAsset extends js.Object {
  var fileName: String = js.native
  /** @deprecated Accessing "isAsset" on files in the bundle is deprecated, please use "type === \'asset\'" instead */
  var isAsset: `true` = js.native
  var source: String | Buffer = js.native
  var `type`: asset = js.native
}

object OutputAsset {
  @scala.inline
  def apply(fileName: String, isAsset: `true`, source: String | Buffer, `type`: asset): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isAsset = isAsset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputAsset]
  }
  @scala.inline
  implicit class OutputAssetOps[Self <: OutputAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAsset(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

