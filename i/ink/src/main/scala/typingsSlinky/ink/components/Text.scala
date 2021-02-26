package typingsSlinky.ink.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ink.inkStrings.`truncate-end`
import typingsSlinky.ink.inkStrings.`truncate-middle`
import typingsSlinky.ink.inkStrings.`truncate-start`
import typingsSlinky.ink.inkStrings.end
import typingsSlinky.ink.inkStrings.middle
import typingsSlinky.ink.inkStrings.truncate
import typingsSlinky.ink.textMod.Props
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("ink", "Text")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def backgroundColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundColor */ _, 
          String
        ]
    ): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
          String
        ]
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dimColor(value: Boolean): this.type = set("dimColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverse(value: Boolean): this.type = set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def strikethrough(value: Boolean): this.type = set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrap(
      value: typingsSlinky.ink.inkStrings.wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
    ): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Text.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
