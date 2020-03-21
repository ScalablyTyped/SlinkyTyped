package typingsSlinky.mobservable

import typingsSlinky.mobservable.coreMod.ValueMode
import typingsSlinky.mobservable.dnodeMod.DataNode
import typingsSlinky.mobservable.interfacesMod.IContextInfoStruct
import typingsSlinky.mobservable.interfacesMod.Lambda
import typingsSlinky.mobservable.simpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/observablevalue", JSImport.Namespace)
@js.native
object observablevalueMod extends js.Object {
  @js.native
  class ObservableValue[T] protected () extends DataNode {
    def this(value: T, mode: ValueMode, context: IContextInfoStruct) = this()
    var _value: T = js.native
    var changeEvent: default = js.native
    var mode: ValueMode = js.native
    var value: T = js.native
    def get(): T = js.native
    /* private */ def makeReferenceValueReactive(value: js.Any): js.Any = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(listener: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
    def set(newValue: T): Boolean = js.native
  }
  
}

