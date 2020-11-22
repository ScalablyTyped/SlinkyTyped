package typingsSlinky.arg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Handler[T] = js.Function3[
    /* value */ java.lang.String, 
    /* name */ java.lang.String, 
    /* previousValue */ js.UndefOr[T], 
    T
  ]
  
  type Spec = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsSlinky.arg.mod.Handler[js.Any] | js.Array[typingsSlinky.arg.mod.Handler[js.Any]]
  ]
}
