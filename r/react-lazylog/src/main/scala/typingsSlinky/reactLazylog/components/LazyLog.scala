package typingsSlinky.reactLazylog.components

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.Range
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.lazyLogMod.LazyLogProps
import typingsSlinky.reactLazylog.lazyLogMod.WebsocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLog {
  @JSImport("react-lazylog", "LazyLog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLazylog.mod.LazyLog] {
    @scala.inline
    def caseInsensitive(value: Boolean): this.type = set("caseInsensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSearch(value: Boolean): this.type = set("enableSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def extraLines(value: Double): this.type = set("extraLines", value.asInstanceOf[js.Any])
    @scala.inline
    def fetchOptions(value: RequestInit): this.type = set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def follow(value: Boolean): this.type = set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def formatPart(value: /* text */ String => ReactElement): this.type = set("formatPart", js.Any.fromFunction1(value))
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightVarargs(value: Double*): this.type = set("highlight", js.Array(value :_*))
    @scala.inline
    def highlight(value: Double | js.Array[Double]): this.type = set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightLineClassName(value: String): this.type = set("highlightLineClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def lineClassName(value: String): this.type = set("lineClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingComponent(value: js.Any): this.type = set("loadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* error */ js.Any => _): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onHighlight(value: /* range */ Range => _): this.type = set("onHighlight", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: () => _): this.type = set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def overscanRowCount(value: Double): this.type = set("overscanRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToLine(value: Double): this.type = set("scrollToLine", value.asInstanceOf[js.Any])
    @scala.inline
    def selectableLines(value: Boolean): this.type = set("selectableLines", value.asInstanceOf[js.Any])
    @scala.inline
    def stream(value: Boolean): this.type = set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def websocket(value: Boolean): this.type = set("websocket", value.asInstanceOf[js.Any])
    @scala.inline
    def websocketOptions(value: WebsocketOptions): this.type = set("websocketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LazyLogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(url: String): Builder = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LazyLogProps]))
  }
}

