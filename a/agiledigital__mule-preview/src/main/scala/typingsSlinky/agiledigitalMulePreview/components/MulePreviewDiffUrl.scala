package typingsSlinky.agiledigitalMulePreview.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.agiledigitalMulePreview.mod.MulePreviewDiffUrlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewDiffUrl {
  
  @scala.inline
  def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewDiffUrlProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewDiffUrlProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
