package typingsSlinky.aspnetIdentityPw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aspnet-identity-pw", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def hashPassword(password: String): String = js.native
  def hashPassword(password: String, callback: js.Function2[/* err */ js.Any, /* result */ String, Unit]): Unit = js.native
  
  def validatePassword(password: String, hashedPass: String): Boolean = js.native
  def validatePassword(
    password: String,
    hashedPass: String,
    callback: js.Function2[/* err */ js.Any, /* result */ Boolean, Unit]
  ): Unit = js.native
}
