package typingsSlinky.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolver extends js.Object {
  var axis: js.Any = js.native
  var container: ContainerRef = js.native
  var isWindow: Boolean = js.native
}

object IResolver {
  @scala.inline
  def apply(axis: js.Any, container: ContainerRef, isWindow: Boolean): IResolver = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolver]
  }
  @scala.inline
  implicit class IResolverOps[Self <: IResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: ContainerRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

