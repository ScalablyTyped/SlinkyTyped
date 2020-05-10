package typingsSlinky.confirmdialog.options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait confirmOptions extends js.Object {
  var autoClose: js.UndefOr[String] = js.native
  var backgroundDismiss: js.UndefOr[js.Any] = js.native
  var backgroundDismissAnimation: js.UndefOr[String] = js.native
  var bootstrapClasses: js.UndefOr[js.Any] = js.native
  var boxWidth: js.UndefOr[String] = js.native
  var buttons: js.UndefOr[js.Any] = js.native
  var closeIcon: js.UndefOr[js.Any] = js.native
  var closeIconClass: js.UndefOr[String] = js.native
  var columnClass: js.UndefOr[String] = js.native
  var containerFluid: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[js.Any] = js.native
  var contentLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var dragWindowBorder: js.UndefOr[Boolean] = js.native
  var dragWindowGap: js.UndefOr[Double] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var escapeKey: js.UndefOr[String | Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var lazyOpen: js.UndefOr[Boolean] = js.native
  var onAction: js.UndefOr[js.Function0[Unit]] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onContentReady: js.UndefOr[js.Any] = js.native
  var onDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpenBefore: js.UndefOr[js.Function0[Unit]] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeAnimated: js.UndefOr[Boolean] = js.native
  var useBootstrap: js.UndefOr[Boolean] = js.native
}

object confirmOptions {
  @scala.inline
  def apply(): confirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[confirmOptions]
  }
  @scala.inline
  implicit class confirmOptionsOps[Self <: confirmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundDismiss(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundDismissAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundDismissAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundDismissAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundDismissAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapClasses(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerFluid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerFluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerFluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerFluid")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLoaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutContentLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withDragWindowBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragWindowBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragWindowBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragWindowBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withDragWindowGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragWindowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragWindowGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragWindowGap")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeKey(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAction(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentReady(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContentReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentReady")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenBefore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenBefore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnOpenBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnimated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeAnimated")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBootstrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBootstrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBootstrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBootstrap")(js.undefined)
        ret
    }
  }
  
}

