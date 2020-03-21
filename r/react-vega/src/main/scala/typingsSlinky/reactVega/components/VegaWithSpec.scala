package typingsSlinky.reactVega.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactVega.AnonBottom
import typingsSlinky.reactVega.mod.VegaPropsWithoutSpec
import typingsSlinky.std.Record
import typingsSlinky.vegaTypings.mod.View
import typingsSlinky.vegaTypings.runtimeMod.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VegaWithSpec
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVega.mod.VegaWithSpec] {
  @JSImport("react-vega", "VegaWithSpec")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    background: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    logLevel: Int | Double = null,
    onNewView: /* view */ View => Unit = null,
    onParseError: /* error */ js.Error => Unit = null,
    padding: Double | AnonBottom = null,
    renderer: String = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVega.mod.VegaWithSpec] = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1(onNewView))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1(onParseError))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4(tooltip))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactVega.mod.VegaWithSpec] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactVega.mod.VegaWithSpec](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VegaPropsWithoutSpec
}

