package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.progressBarMod.ProgressBarOverrides
import typingsSlinky.baseui.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressBar {
  
  @JSImport("baseui/progress-bar", "ProgressBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.progressBarMod.ProgressBar] {
    
    @scala.inline
    def getProgressLabel(value: (/* value */ Double, /* successValue */ Double) => ReactElement): this.type = set("getProgressLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: ProgressBarOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showLabel(value: Boolean): this.type = set("showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def successValue(value: Double): this.type = set("successValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ProgressBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
