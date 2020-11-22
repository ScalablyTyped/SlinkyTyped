package typingsSlinky.postRobot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // For the purposes of using the library on it's own Window is CrossDomain enough
  type CrossDomainWindowType = org.scalajs.dom.raw.Window | scala.Null
  
  type DomainMatcher = java.lang.String | js.RegExp | js.Array[java.lang.String]
  
  type ErrorHandlerType = js.Function1[/* err */ js.Any, scala.Unit]
  
  type HandlerType = js.Function3[
    /* source */ typingsSlinky.postRobot.mod.CrossDomainWindowType, 
    /* origin */ java.lang.String, 
    /* data */ js.Object, 
    scala.Unit | typingsSlinky.postRobot.mod.ZalgoPromise[js.Any]
  ]
  
  // Warning: This is not actually a Promise, but the interface is the same.
  type ZalgoPromise[T] = js.Promise[T]
}
