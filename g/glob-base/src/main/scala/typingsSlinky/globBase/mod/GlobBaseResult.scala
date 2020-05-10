package typingsSlinky.globBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobBaseResult extends js.Object {
  var base: String = js.native
  var glob: String = js.native
  var isGlob: Boolean = js.native
}

object GlobBaseResult {
  @scala.inline
  def apply(base: String, glob: String, isGlob: Boolean): GlobBaseResult = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobBaseResult]
  }
  @scala.inline
  implicit class GlobBaseResultOps[Self <: GlobBaseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlob")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

