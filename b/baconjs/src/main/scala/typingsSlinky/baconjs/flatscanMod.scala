package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.Observable
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.typesMod.Function2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatscanMod {
  
  @JSImport("baconjs/types/flatscan", "flatScan")
  @js.native
  def flatScan[In, Out](src: Observable[In], seed: Out, f: Function2[Out, In, Observable[Out] | Out]): Property[Out] = js.native
}
