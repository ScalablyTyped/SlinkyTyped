package typingsSlinky.agiledigitalMulePreview.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.agiledigitalMulePreview.mod.MulePreviewDiffContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MulePreviewDiffContent {
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  object component extends js.Object
  
  def withProps(p: MulePreviewDiffContentProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewDiffContentProps]))
  }
}

