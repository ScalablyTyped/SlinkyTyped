package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.finish
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.navigation
import typingsSlinky.antd.antdStrings.process
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.antdStrings.wait
import typingsSlinky.antd.libStepsMod.StepsProps
import typingsSlinky.antd.libStepsMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  @JSImport("antd/lib/steps", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def progressDot(value: Boolean | js.Function): this.type = set("progressDot", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: typingsSlinky.antd.antdStrings.default | small): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: wait | process | finish | error): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: typingsSlinky.antd.antdStrings.default | navigation): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

