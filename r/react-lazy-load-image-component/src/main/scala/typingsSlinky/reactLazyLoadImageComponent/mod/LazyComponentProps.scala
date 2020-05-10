package typingsSlinky.reactLazyLoadImageComponent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyComponentProps extends js.Object {
  var scrollPosition: ScrollPosition = js.native
}

object LazyComponentProps {
  @scala.inline
  def apply(scrollPosition: ScrollPosition): LazyComponentProps = {
    val __obj = js.Dynamic.literal(scrollPosition = scrollPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyComponentProps]
  }
  @scala.inline
  implicit class LazyComponentPropsOps[Self <: LazyComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollPosition(value: ScrollPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

