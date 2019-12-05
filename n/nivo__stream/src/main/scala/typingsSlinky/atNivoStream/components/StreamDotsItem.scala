package typingsSlinky.atNivoStream.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atNivoStream.atNivoStreamMod.StreamDotsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StreamDotsItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atNivoStream.atNivoStreamMod.StreamDotsItem] {
  @JSImport("@nivo/stream", "StreamDotsItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    x: Double,
    y: Double,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atNivoStream.atNivoStreamMod.StreamDotsItem] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StreamDotsItemProps
}

