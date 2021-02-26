package typingsSlinky.antDesignPro.components

import typingsSlinky.antDesignPro.loginItemMod.LoginItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginItem {
  
  @scala.inline
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    `type`: String,
    updateActive: js.Any => Unit
  ): SharedBuilder_LoginItemProps638664218 = {
    val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_LoginItemProps638664218(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
  }
  
  @JSImport("ant-design-pro/lib/Login/LoginItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
}
