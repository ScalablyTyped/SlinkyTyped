package typingsSlinky.baseui.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.selectMod.AutosizeInputOverrides
import typingsSlinky.baseui.selectMod.AutosizeInputProps
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutosizeInput {
  
  @JSImport("baseui/select", "AutosizeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.selectMod.AutosizeInput] {
    
    @scala.inline
    def $size(value: mini | default_ | compact | large_): this.type = set("$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRef(value: Ref[_]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def inputRefRefObject(value: ReactRef[_]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: AutosizeInputOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AutosizeInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AutosizeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
