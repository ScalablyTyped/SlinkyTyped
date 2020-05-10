package typingsSlinky.assertEqualJsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsssertOptions extends js.Object {
  var sanitize: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
}

object AsssertOptions {
  @scala.inline
  def apply(): AsssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsssertOptions]
  }
  @scala.inline
  implicit class AsssertOptionsOps[Self <: AsssertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSanitize(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
  }
  
}

