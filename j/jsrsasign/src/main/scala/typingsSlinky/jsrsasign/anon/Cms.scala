package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cms extends js.Object {
  var cms: String = js.native
}

object Cms {
  @scala.inline
  def apply(cms: String): Cms = {
    val __obj = js.Dynamic.literal(cms = cms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cms]
  }
  @scala.inline
  implicit class CmsOps[Self <: Cms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

