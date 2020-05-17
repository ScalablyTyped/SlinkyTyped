package typingsSlinky.baseui.toastMod

import typingsSlinky.baseui.anon.ReadonlyToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToasterContainerState extends js.Object {
  var isMounted: Boolean = js.native
  var toasts: ReadonlyToastProps = js.native
}

object ToasterContainerState {
  @scala.inline
  def apply(isMounted: Boolean, toasts: ReadonlyToastProps): ToasterContainerState = {
    val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterContainerState]
  }
  @scala.inline
  implicit class ToasterContainerStateOps[Self <: ToasterContainerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMounted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToasts(value: ReadonlyToastProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toasts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

