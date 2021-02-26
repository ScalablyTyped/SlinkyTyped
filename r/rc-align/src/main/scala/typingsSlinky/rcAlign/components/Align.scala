package typingsSlinky.rcAlign.components

import typingsSlinky.rcAlign.alignMod.AlignProps
import typingsSlinky.rcAlign.alignMod.RefAlign
import typingsSlinky.rcAlign.interfaceMod.AlignType
import typingsSlinky.rcAlign.interfaceMod.TargetType
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Align {
  
  @scala.inline
  def apply(align: AlignType, target: TargetType): SharedBuilder_AlignPropsRefAttributes_132971729[RefAlign] = {
    val __props = js.Dynamic.literal(align = align.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    new SharedBuilder_AlignPropsRefAttributes_132971729[RefAlign](js.Array(this.component, __props.asInstanceOf[AlignProps with RefAttributes[RefAlign]]))
  }
  
  @JSImport("rc-align/es/Align", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AlignProps with RefAttributes[RefAlign]): SharedBuilder_AlignPropsRefAttributes_132971729[RefAlign] = new SharedBuilder_AlignPropsRefAttributes_132971729[RefAlign](js.Array(this.component, p.asInstanceOf[js.Any]))
}
