package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.interceptUtilsMod.IInterceptor
import typingsSlinky.mobx.observablearrayMod.IArrayWillChange
import typingsSlinky.mobx.observablearrayMod.IArrayWillSplice
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observablemapMod.IMapWillChange
import typingsSlinky.mobx.observableobjectMod.IObjectWillChange
import typingsSlinky.mobx.observablesetMod.ISetWillChange
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.mobx.observablevalueMod.IValueWillChange
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "intercept")
@js.native
object intercept extends js.Object {
  def apply(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def apply[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def apply[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def apply[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

