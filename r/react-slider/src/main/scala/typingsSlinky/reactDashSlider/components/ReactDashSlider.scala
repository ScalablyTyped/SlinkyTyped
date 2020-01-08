package typingsSlinky.reactDashSlider.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSlider.Anon_Index
import typingsSlinky.reactDashSlider.Anon_IndexValue
import typingsSlinky.reactDashSlider.reactDashSliderMod.ReactSliderProps
import typingsSlinky.reactDashSlider.reactDashSliderMod.^
import typingsSlinky.reactDashSlider.reactDashSliderStrings.horizontal
import typingsSlinky.reactDashSlider.reactDashSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSlider
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-slider", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, defaultValue, disabled, onChange, value */
  def apply(
    ariaLabel: String | js.Array[String] = null,
    ariaValuetext: String | (js.Function1[/* value */ Anon_Index, String]) = null,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    minDistance: Int | Double = null,
    onAfterChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onBeforeChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onSliderClick: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    pageFn: /* step */ Double => Double = null,
    pearling: js.UndefOr[Boolean] = js.undefined,
    renderThumb: (/* props */ js.Object, /* state */ Anon_Index) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    renderTrack: (/* props */ js.Object, /* state */ Anon_IndexValue) => typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    snapDragDisabled: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    thumbActiveClassName: String = null,
    thumbClassName: String = null,
    trackClassName: String = null,
    withTracks: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValuetext != null) __obj.updateDynamic("ariaValuetext")(ariaValuetext.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onSliderClick != null) __obj.updateDynamic("onSliderClick")(js.Any.fromFunction1(onSliderClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageFn != null) __obj.updateDynamic("pageFn")(js.Any.fromFunction1(pageFn))
    if (!js.isUndefined(pearling)) __obj.updateDynamic("pearling")(pearling.asInstanceOf[js.Any])
    if (renderThumb != null) __obj.updateDynamic("renderThumb")(js.Any.fromFunction2(renderThumb))
    if (renderTrack != null) __obj.updateDynamic("renderTrack")(js.Any.fromFunction2(renderTrack))
    if (!js.isUndefined(snapDragDisabled)) __obj.updateDynamic("snapDragDisabled")(snapDragDisabled.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (thumbActiveClassName != null) __obj.updateDynamic("thumbActiveClassName")(thumbActiveClassName.asInstanceOf[js.Any])
    if (thumbClassName != null) __obj.updateDynamic("thumbClassName")(thumbClassName.asInstanceOf[js.Any])
    if (trackClassName != null) __obj.updateDynamic("trackClassName")(trackClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(withTracks)) __obj.updateDynamic("withTracks")(withTracks.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashSlider.reactDashSliderMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReactSliderProps
}

