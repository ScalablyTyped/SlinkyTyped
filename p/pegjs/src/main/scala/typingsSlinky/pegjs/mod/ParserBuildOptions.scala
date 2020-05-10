package typingsSlinky.pegjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserBuildOptions extends BuildOptionsBase {
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: js.UndefOr[typingsSlinky.pegjs.pegjsStrings.parser] = js.native
}

object ParserBuildOptions {
  @scala.inline
  def apply(): ParserBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserBuildOptions]
  }
  @scala.inline
  implicit class ParserBuildOptionsOps[Self <: ParserBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: typingsSlinky.pegjs.pegjsStrings.parser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

