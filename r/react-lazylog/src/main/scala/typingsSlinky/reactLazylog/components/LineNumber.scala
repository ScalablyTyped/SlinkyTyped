package typingsSlinky.reactLazylog.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.lineNumberMod.LineNumberProps
import typingsSlinky.reactLazylog.lineNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineNumber {
  @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(number: Double): Builder = {
    val __props = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineNumberProps]))
  }
}

