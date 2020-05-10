package typingsSlinky.antd.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.butt
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.progressMod.default
import typingsSlinky.antd.progressProgressMod.ProgressGradient
import typingsSlinky.antd.progressProgressMod.ProgressProps
import typingsSlinky.antd.progressProgressMod.ProgressSize
import typingsSlinky.antd.progressProgressMod.ProgressType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Progress {
  @JSImport("antd/lib/progress", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def format(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => TagMod[Any]): this.type = set("format", js.Any.fromFunction2(value))
    @scala.inline
    def gapDegree(value: Double): this.type = set("gapDegree", value.asInstanceOf[js.Any])
    @scala.inline
    def gapPosition(value: top | bottom | left | right): this.type = set("gapPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def showInfo(value: Boolean): this.type = set("showInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: ProgressSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: normal | exception | active | success): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def steps(value: Double): this.type = set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeColor(value: String | ProgressGradient): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeLinecap(value: butt | square | round): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def successPercent(value: Double): this.type = set("successPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def trailColor(value: String): this.type = set("trailColor", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: ProgressType): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

