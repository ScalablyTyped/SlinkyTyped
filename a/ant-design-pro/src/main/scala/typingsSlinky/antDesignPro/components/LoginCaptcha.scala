package typingsSlinky.antDesignPro.components

import typingsSlinky.antDesignPro.loginItemMod.LoginItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LoginCaptcha {
  @JSImport("ant-design-pro", "Login.Captcha")
  @js.native
  object component extends js.Object
  
  def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps638664218 = new SharedBuilder_LoginItemProps638664218(js.Array(this.component, p.asInstanceOf[js.Any]))
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
}

