package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object restartHooks {
  
  /**
    * This callback delivers ResizeObserver's notifications. It is invoked by a
    * broadcast active observations algorithm.
    */
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[typingsSlinky.restartHooks.ResizeObserverEntry], 
    /* observer */ typingsSlinky.restartHooks.ResizeObserver, 
    scala.Unit
  ]
}
