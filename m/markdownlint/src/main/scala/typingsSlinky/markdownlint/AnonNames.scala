package typingsSlinky.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNames extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.native
  var names: js.UndefOr[js.Array[String] | Null] = js.native
}

object AnonNames {
  @scala.inline
  def apply(): AnonNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonNames]
  }
  @scala.inline
  implicit class AnonNamesOps[Self <: AnonNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode_blocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode_blocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withNamesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(null)
        ret
    }
  }
  
}

