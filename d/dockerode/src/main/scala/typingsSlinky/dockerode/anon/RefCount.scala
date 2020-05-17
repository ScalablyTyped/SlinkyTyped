package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefCount extends js.Object {
  var RefCount: Double = js.native
  var Size: Double = js.native
}

object RefCount {
  @scala.inline
  def apply(RefCount: Double, Size: Double): RefCount = {
    val __obj = js.Dynamic.literal(RefCount = RefCount.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCount]
  }
  @scala.inline
  implicit class RefCountOps[Self <: RefCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRefCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

