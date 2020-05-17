package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativeFbsdk.mod.LoginBehaviorIOS
  - typingsSlinky.reactNativeFbsdk.mod.LoginBehaviorAndroid
*/
trait LoginBehavior extends js.Object

object LoginBehavior {
  @scala.inline
  implicit def apply(value: LoginBehaviorAndroid): LoginBehavior = value.asInstanceOf[LoginBehavior]
  @scala.inline
  implicit def apply(value: LoginBehaviorIOS): LoginBehavior = value.asInstanceOf[LoginBehavior]
}

