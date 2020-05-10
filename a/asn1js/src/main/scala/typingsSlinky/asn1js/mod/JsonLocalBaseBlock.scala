package typingsSlinky.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonLocalBaseBlock extends js.Object {
  var blockLength: Double = js.native
  var blockName: String = js.native
  var error: String = js.native
  var valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
  var warnings: js.Array[String] = js.native
}

object JsonLocalBaseBlock {
  @scala.inline
  def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    valueBeforeDecode: js.typedarray.ArrayBuffer,
    warnings: js.Array[String]
  ): JsonLocalBaseBlock = {
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
  @scala.inline
  implicit class JsonLocalBaseBlockOps[Self <: JsonLocalBaseBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueBeforeDecode(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBeforeDecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

