package typingsSlinky.reactImageCrop.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsSlinky.reactImageCrop.reactImageCropStrings.anonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCropProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var circularCrop: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var crop: js.UndefOr[Crop] = js.native
  var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var imageAlt: js.UndefOr[String] = js.native
  var imageStyle: js.UndefOr[CSSProperties] = js.native
  var keepSelection: js.UndefOr[Boolean] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onImageError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Event, HTMLImageElement], Unit]] = js.native
  var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.native
  var renderComponent: js.UndefOr[TagMod[Any]] = js.native
  var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, TagMod[Any]]] = js.native
  var ruleOfThirds: js.UndefOr[Boolean] = js.native
  var src: String = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def onChange(crop: Crop, percentCrop: PercentCrop): Unit = js.native
}

object ReactCropProps {
  @scala.inline
  def apply(onChange: (Crop, PercentCrop) => Unit, src: String): ReactCropProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCropProps]
  }
  @scala.inline
  implicit class ReactCropPropsOps[Self <: ReactCropProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnChange(value: (Crop, PercentCrop) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
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
    def withCircularCrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularCrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircularCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circularCrop")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: Crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossorigin(value: anonymous | `use-credentials`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossorigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossorigin")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageError(value: /* event */ SyntheticEvent[Event, HTMLImageElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImageLoaded(value: /* target */ HTMLImageElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImageLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImageLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComponentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderComponent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderSelectionAddon(value: /* state */ js.Any => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectionAddon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderSelectionAddon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSelectionAddon")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleOfThirds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleOfThirds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleOfThirds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleOfThirds")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

