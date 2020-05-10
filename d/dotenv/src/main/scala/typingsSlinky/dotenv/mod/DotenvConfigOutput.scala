package typingsSlinky.dotenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvConfigOutput extends js.Object {
  var error: js.UndefOr[js.Error] = js.native
  var parsed: js.UndefOr[DotenvParseOutput] = js.native
}

object DotenvConfigOutput {
  @scala.inline
  def apply(): DotenvConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvConfigOutput]
  }
  @scala.inline
  implicit class DotenvConfigOutputOps[Self <: DotenvConfigOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withParsed(value: DotenvParseOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(js.undefined)
        ret
    }
  }
  
}

