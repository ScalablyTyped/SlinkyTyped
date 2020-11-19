package typingsSlinky.reactNativeFirebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object RNFirebase {
  
  type ErrorHandler = typingsSlinky.reactNativeFirebase.mod.RNFirebase.Handler[typingsSlinky.reactNativeFirebase.mod.RNFirebase.RnError]
  
  type Handler[T] = js.Function1[/* value */ T, scala.Unit]
}
