package typingsSlinky.jss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGenerateIdOptions extends js.Object {
  var minify: js.UndefOr[Boolean] = js.native
}

object CreateGenerateIdOptions {
  @scala.inline
  def apply(): CreateGenerateIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGenerateIdOptions]
  }
  @scala.inline
  implicit class CreateGenerateIdOptionsOps[Self <: CreateGenerateIdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
  }
  
}

