package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.mjmlReact.AnonSrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlTrackingPixel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel] {
  @JSImport("mjml-react/extensions", "MjmlTrackingPixel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(src: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.mjmlReact.extensionsMod.MjmlTrackingPixel] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonSrc
}

