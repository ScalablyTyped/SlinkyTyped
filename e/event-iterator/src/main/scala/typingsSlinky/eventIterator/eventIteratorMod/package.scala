package typingsSlinky.eventIterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventIteratorMod {
  
  type ListenHandler[T] = js.Function1[
    /* queue */ typingsSlinky.eventIterator.eventIteratorMod.Queue[T], 
    scala.Unit | typingsSlinky.eventIterator.eventIteratorMod.RemoveHandler
  ]
  
  type RemoveHandler = js.Function0[scala.Unit]
}
