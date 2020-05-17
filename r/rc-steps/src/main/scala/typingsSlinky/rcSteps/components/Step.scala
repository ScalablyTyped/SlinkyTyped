package typingsSlinky.rcSteps.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcSteps.anon.Error
import typingsSlinky.rcSteps.mod.StepProps
import typingsSlinky.rcSteps.rcStepsStrings.error
import typingsSlinky.rcSteps.rcStepsStrings.finish
import typingsSlinky.rcSteps.rcStepsStrings.process
import typingsSlinky.rcSteps.rcStepsStrings.wait
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Step {
  @JSImport("rc-steps", "Step")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rcSteps.mod.Step] {
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: TagMod[Any]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: TagMod[Any]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def icons(value: Error): this.type = set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onStepClick(value: /* stepIndex */ Double => Unit): this.type = set("onStepClick", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def progressDot(value: Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
    @scala.inline
    def status(value: error | process | finish | wait): this.type = set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subTitle(value: TagMod[Any]): this.type = set("subTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def tailContentReactElement(value: ReactElement): this.type = set("tailContent", value.asInstanceOf[js.Any])
    @scala.inline
    def tailContent(value: TagMod[Any]): this.type = set("tailContent", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

