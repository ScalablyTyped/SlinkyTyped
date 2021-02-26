package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.anon.IdNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISession extends StObject {
  
  def getUser(): IdNumber = js.native
  
  def getUserToken(): String = js.native
  
  def isLoggedIn(): Boolean = js.native
  
  def login(email: String, password: String): js.Promise[Unit] = js.native
  
  def logout(): js.Promise[Unit] = js.native
  
  def ssoLogin(email: String): js.Promise[Unit] = js.native
  
  def tokenLogin(token: String): js.Promise[Unit] = js.native
}
object ISession {
  
  @scala.inline
  def apply(
    getUser: () => IdNumber,
    getUserToken: () => String,
    isLoggedIn: () => Boolean,
    login: (String, String) => js.Promise[Unit],
    logout: () => js.Promise[Unit],
    ssoLogin: String => js.Promise[Unit],
    tokenLogin: String => js.Promise[Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = js.Any.fromFunction0(getUser), getUserToken = js.Any.fromFunction0(getUserToken), isLoggedIn = js.Any.fromFunction0(isLoggedIn), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction0(logout), ssoLogin = js.Any.fromFunction1(ssoLogin), tokenLogin = js.Any.fromFunction1(tokenLogin))
    __obj.asInstanceOf[ISession]
  }
  
  @scala.inline
  implicit class ISessionMutableBuilder[Self <: ISession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUser(value: () => IdNumber): Self = StObject.set(x, "getUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserToken(value: () => String): Self = StObject.set(x, "getUserToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoggedIn(value: () => Boolean): Self = StObject.set(x, "isLoggedIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogin(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "login", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogout(value: () => js.Promise[Unit]): Self = StObject.set(x, "logout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSsoLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "ssoLogin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "tokenLogin", js.Any.fromFunction1(value))
  }
}
