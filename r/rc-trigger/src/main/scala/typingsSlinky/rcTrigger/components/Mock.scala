package typingsSlinky.rcTrigger.components

import typingsSlinky.rcTrigger.mockMod.default
import typingsSlinky.rcTrigger.mod.TriggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mock {
  
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TriggerProps): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Mock.type): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, js.Dictionary.empty))()
}
