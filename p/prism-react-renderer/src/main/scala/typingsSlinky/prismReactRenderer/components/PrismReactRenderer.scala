package typingsSlinky.prismReactRenderer.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.prismReactRenderer.mod.HighlightProps
import typingsSlinky.prismReactRenderer.mod.Language
import typingsSlinky.prismReactRenderer.mod.PrismLib
import typingsSlinky.prismReactRenderer.mod.PrismTheme
import typingsSlinky.prismReactRenderer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PrismReactRenderer {
  @JSImport("prism-react-renderer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def theme(value: PrismTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlightProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(Prism: PrismLib, code: String, language: Language): Builder = {
    val __props = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlightProps]))
  }
}

