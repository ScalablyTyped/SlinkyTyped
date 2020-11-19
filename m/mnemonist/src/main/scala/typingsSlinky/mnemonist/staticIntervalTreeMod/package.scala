package typingsSlinky.mnemonist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object staticIntervalTreeMod {
  
  type StaticIntervalTreeGetter[T] = js.Function1[/* item */ T, scala.Double]
  
  type StaticIntervalTreeGettersTuple[T] = js.Tuple2[
    typingsSlinky.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGetter[T], 
    typingsSlinky.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGetter[T]
  ]
}
