package typingsSlinky.mobx

import typingsSlinky.mobx.interceptUtilsMod.IInterceptor
import typingsSlinky.mobx.internalMod.ObservableMap
import typingsSlinky.mobx.internalMod.ObservableSet
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

@JSImport("mobx/lib/api/intercept", JSImport.Namespace)
@js.native
object interceptMod extends js.Object {
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

