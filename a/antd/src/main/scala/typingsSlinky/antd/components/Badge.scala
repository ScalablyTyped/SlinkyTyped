package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.badgeMod.BadgeProps
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.colorsMod.PresetStatusColorType
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  @JSImport("antd/lib/badge", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def countReactElement(value: ReactElement): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def count(value: ReactElement): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def offset(value: js.Tuple2[Double | String, Double | String]): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollNumberPrefixCls(value: String): this.type = set("scrollNumberPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def showZero(value: Boolean): this.type = set("showZero", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: PresetStatusColorType): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

