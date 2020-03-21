package typingsSlinky.reactTagcloud.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactTagcloud.ReactTagCloud_.TagCloudProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTagCloudTagCloud
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSGlobal("reactTagCloud.TagCloud")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    maxSize: Double,
    minSize: Double,
    tags: js.Array[_],
    colorOptions: js.Object = null,
    disableRandomColor: js.UndefOr[Boolean] = js.undefined,
    onClick: js.Function = null,
    renderer: js.Function = null,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (colorOptions != null) __obj.updateDynamic("colorOptions")(colorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRandomColor)) __obj.updateDynamic("disableRandomColor")(disableRandomColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TagCloudProps
}

