package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAABBOptions extends js.Object {
  var lowerBound: js.UndefOr[Vec3] = js.native
  var upperBound: js.UndefOr[Vec3] = js.native
}

object IAABBOptions {
  @scala.inline
  def apply(): IAABBOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAABBOptions]
  }
  @scala.inline
  implicit class IAABBOptionsOps[Self <: IAABBOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerBound(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBound(value: Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(js.undefined)
        ret
    }
  }
  
}

