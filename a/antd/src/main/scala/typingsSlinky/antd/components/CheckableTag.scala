package typingsSlinky.antd.components

import typingsSlinky.antd.checkableTagMod.CheckableTagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckableTag {
  
  @scala.inline
  def apply(checked: Boolean): SharedBuilder_CheckableTagProps2088584901 = {
    val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    new SharedBuilder_CheckableTagProps2088584901(js.Array(this.component, __props.asInstanceOf[CheckableTagProps]))
  }
  
  @JSImport("antd/lib/tag/CheckableTag", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CheckableTagProps): SharedBuilder_CheckableTagProps2088584901 = new SharedBuilder_CheckableTagProps2088584901(js.Array(this.component, p.asInstanceOf[js.Any]))
}
