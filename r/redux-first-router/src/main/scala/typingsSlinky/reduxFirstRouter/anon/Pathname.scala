package typingsSlinky.reduxFirstRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pathname extends js.Object {
  var pathname: String = js.native
}

object Pathname {
  @scala.inline
  def apply(pathname: String): Pathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
  @scala.inline
  implicit class PathnameOps[Self <: Pathname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

