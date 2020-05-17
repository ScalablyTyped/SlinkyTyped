package typingsSlinky.reactToastNotifications.mod

import slinky.core.TagMod
import typingsSlinky.reactToastNotifications.anon.Toast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastProviderProps extends js.Object {
  var autoDismiss: js.UndefOr[Boolean | Double] = js.native
  var autoDismissTimeout: js.UndefOr[Double] = js.native
  var children: TagMod[Any] = js.native
  var components: js.UndefOr[Toast] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
}

object ToastProviderProps {
  @scala.inline
  def apply(): ToastProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProviderProps]
  }
  @scala.inline
  implicit class ToastProviderPropsOps[Self <: ToastProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDismiss(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDismissTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismissTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDismissTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDismissTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: Toast): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

