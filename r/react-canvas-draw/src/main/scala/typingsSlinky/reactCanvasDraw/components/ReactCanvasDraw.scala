package typingsSlinky.reactCanvasDraw.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactCanvasDraw.mod.CanvasDraw
import typingsSlinky.reactCanvasDraw.mod.CanvasDrawProps
import typingsSlinky.reactCanvasDraw.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCanvasDraw
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, style */
  def apply(
    backgroundColor: String = null,
    brushColor: String = null,
    brushRadius: Int | Double = null,
    canvasHeight: Double | String = null,
    canvasWidth: Double | String = null,
    catenaryColor: String = null,
    gridColor: String = null,
    hideGrid: js.UndefOr[Boolean] = js.undefined,
    hideInterface: js.UndefOr[Boolean] = js.undefined,
    imgSrc: String = null,
    immediateLoading: js.UndefOr[Boolean] = js.undefined,
    lazyRadius: Int | Double = null,
    loadTimeOffset: Int | Double = null,
    onChange: /* canvas */ CanvasDraw => Unit = null,
    saveData: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (brushColor != null) __obj.updateDynamic("brushColor")(brushColor.asInstanceOf[js.Any])
    if (brushRadius != null) __obj.updateDynamic("brushRadius")(brushRadius.asInstanceOf[js.Any])
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (catenaryColor != null) __obj.updateDynamic("catenaryColor")(catenaryColor.asInstanceOf[js.Any])
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGrid)) __obj.updateDynamic("hideGrid")(hideGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInterface)) __obj.updateDynamic("hideInterface")(hideInterface.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateLoading)) __obj.updateDynamic("immediateLoading")(immediateLoading.asInstanceOf[js.Any])
    if (lazyRadius != null) __obj.updateDynamic("lazyRadius")(lazyRadius.asInstanceOf[js.Any])
    if (loadTimeOffset != null) __obj.updateDynamic("loadTimeOffset")(loadTimeOffset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (saveData != null) __obj.updateDynamic("saveData")(saveData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactCanvasDraw.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CanvasDrawProps
}

