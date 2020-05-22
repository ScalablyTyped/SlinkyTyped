package typingsSlinky.reactVega.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVega.anon.Bottom
import typingsSlinky.std.Record
import typingsSlinky.vegaTypings.mod.View
import typingsSlinky.vegaTypings.runtimeMod.Item
import typingsSlinky.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VegaPropsWithSpec extends VegaPropsWithoutSpec {
  var spec: Spec
}

object VegaPropsWithSpec {
  @scala.inline
  def apply(
    spec: Spec,
    background: String = null,
    className: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    logLevel: js.UndefOr[Double] = js.undefined,
    onNewView: /* view */ View => Unit = null,
    onParseError: /* error */ js.Error => Unit = null,
    padding: Double | Bottom = null,
    renderer: String = null,
    style: CSSProperties = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): VegaPropsWithSpec = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logLevel)) __obj.updateDynamic("logLevel")(logLevel.get.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1(onNewView))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1(onParseError))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4(tooltip))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VegaPropsWithSpec]
  }
}

