package typingsSlinky.reactFa.components

import slinky.core.ReactComponentClass
import typingsSlinky.reactFa.mod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFa {
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1331641792[ReactComponentClass[IconProps] with js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1331641792[ReactComponentClass[IconProps] with js.Object](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps1331641792[ReactComponentClass[IconProps] with js.Object] = new SharedBuilder_IconProps1331641792[ReactComponentClass[IconProps] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
