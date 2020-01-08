package typingsSlinky.reactDashOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashOnsenui.HTMLAttributesidclassNamestylemodifierstringvaluenClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressCircular
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ProgressCircular] {
  @JSImport("react-onsenui", "ProgressCircular")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    secondaryValue: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    value: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ProgressCircular] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryValue)) __obj.updateDynamic("secondaryValue")(secondaryValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ProgressCircular] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashOnsenui.reactDashOnsenuiMod.ProgressCircular](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNamestylemodifierstringvaluenClassName
}

