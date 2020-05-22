package typingsSlinky.reactImageMagnifiers.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlassMagnifierProps extends CommonProps {
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  var magnifierBackgroundColor: js.UndefOr[String] = js.undefined
  var magnifierBorderColor: js.UndefOr[String] = js.undefined
  var magnifierBorderSize: js.UndefOr[Double] = js.undefined
  var magnifierOffsetX: js.UndefOr[Double] = js.undefined
  var magnifierOffsetY: js.UndefOr[Double] = js.undefined
  var magnifierSize: js.UndefOr[String | Double] = js.undefined
  var square: js.UndefOr[Boolean] = js.undefined
}

object GlassMagnifierProps {
  @scala.inline
  def apply(
    imageSrc: String,
    allowOverflow: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cursorStyle: String = null,
    imageAlt: String = null,
    largeImageSrc: String = null,
    magnifierBackgroundColor: String = null,
    magnifierBorderColor: String = null,
    magnifierBorderSize: js.UndefOr[Double] = js.undefined,
    magnifierOffsetX: js.UndefOr[Double] = js.undefined,
    magnifierOffsetY: js.UndefOr[Double] = js.undefined,
    magnifierSize: String | Double = null,
    onImageLoad: /* ev */ SyntheticEvent[Event, Element] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Event, Element] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    renderOverlay: /* state */ Boolean => TagMod[Any] = null,
    square: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): GlassMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (magnifierBackgroundColor != null) __obj.updateDynamic("magnifierBackgroundColor")(magnifierBackgroundColor.asInstanceOf[js.Any])
    if (magnifierBorderColor != null) __obj.updateDynamic("magnifierBorderColor")(magnifierBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(magnifierBorderSize)) __obj.updateDynamic("magnifierBorderSize")(magnifierBorderSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magnifierOffsetX)) __obj.updateDynamic("magnifierOffsetX")(magnifierOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magnifierOffsetY)) __obj.updateDynamic("magnifierOffsetY")(magnifierOffsetY.get.asInstanceOf[js.Any])
    if (magnifierSize != null) __obj.updateDynamic("magnifierSize")(magnifierSize.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (!js.isUndefined(square)) __obj.updateDynamic("square")(square.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlassMagnifierProps]
  }
}

