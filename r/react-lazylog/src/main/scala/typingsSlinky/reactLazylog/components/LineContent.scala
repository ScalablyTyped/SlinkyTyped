package typingsSlinky.reactLazylog.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.anon.Text
import typingsSlinky.reactLazylog.lineContentMod.LineContentProps
import typingsSlinky.reactLazylog.lineContentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineContent {
  
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def formatPart(value: /* text */ String => ReactElement): this.type = set("formatPart", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[Text], number: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineContentProps]))
  }
}
