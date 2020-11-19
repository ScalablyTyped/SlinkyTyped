package typingsSlinky.reactLazylog.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.anon.Text
import typingsSlinky.reactLazylog.linePartMod.LinePartProps
import typingsSlinky.reactLazylog.linePartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinePart {
  
  @JSImport("react-lazylog/build/LinePart", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def format(value: /* text */ String => ReactElement): this.type = set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinePartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(part: Text): Builder = {
    val __props = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinePartProps]))
  }
}
