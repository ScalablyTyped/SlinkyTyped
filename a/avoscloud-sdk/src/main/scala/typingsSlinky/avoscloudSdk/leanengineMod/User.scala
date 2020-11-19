package typingsSlinky.avoscloudSdk.leanengineMod

import typingsSlinky.avoscloudSdk.mod.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  *
  * <p>A AV.User object is a local representation of a user persisted to the
  * AV cloud. This class is a subclass of a AV.Object, and retains the
  * same functionality of a AV.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@JSImport("leanengine", "User")
@js.native
class User ()
  extends typingsSlinky.avoscloudSdk.mod.User
/* static members */
@JSImport("leanengine", "User")
@js.native
object User extends js.Object {
  
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  
  def become[T](sessionToken: String): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  def become[T](sessionToken: String, options: SuccessFailureOptions): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  
  def current(): typingsSlinky.avoscloudSdk.mod.User = js.native
  
  def logIn[T](username: String, password: String): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  def logIn[T](username: String, password: String, options: SuccessFailureOptions): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  
  def logOut[T](): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  
  def requestPasswordReset[T](email: String): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  def requestPasswordReset[T](email: String, options: SuccessFailureOptions): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  
  def signUp[T](username: String, password: String, attrs: js.Any): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
  def signUp[T](username: String, password: String, attrs: js.Any, options: SuccessFailureOptions): typingsSlinky.avoscloudSdk.mod.Promise[T] = js.native
}
