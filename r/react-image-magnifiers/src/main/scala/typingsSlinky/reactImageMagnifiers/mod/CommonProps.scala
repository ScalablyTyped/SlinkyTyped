package typingsSlinky.reactImageMagnifiers.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var cursorStyle: js.UndefOr[String] = js.undefined
  var imageAlt: js.UndefOr[String] = js.undefined
  var imageSrc: String
  var largeImageSrc: js.UndefOr[String] = js.undefined
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Event, Element], Unit]] = js.undefined
  var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Event, Element], Unit]] = js.undefined
  var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, TagMod[Any]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    imageSrc: String,
    className: String = null,
    cursorStyle: String = null,
    imageAlt: String = null,
    largeImageSrc: String = null,
    onImageLoad: /* ev */ SyntheticEvent[Event, Element] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Event, Element] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    renderOverlay: /* state */ Boolean => TagMod[Any] = null,
    style: CSSProperties = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

