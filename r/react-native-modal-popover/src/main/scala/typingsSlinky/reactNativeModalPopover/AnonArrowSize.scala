package typingsSlinky.reactNativeModalPopover

import typingsSlinky.propTypes.mod.InferProps
import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrowSize extends js.Object {
  var arrowSize: Requireable[InferProps[AnonX]] = js.native
  var arrowStyle: Requireable[_] = js.native
  var backgroundStyle: Requireable[_] = js.native
  var contentStyle: Requireable[_] = js.native
  var displayArea: Requireable[InferProps[AnonHeight]] = js.native
  var duration: Requireable[Double] = js.native
  var easing: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var fromRect: Requireable[InferProps[AnonHeight]] = js.native
  var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onDismiss: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var placement: Requireable[String] = js.native
  var popoverStyle: Requireable[_] = js.native
  var visible: Requireable[Boolean] = js.native
}

object AnonArrowSize {
  @scala.inline
  def apply(
    arrowSize: Requireable[InferProps[AnonX]],
    arrowStyle: Requireable[_],
    backgroundStyle: Requireable[_],
    contentStyle: Requireable[_],
    displayArea: Requireable[InferProps[AnonHeight]],
    duration: Requireable[Double],
    easing: Requireable[js.Function1[/* repeated */ _, _]],
    fromRect: Requireable[InferProps[AnonHeight]],
    onClose: Requireable[js.Function1[/* repeated */ _, _]],
    onDismiss: Requireable[js.Function1[/* repeated */ _, _]],
    placement: Requireable[String],
    popoverStyle: Requireable[_],
    visible: Requireable[Boolean]
  ): AnonArrowSize = {
    val __obj = js.Dynamic.literal(arrowSize = arrowSize.asInstanceOf[js.Any], arrowStyle = arrowStyle.asInstanceOf[js.Any], backgroundStyle = backgroundStyle.asInstanceOf[js.Any], contentStyle = contentStyle.asInstanceOf[js.Any], displayArea = displayArea.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], fromRect = fromRect.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverStyle = popoverStyle.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrowSize]
  }
  @scala.inline
  implicit class AnonArrowSizeOps[Self <: AnonArrowSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowSize(value: Requireable[InferProps[AnonX]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowStyle(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundStyle(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentStyle(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayArea(value: Requireable[InferProps[AnonHeight]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEasing(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRect(value: Requireable[InferProps[AnonHeight]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDismiss(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopoverStyle(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

