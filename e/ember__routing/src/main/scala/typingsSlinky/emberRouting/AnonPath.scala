package typingsSlinky.emberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPath extends js.Object {
  var path: js.UndefOr[String] = js.native
  var resetNamespace: js.UndefOr[Boolean] = js.native
}

object AnonPath {
  @scala.inline
  def apply(): AnonPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPath]
  }
  @scala.inline
  implicit class AnonPathOps[Self <: AnonPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withResetNamespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetNamespace")(js.undefined)
        ret
    }
  }
  
}

