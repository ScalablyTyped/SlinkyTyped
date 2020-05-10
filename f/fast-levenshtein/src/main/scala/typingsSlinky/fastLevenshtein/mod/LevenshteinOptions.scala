package typingsSlinky.fastLevenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevenshteinOptions extends js.Object {
  var useCollator: js.UndefOr[Boolean] = js.native
}

object LevenshteinOptions {
  @scala.inline
  def apply(): LevenshteinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevenshteinOptions]
  }
  @scala.inline
  implicit class LevenshteinOptionsOps[Self <: LevenshteinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseCollator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCollator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCollator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCollator")(js.undefined)
        ret
    }
  }
  
}

