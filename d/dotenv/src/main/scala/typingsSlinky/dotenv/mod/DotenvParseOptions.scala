package typingsSlinky.dotenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvParseOptions extends js.Object {
  /**
    * You may turn on logging to help debug why certain keys or values are not being set as you expect.
    */
  var debug: js.UndefOr[Boolean] = js.native
}

object DotenvParseOptions {
  @scala.inline
  def apply(): DotenvParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvParseOptions]
  }
  @scala.inline
  implicit class DotenvParseOptionsOps[Self <: DotenvParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
  }
  
}

