package typingsSlinky.pegjs.mod

import typingsSlinky.pegjs.pegjsStrings.globals
import typingsSlinky.pegjs.pegjsStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFormatGlobals extends BuildOptionsBase {
  /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
  var exportVar: js.UndefOr[js.Any] = js.native
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: globals = js.native
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source = js.native
}

object OutputFormatGlobals {
  @scala.inline
  def apply(format: globals, output: source): OutputFormatGlobals = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatGlobals]
  }
  @scala.inline
  implicit class OutputFormatGlobalsOps[Self <: OutputFormatGlobals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: globals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportVar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportVar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVar")(js.undefined)
        ret
    }
  }
  
}

