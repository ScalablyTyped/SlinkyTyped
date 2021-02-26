package typingsSlinky.rcTrigger.components

import typingsSlinky.rcTrigger.mockMod.default
import typingsSlinky.rcTrigger.mod.TriggerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mock {
  
  @JSImport("rc-trigger/es/mock", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Mock.type): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TriggerProps): SharedBuilder_TriggerProps1005917762[default] = new SharedBuilder_TriggerProps1005917762[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
