package typingsSlinky.reactSignatureCanvas.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.canvas.tag
import typingsSlinky.react.mod.CanvasHTMLAttributes
import typingsSlinky.reactSignatureCanvas.mod.ReactSignatureCanvasProps
import typingsSlinky.reactSignatureCanvas.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSignatureCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: String = null,
    canvasProps: CanvasHTMLAttributes[HTMLCanvasElement] = null,
    clearOnResize: js.UndefOr[Boolean] = js.undefined,
    dotSize: Double | js.Function0[Double] = null,
    maxWidth: Int | Double = null,
    minDistance: Int | Double = null,
    minWidth: Int | Double = null,
    onBegin: /* event */ MouseEvent => Unit = null,
    onEnd: /* event */ MouseEvent => Unit = null,
    penColor: String = null,
    throttle: Int | Double = null,
    velocityFilterWeight: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (canvasProps != null) __obj.updateDynamic("canvasProps")(canvasProps.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnResize)) __obj.updateDynamic("clearOnResize")(clearOnResize.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onBegin != null) __obj.updateDynamic("onBegin")(js.Any.fromFunction1(onBegin))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (penColor != null) __obj.updateDynamic("penColor")(penColor.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (velocityFilterWeight != null) __obj.updateDynamic("velocityFilterWeight")(velocityFilterWeight.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.canvas.tag.type, typingsSlinky.reactSignatureCanvas.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactSignatureCanvasProps
}

