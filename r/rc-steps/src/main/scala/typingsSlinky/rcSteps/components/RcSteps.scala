package typingsSlinky.rcSteps.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSteps.anon.Error
import typingsSlinky.rcSteps.mod.StepsProps
import typingsSlinky.rcSteps.mod.default
import typingsSlinky.rcSteps.rcStepsStrings.error
import typingsSlinky.rcSteps.rcStepsStrings.finish
import typingsSlinky.rcSteps.rcStepsStrings.horizontal
import typingsSlinky.rcSteps.rcStepsStrings.navigation
import typingsSlinky.rcSteps.rcStepsStrings.process
import typingsSlinky.rcSteps.rcStepsStrings.small
import typingsSlinky.rcSteps.rcStepsStrings.vertical
import typingsSlinky.rcSteps.rcStepsStrings.wait
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcSteps {
  @JSImport("rc-steps", JSImport.Default)
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
    def icons(value: Error): this.type = set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def labelPlacement(value: vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def progressDot(value: Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: error | process | finish | wait): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: typingsSlinky.rcSteps.rcStepsStrings.default | navigation): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcSteps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

