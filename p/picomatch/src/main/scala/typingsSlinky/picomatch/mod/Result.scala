package typingsSlinky.picomatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var glob: String = js.native
  var input: String = js.native
  var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['isMatch'] */ js.Any = js.native
  var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['match'] */ js.Any = js.native
  var output: String = js.native
  var posix: Boolean = js.native
  var regex: js.RegExp = js.native
  var state: js.Any = js.native
}

object Result {
  @scala.inline
  def apply(
    glob: String,
    input: String,
    isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['isMatch'] */ js.Any,
    `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['match'] */ js.Any,
    output: String,
    posix: Boolean,
    regex: js.RegExp,
    state: js.Any
  ): Result = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMatch(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['isMatch'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.AnonFormat, test ? : {}): picomatch.AnonIsMatch>['match'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

