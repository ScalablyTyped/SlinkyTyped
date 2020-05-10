package typingsSlinky.atom.mod

import typingsSlinky.atom.AnonLeadingContextLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScandalResult extends js.Object {
  var filePath: String = js.native
  var matches: js.Array[AnonLeadingContextLines] = js.native
}

object ScandalResult {
  @scala.inline
  def apply(filePath: String, matches: js.Array[AnonLeadingContextLines]): ScandalResult = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScandalResult]
  }
  @scala.inline
  implicit class ScandalResultOps[Self <: ScandalResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[AnonLeadingContextLines]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

