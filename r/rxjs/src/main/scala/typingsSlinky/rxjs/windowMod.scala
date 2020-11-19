package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/window", JSImport.Namespace)
@js.native
object windowMod extends js.Object {
  
  def window[T](windowBoundaries: Observable[_]): OperatorFunction[T, Observable[T]] = js.native
}
