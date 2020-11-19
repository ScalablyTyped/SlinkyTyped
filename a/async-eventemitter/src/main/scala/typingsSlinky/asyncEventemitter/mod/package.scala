package typingsSlinky.asyncEventemitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncListener[T, R] = js.Function2[
    /* data */ T, 
    /* callback */ js.Function1[js.UndefOr[R], scala.Unit], 
    js.Promise[R] | scala.Unit
  ]
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.asyncEventemitter.mod.AsyncListener[js.Any, js.Any]]
}
