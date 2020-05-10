package typingsSlinky.betterSqlite3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PragmaOptions extends js.Object {
  var simple: js.UndefOr[Boolean] = js.native
}

object PragmaOptions {
  @scala.inline
  def apply(): PragmaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PragmaOptions]
  }
  @scala.inline
  implicit class PragmaOptionsOps[Self <: PragmaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
  }
  
}

