package typingsSlinky.handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecompileOptions extends CompileOptions {
  var destName: js.UndefOr[String] = js.native
  var srcName: js.UndefOr[String] = js.native
}

object PrecompileOptions {
  @scala.inline
  def apply(): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrecompileOptions]
  }
  @scala.inline
  implicit class PrecompileOptionsOps[Self <: PrecompileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destName")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcName")(js.undefined)
        ret
    }
  }
  
}

