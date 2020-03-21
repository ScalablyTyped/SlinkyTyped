package typingsSlinky.agiledigitalMulePreview.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.agiledigitalMulePreview.mod.MulePreviewUrlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewUrl
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(contentRoot: String, contentUrl: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MulePreviewUrlProps
}

