package typingsSlinky.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLS extends StObject {
  
  def enrollAccount(token: String): String = js.native
  
  def resetPassword(token: String): String = js.native
  
  def verifyEmail(token: String): String = js.native
}
object URLS {
  
  @scala.inline
  def apply(enrollAccount: String => String, resetPassword: String => String, verifyEmail: String => String): URLS = {
    val __obj = js.Dynamic.literal(enrollAccount = js.Any.fromFunction1(enrollAccount), resetPassword = js.Any.fromFunction1(resetPassword), verifyEmail = js.Any.fromFunction1(verifyEmail))
    __obj.asInstanceOf[URLS]
  }
  
  @scala.inline
  implicit class URLSMutableBuilder[Self <: URLS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnrollAccount(value: String => String): Self = StObject.set(x, "enrollAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetPassword(value: String => String): Self = StObject.set(x, "resetPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyEmail(value: String => String): Self = StObject.set(x, "verifyEmail", js.Any.fromFunction1(value))
  }
}
