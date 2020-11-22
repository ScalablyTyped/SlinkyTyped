package typingsSlinky.lodash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimitiveChain[T]
  extends LoDashExplicitWrapper[T]
     with _ExpChain[T] {
  
  /**
    * @see _.after
    */
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): FunctionChain[TFunc] = js.native
  
  /**
    * @see _.before
    */
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): FunctionChain[TFunc] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): CollectionChain[T] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): CollectionChain[T] = js.native
}
