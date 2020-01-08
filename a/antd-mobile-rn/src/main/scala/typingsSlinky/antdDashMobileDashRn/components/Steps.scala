package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.horizontal
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.vertical
import typingsSlinky.antdDashMobileDashRn.libStepsIndexDotNativeMod.StepsNativeProps
import typingsSlinky.antdDashMobileDashRn.libStepsStyleIndexDotNativeMod.IStepsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Steps] {
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    current: Int | Double = null,
    direction: vertical | horizontal = null,
    finishIcon: String = null,
    size: String = null,
    styles: IStepsStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Steps] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Steps] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Steps](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StepsNativeProps
}

