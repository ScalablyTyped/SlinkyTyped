package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.scrollNumberMod.ScrollNumberProps
import typingsSlinky.antd.scrollNumberMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollNumber {
  @JSImport("antd/lib/badge/ScrollNumber", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def count(value: String | Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def countNull: this.type = set("count", null)
    @scala.inline
    def displayComponent(value: ReactElement): this.type = set("displayComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimated(value: js.Function): this.type = set("onAnimated", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | Double): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleNull: this.type = set("title", null)
  }
  
  def withProps(p: ScrollNumberProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScrollNumber.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

