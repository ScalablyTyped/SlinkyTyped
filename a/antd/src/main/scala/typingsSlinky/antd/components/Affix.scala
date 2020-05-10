package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.affixMod.AffixProps
import typingsSlinky.antd.affixMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Affix {
  @JSImport("antd/lib/affix", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetBottom(value: Double): this.type = set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* affixed */ js.UndefOr[Boolean] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: () => Window_ | HTMLElement | Null): this.type = set("target", js.Any.fromFunction0(value))
  }
  
  def withProps(p: AffixProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Affix.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

