package typingsSlinky.agiledigitalMulePreview.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.agiledigitalMulePreview.mod.MulePreviewUrlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewUrl {
  
  @scala.inline
  def apply(contentRoot: String, contentUrl: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewUrlProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewUrlProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
