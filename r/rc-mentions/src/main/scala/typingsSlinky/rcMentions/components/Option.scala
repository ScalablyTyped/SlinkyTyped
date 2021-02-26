package typingsSlinky.rcMentions.components

import typingsSlinky.rcMentions.optionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @JSImport("rc-mentions/es/Option", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Option.type): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, p.asInstanceOf[js.Any]))
}
