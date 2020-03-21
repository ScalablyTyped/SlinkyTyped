package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.progressBarMod.ProgressBarOverrides
import typingsSlinky.baseui.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.progressBarMod.ProgressBar] {
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    getProgressLabel: (/* value */ Double, /* successValue */ Double) => TagMod[Any] = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    overrides: ProgressBarOverrides = null,
    showLabel: js.UndefOr[Boolean] = js.undefined,
    successValue: Int | Double = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.progressBarMod.ProgressBar] = {
    val __obj = js.Dynamic.literal()
    if (getProgressLabel != null) __obj.updateDynamic("getProgressLabel")(js.Any.fromFunction2(getProgressLabel))
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showLabel)) __obj.updateDynamic("showLabel")(showLabel.asInstanceOf[js.Any])
    if (successValue != null) __obj.updateDynamic("successValue")(successValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.progressBarMod.ProgressBar] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.progressBarMod.ProgressBar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ProgressBarProps
}

