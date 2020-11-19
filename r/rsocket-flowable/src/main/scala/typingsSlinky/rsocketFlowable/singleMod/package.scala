package typingsSlinky.rsocketFlowable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object singleMod {
  
  type CancelCallback = js.Function0[scala.Unit]
  
  type Source[T] = js.Function1[
    /* subject */ typingsSlinky.rsocketFlowable.singleMod.IFutureSubject[T], 
    scala.Unit
  ]
}
