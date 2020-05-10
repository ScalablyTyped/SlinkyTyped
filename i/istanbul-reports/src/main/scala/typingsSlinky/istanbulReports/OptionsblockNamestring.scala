package typingsSlinky.istanbulReports

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined istanbul-reports.istanbul-reports.Options & {  blockName  :string} */
@js.native
trait OptionsblockNamestring extends js.Object {
  var blockName: String = js.native
  var file: String = js.native
}

object OptionsblockNamestring {
  @scala.inline
  def apply(blockName: String, file: String): OptionsblockNamestring = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsblockNamestring]
  }
  @scala.inline
  implicit class OptionsblockNamestringOps[Self <: OptionsblockNamestring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

