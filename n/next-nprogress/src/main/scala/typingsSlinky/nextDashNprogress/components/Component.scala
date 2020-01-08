package typingsSlinky.nextDashNprogress.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.nextDashNprogress.componentMod.NProgressProps
import typingsSlinky.nextDashNprogress.componentMod.default
import typingsSlinky.nprogress.nprogressMod.NProgressOptions
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Component
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("next-nprogress/component", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: String = null,
    options: Partial[NProgressOptions] = null,
    showAfterMs: Int | Double = null,
    spinner: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showAfterMs != null) __obj.updateDynamic("showAfterMs")(showAfterMs.asInstanceOf[js.Any])
    if (!js.isUndefined(spinner)) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.nextDashNprogress.componentMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NProgressProps
}

