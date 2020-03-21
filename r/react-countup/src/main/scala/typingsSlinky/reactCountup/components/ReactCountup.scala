package typingsSlinky.reactCountup.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactCountup.AnonPauseResume
import typingsSlinky.reactCountup.AnonPauseResumeReset
import typingsSlinky.reactCountup.AnonReset
import typingsSlinky.reactCountup.AnonStart
import typingsSlinky.reactCountup.AnonUpdate
import typingsSlinky.reactCountup.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCountup
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, start, style */
  def apply(
    decimal: String = null,
    decimals: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit = null,
    end: Int | Double = null,
    formattingFn: /* value */ Double => String = null,
    onComplete: () => Unit = null,
    onEnd: /* providedFn */ AnonPauseResume => Unit = null,
    onPauseResume: () => js.Function1[/* providedFn */ AnonStart, Unit] = null,
    onReset: () => js.Function1[/* providedFn */ AnonUpdate, Unit] = null,
    onStart: /* providedFn */ AnonReset => Unit = null,
    onUpdate: /* providedFn */ AnonPauseResumeReset => Unit = null,
    prefix: String = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4(easingFn))
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1(formattingFn))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction0(onComplete))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onPauseResume != null) __obj.updateDynamic("onPauseResume")(js.Any.fromFunction0(onPauseResume))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactCountup.mod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactCountup.mod.Props
}

