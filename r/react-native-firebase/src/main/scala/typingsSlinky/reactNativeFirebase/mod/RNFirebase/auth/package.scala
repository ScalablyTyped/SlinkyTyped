package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth {
  type AuthListenerCallback = js.Function1[
    /* user */ typingsSlinky.reactNativeFirebase.mod.RNFirebase.auth.OrNull[typingsSlinky.reactNativeFirebase.mod.RNFirebase.User], 
    scala.Unit
  ]
  type AuthResult = typingsSlinky.reactNativeFirebase.anon.Authenticated | scala.Null
  type OrNull[T] = T | scala.Null
}
