package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolutions extends js.Object {
  var resolutionsPerAuthority: js.Array[Resolution] = js.native
}

object Resolutions {
  @scala.inline
  def apply(resolutionsPerAuthority: js.Array[Resolution]): Resolutions = {
    val __obj = js.Dynamic.literal(resolutionsPerAuthority = resolutionsPerAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutions]
  }
  @scala.inline
  implicit class ResolutionsOps[Self <: Resolutions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolutionsPerAuthority(value: js.Array[Resolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolutionsPerAuthority")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

