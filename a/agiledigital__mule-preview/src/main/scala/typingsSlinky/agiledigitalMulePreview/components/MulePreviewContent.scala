package typingsSlinky.agiledigitalMulePreview.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.agiledigitalMulePreview.mod.MulePreviewContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewContent {
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: MulePreviewContentProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(contentRoot: String, contentString: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewContentProps]))
  }
}

