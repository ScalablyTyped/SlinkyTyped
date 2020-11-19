package typingsSlinky.cacheManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFunc[T] = js.Function2[/* error */ js.Any, /* result */ T, scala.Unit]
  
  type TtlFunction = js.Function1[/* result */ js.Any, scala.Double]
  
  type WrapArgsType[T] = java.lang.String | (js.Function1[/* callback */ typingsSlinky.cacheManager.mod.CallbackFunc[T], scala.Unit]) | typingsSlinky.cacheManager.mod.CachingConfig | typingsSlinky.cacheManager.mod.CallbackFunc[T]
}
