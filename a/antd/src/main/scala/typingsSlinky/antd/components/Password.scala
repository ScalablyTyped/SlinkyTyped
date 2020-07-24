package typingsSlinky.antd.components

import typingsSlinky.antd.passwordMod.PasswordProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Password {
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PasswordProps with RefAttributes[js.Any]): SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object] = new SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Password.type): SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object] = new SharedBuilder_PasswordPropsRefAttributes1788206810[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

