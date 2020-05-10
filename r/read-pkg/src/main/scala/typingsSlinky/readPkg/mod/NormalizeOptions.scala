package typingsSlinky.readPkg.mod

import typingsSlinky.readPkg.readPkgBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeOptions extends Options {
  @JSName("normalize")
  val normalize_NormalizeOptions: js.UndefOr[`true`] = js.native
}

object NormalizeOptions {
  @scala.inline
  def apply(): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeOptions]
  }
  @scala.inline
  implicit class NormalizeOptionsOps[Self <: NormalizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormalize(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
  }
  
}

