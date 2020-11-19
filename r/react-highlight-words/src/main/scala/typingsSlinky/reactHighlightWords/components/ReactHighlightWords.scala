package typingsSlinky.reactHighlightWords.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactHighlightWords.mod.Chunk
import typingsSlinky.reactHighlightWords.mod.FindChunks
import typingsSlinky.reactHighlightWords.mod.HighlighterProps
import typingsSlinky.reactHighlightWords.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHighlightWords {
  
  @JSImport("react-highlight-words", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeIndex(value: Double): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeStyle(value: CSSProperties): this.type = set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoEscape(value: Boolean): this.type = set("autoEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caseSensitive(value: Boolean): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def findChunks(value: /* options */ FindChunks => js.Array[Chunk]): this.type = set("findChunks", js.Any.fromFunction1(value))
    
    @scala.inline
    def highlightClassName(value: String): this.type = set("highlightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightStyle(value: CSSProperties): this.type = set("highlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightTagFunctionComponent(value: ReactComponentClass[_]): this.type = set("highlightTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightTagComponentClass(value: ReactComponentClass[_]): this.type = set("highlightTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightTag(value: String | ReactComponentClass[_]): this.type = set("highlightTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sanitize(value: /* text */ String => String): this.type = set("sanitize", js.Any.fromFunction1(value))
    
    @scala.inline
    def unhighlightClassName(value: String): this.type = set("unhighlightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unhighlightStyle(value: CSSProperties): this.type = set("unhighlightStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlighterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): Builder = {
    val __props = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighlighterProps]))
  }
}
