package typingsSlinky.fastCsv.scannerMod

import typingsSlinky.fastCsv.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScannerArgs extends js.Object {
  var cursor: js.UndefOr[Double] = js.native
  var hasMoreData: Boolean = js.native
  var line: String = js.native
  var parserOptions: ParserOptions = js.native
}

object ScannerArgs {
  @scala.inline
  def apply(hasMoreData: Boolean, line: String, parserOptions: ParserOptions): ScannerArgs = {
    val __obj = js.Dynamic.literal(hasMoreData = hasMoreData.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScannerArgs]
  }
  @scala.inline
  implicit class ScannerArgsOps[Self <: ScannerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserOptions(value: ParserOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
  }
  
}

