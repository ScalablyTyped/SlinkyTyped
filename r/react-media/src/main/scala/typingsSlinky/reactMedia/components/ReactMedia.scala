package typingsSlinky.reactMedia.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactMedia.mod.MediaQueryValue
import typingsSlinky.reactMedia.mod.SingleQueryProps
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMedia
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-media", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    query: MediaQueryValue,
    defaultMatches: js.UndefOr[Boolean] = js.undefined,
    onChange: /* matches */ Boolean => Unit = null,
    render: () => TagMod[Any] = null,
    targetWindow: Window_ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultMatches)) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SingleQueryProps
}

