package typingsSlinky.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserConstructor
  extends ObjectStatic
     with Instantiable0[typingsSlinky.parse.mod.global.Parse.User[Attributes]]
     with Instantiable1[/* attributes */ Attributes, typingsSlinky.parse.mod.global.Parse.User[Attributes]] {
  
  def _registerAuthenticationProvider(provider: AuthProvider): Unit = js.native
  
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  
  def become[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](sessionToken: String): js.Promise[T] = js.native
  def become[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](sessionToken: String, options: UseMasterKeyOption): js.Promise[T] = js.native
  
  def current[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](): js.UndefOr[T] = js.native
  
  def currentAsync[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](): js.Promise[T | Null] = js.native
  
  def enableUnsafeCurrentUser(): Unit = js.native
  
  def extend(): js.Any = js.native
  def extend(protoProps: js.UndefOr[scala.Nothing], classProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any): js.Any = js.native
  def extend(protoProps: js.Any, classProps: js.Any): js.Any = js.native
  
  def hydrate[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](userJSON: js.Any): js.Promise[T] = js.native
  
  def logIn[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](username: String, password: String): js.Promise[T] = js.native
  def logIn[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, options: FullOptions): js.Promise[T] = js.native
  
  def logInWith[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](provider: String, options: typingsSlinky.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](provider: String, options: typingsSlinky.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  def logInWith[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](provider: AuthProvider, options: typingsSlinky.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](provider: AuthProvider, options: typingsSlinky.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  
  def logOut[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](): js.Promise[T] = js.native
  
  def requestPasswordReset[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](email: String): js.Promise[T] = js.native
  def requestPasswordReset[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](email: String, options: SuccessFailureOptions): js.Promise[T] = js.native
  
  def signUp[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, attrs: js.Any): js.Promise[T] = js.native
  def signUp[T /* <: typingsSlinky.parse.mod.global.Parse.User[Attributes] */](username: String, password: String, attrs: js.Any, options: SignUpOptions): js.Promise[T] = js.native
}
