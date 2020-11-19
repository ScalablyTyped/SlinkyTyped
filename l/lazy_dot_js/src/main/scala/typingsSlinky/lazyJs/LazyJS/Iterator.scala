package typingsSlinky.lazyJs.LazyJS

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@js.native
trait Iterator[T] extends Instantiable1[/* sequence */ Sequence[T], Iterator[T]] {
  
  def current(): T = js.native
  
  def moveNext(): Boolean = js.native
}
