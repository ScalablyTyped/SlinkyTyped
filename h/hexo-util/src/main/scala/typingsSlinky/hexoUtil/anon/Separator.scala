package typingsSlinky.hexoUtil.anon

import typingsSlinky.hexoUtil.hexoUtilNumbers.`1`
import typingsSlinky.hexoUtil.hexoUtilNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Separator extends js.Object {
  var separator: js.UndefOr[String] = js.native
  var transform: js.UndefOr[`1` | `2`] = js.native
}

object Separator {
  @scala.inline
  def apply(): Separator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Separator]
  }
  @scala.inline
  implicit class SeparatorOps[Self <: Separator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

