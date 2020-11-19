package typingsSlinky.mobservable

import typingsSlinky.mobservable.dnodeMod.ViewNode
import typingsSlinky.mobservable.interfacesMod.IContextInfoStruct
import typingsSlinky.mobservable.interfacesMod.Lambda
import typingsSlinky.mobservable.simpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable/lib/observableview", JSImport.Namespace)
@js.native
object observableviewMod extends js.Object {
  
  def throwingViewSetter(name: js.Any): Lambda = js.native
  
  @js.native
  class ObservableView[T] protected () extends ViewNode {
    def this(func: js.Function0[T], scope: js.Object, context: IContextInfoStruct, compareStructural: Boolean) = this()
    
    var _value: T = js.native
    
    var changeEvent: default = js.native
    
    var compareStructural: js.Any = js.native
    
    /* protected */ def func(): T = js.native
    
    def get(): T = js.native
    
    var isComputing: js.Any = js.native
    
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    
    var scope: js.Any = js.native
    
    def set(x: js.Any): Unit = js.native
  }
}
