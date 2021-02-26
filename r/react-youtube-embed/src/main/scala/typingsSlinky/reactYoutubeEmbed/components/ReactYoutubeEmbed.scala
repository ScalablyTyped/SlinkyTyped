package typingsSlinky.reactYoutubeEmbed.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactYoutubeEmbed.mod.YouTubeEmbedProps
import typingsSlinky.reactYoutubeEmbed.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactYoutubeEmbed {
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[YouTubeEmbedProps]))
  }
  
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def appendSrc(value: String): this.type = set("appendSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def aspectRatio(value: String): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prependSrc(value: String): this.type = set("prependSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: YouTubeEmbedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
