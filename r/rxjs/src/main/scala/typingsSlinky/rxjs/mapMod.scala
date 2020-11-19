package typingsSlinky.rxjs

import typingsSlinky.rxjs.operatorMod.Operator
import typingsSlinky.rxjs.typesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): OperatorFunction[T, R] = js.native
  def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any): OperatorFunction[T, R] = js.native
  
  @js.native
  class MapOperator[T, R] protected () extends Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: js.Any) = this()
    
    var project: js.Any = js.native
    
    var thisArg: js.Any = js.native
  }
}
