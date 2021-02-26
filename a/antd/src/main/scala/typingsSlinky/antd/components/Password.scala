package typingsSlinky.antd.components

import typingsSlinky.antd.passwordMod.PasswordProps
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Password {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Password.type): SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object] = new SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PasswordProps with RefAttributes[js.Any]): SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object] = new SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
