package typingsSlinky.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object modalPropsTypeMod {
  
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type CallbackOnBackHandler = js.Function0[scala.Boolean]
  
  type CallbackOrActions[T] = typingsSlinky.antDesignReactNative.modalPropsTypeMod.Callback | js.Array[typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action[T]]
}
