package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollRegisterConfig extends js.Object {
  var container: ContainerRef = js.native
  var throttle: Double = js.native
}

object IScrollRegisterConfig {
  @scala.inline
  def apply(container: ContainerRef, throttle: Double): IScrollRegisterConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollRegisterConfig]
  }
  @scala.inline
  implicit class IScrollRegisterConfigOps[Self <: IScrollRegisterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: ContainerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

