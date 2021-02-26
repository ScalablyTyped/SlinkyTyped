package typingsSlinky.prismReactRenderer.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.prismReactRenderer.mod.HighlightProps
import typingsSlinky.prismReactRenderer.mod.Language
import typingsSlinky.prismReactRenderer.mod.PrismLib
import typingsSlinky.prismReactRenderer.mod.PrismTheme
import typingsSlinky.prismReactRenderer.mod.RenderProps
import typingsSlinky.prismReactRenderer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrismReactRenderer {
  
  @scala.inline
  def apply(Prism: PrismLib, children: RenderProps => ReactElement, code: String, language: Language): Builder = {
    val __props = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlightProps]))
  }
  
  @JSImport("prism-react-renderer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def theme(value: PrismTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
