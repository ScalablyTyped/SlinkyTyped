package typingsSlinky.rheostat.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.rheostat.rheostatMod.Algorithm
import typingsSlinky.rheostat.rheostatMod.Orientation
import typingsSlinky.rheostat.rheostatMod.PublicState
import typingsSlinky.rheostat.rheostatMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rheostat
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rheostat", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onChange */
  def apply(
    algorithm: Algorithm = null,
    autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined,
    background: ReactComponentClass[_] = null,
    getNextHandlePosition: (/* handleIdx */ Double, /* percentPosition */ Double) => Double = null,
    handle: ReactComponentClass[_] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onClick: () => _ = null,
    onKeyPress: () => _ = null,
    onSliderDragEnd: () => _ = null,
    onSliderDragMove: () => _ = null,
    onSliderDragStart: () => _ = null,
    onValuesUpdated: /* publicState */ PublicState => _ = null,
    orientation: Orientation = null,
    pitComponent: ReactComponentClass[_] = null,
    pitPoints: js.Array[Double] = null,
    progressBar: ReactComponentClass[_] = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    snapPoints: js.Array[Double] = null,
    values: js.Array[Double] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustVerticalPosition)) __obj.updateDynamic("autoAdjustVerticalPosition")(autoAdjustVerticalPosition.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(js.Any.fromFunction2(getNextHandlePosition))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction0(onKeyPress))
    if (onSliderDragEnd != null) __obj.updateDynamic("onSliderDragEnd")(js.Any.fromFunction0(onSliderDragEnd))
    if (onSliderDragMove != null) __obj.updateDynamic("onSliderDragMove")(js.Any.fromFunction0(onSliderDragMove))
    if (onSliderDragStart != null) __obj.updateDynamic("onSliderDragStart")(js.Any.fromFunction0(onSliderDragStart))
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(js.Any.fromFunction1(onValuesUpdated))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitComponent != null) __obj.updateDynamic("pitComponent")(pitComponent.asInstanceOf[js.Any])
    if (pitPoints != null) __obj.updateDynamic("pitPoints")(pitPoints.asInstanceOf[js.Any])
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (snapPoints != null) __obj.updateDynamic("snapPoints")(snapPoints.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.rheostat.rheostatMod.Props
}

