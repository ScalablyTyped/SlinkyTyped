package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object refsMod {
  
  type IRef[T] = typingsSlinky.blueprintjsCore.refsMod.IRefObject[T] | typingsSlinky.blueprintjsCore.refsMod.IRefCallback[T]
  
  type IRefCallback[T] = js.Function1[/* ref */ T | scala.Null, js.Any]
}
