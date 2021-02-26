package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.spinnerMod.SpinnerDeterminateOverrides
import typingsSlinky.baseui.spinnerMod.SpinnerDeterminateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpinnerDeterminate {
  
  @JSImport("baseui/spinner", "SpinnerDeterminate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: SpinnerDeterminateOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: Double): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(
      value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/spinner.SIZE[keyof baseui.baseui/spinner.SIZE] */ js.Any
    ): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SpinnerDeterminate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpinnerDeterminateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
