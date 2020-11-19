package typingsSlinky.mobx

import typingsSlinky.mobx.computedvalueMod.IComputedValue
import typingsSlinky.mobx.computedvalueMod.IComputedValueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/api/computed", JSImport.Namespace)
@js.native
object computedMod extends js.Object {
  
  val computed: IComputed = js.native
  
  val computedDecorator: js.Function = js.native
  
  @js.native
  trait IComputed extends js.Object {
    
    def apply(target: js.Object, key: String): Unit = js.native
    def apply(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, key: js.Symbol): Unit = js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def apply[T](func: js.Function0[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], options: IComputedValueOptions[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], setter: js.Function1[/* v */ T, Unit]): IComputedValue[T] = js.native
    def apply[T](options: IComputedValueOptions[T]): js.Any = js.native
    
    def struct(target: js.Object, key: String): Unit = js.native
    def struct(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def struct(target: js.Object, key: js.Symbol): Unit = js.native
    def struct(target: js.Object, key: js.Symbol, baseDescriptor: js.PropertyDescriptor): Unit = js.native
  }
}
