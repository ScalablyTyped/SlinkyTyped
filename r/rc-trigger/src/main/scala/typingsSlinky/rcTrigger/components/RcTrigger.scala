package typingsSlinky.rcTrigger.components

import typingsSlinky.rcTrigger.mod.TriggerProps
import typingsSlinky.rcTrigger.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcTrigger {
  
  @JSImport("rc-trigger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TriggerProps): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcTrigger.type): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, js.Dictionary.empty))()
}
