package typingsSlinky.reactHighlightJs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactHighlightJs.mod.HighlightProps
import typingsSlinky.reactHighlightJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlightDotjs {
  
  @scala.inline
  def apply(language: String): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[HighlightProps]))
  }
  
  @JSImport("react-highlight.js", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HighlightProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
