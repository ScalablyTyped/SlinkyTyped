package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAuthenticationContext extends StObject {
  
  var auth: AuthenticationCredentials = js.native
  
  var authMethod: String = js.native
  
  var authMethods: js.Array[String] = js.native
  
  var extensions: js.Array[String] = js.native
  
  var maxAllowedSize: Double | `false` = js.native
  
  def reject(err: String): js.Any = js.native
  def reject(err: js.Error): js.Any = js.native
  
  def resolve(): js.Any = js.native
  
  def sendCommand(cmd: String): js.Promise[CustomAuthenticationResponse] = js.native
  def sendCommand(
    cmd: String,
    done: js.Function2[/* err */ js.Error | Null, /* data */ CustomAuthenticationResponse, Unit]
  ): Unit = js.native
}
