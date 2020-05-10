package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentsecuritypolicy extends js.Object {
  var content_security_policy: js.UndefOr[String] = js.native
  var pages: js.Array[String] = js.native
}

object AnonContentsecuritypolicy {
  @scala.inline
  def apply(pages: js.Array[String]): AnonContentsecuritypolicy = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentsecuritypolicy]
  }
  @scala.inline
  implicit class AnonContentsecuritypolicyOps[Self <: AnonContentsecuritypolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_security_policy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_security_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_security_policy")(js.undefined)
        ret
    }
  }
  
}

