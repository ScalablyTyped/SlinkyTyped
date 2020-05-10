package typingsSlinky.reactJss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUseStylesOptions extends BaseOptions {
  var name: js.UndefOr[String] = js.native
}

object CreateUseStylesOptions {
  @scala.inline
  def apply(): CreateUseStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUseStylesOptions]
  }
  @scala.inline
  implicit class CreateUseStylesOptionsOps[Self <: CreateUseStylesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

