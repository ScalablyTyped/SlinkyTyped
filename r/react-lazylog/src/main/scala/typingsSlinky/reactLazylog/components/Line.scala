package typingsSlinky.reactLazylog.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.anon.Text
import typingsSlinky.reactLazylog.lineMod.LineProps
import typingsSlinky.reactLazylog.lineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Line {
  @JSImport("react-lazylog/build/Line", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def formatPart(value: /* text */ String => ReactElement): this.type = set("formatPart", js.Any.fromFunction1(value))
    @scala.inline
    def highlight(value: Boolean): this.type = set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def onLineNumberClick(value: SyntheticMouseEvent[HTMLAnchorElement] => Unit): this.type = set("onLineNumberClick", js.Any.fromFunction1(value))
    @scala.inline
    def onRowClick(value: () => _): this.type = set("onRowClick", js.Any.fromFunction0(value))
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[Text], number: Double, rowHeight: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineProps]))
  }
}

