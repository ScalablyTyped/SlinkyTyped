package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.progressStepsMod.NumberedStepOverrides
import typingsSlinky.baseui.progressStepsMod.NumberedStepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NumberedStep {
  @JSImport("baseui/progress-steps", "NumberedStep")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def isCompleted(value: Boolean): this.type = set("isCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def isLast(value: Boolean): this.type = set("isLast", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: NumberedStepOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def stepReactElement(value: ReactElement): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: TagMod[Any]): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NumberedStepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NumberedStep.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

